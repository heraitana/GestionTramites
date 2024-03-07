import javax.swing.JOptionPane;

public class Proyecto {
        public static void main(String[] args) {
    int opcionMenu = 0;
    
    while (opcionMenu != 6) {
    // Mostrar menú
    String textoMenu = """
                       
                        1. Ingreso de Trámite 
                        2. Análisis de Trámites en Recepción
                        3. Análisis de Trámites en Documentos
                        4. Análisis de Trámites en Caja
                        5. Módulo de Reportes
                        6. Salir
                       
                       """;
            
    opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
    

    // Evaluar la opción
    switch (opcionMenu) {
        
        case 1:
            JOptionPane.showMessageDialog(null, "Elegiste la opción: 1");           
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "Elegiste la opción: 2");
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "Elegiste la opción: 3");
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "Elegiste la opción: 4");
            break;
        case 5:
            JOptionPane.showMessageDialog(null, "Elegiste la opción: 5");
 
            //Variable que almacena opción del usuario
            int opcionSubMenu = 0;
            while (opcionSubMenu != 6)
            {
                
                
                String textoSubMenu = """
                                        1. Reporte Visual de la Agencia
                                        2. Reporte de Trámites Desertados
                                        3. Reporte de Trámites por Fila
                                        4. Reporte de Trámites Finalizados
                                        5. Reporte de Pagos
                                        6. Salir
                                      
                                       """;
                
                opcionSubMenu = Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu));
                
                switch (opcionSubMenu) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción: 1");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción: 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción: 3");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción: 4");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción: 5");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción: 6");
                        break;
                    default:
                        break; 
                } 
            }
            break;
        case 6:
            break;
        default:
            JOptionPane.showMessageDialog(null,"Error! La opción " + opcionMenu + " no es válida");

            }   }

} 
}
        
