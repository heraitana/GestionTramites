/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package semana8;

import javax.swing.JOptionPane;

/**
 *
 * @author Franco Coward
 */
public class Aduana01 {

    public static void main(String[] args) {
        //las instancias
        Recepcion recepcion = new Recepcion(10); // Capacidad de recepción: 10
        Documento documento = new Documento(10); // Capacidad de documentos: 10
        Cajas cajas = new Cajas(10); // Capacidad de cajas: 10
        Reportes reportes = new Reportes();
        
        int opcionMenu = 0;

        while (opcionMenu != 6) {
            // Mostrar menú
            String textoMenu = """
                       
                        1. Recepcion
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
                    recepcion.agregarTramite();
                   
                    break;
                case 2:
                    recepcion.analizarTramitesRecepcion();
                    break;
                case 3:
                    documento.analizarTramitesDocumento();
                    break;
                case 4:
                    cajas.analizarTramitesCajas();
                    break;
                case 5:
                    // Entra al submenú de reportes
                    int opcionSubMenu = 0;
                    while (opcionSubMenu != 6) {

                        String textoSubMenu = """
                                        1. Reporte Visual de la Agencia
                                        2. Reporte de Trámites Desertados
                                        3. Reporte de Trámites por Fila
                                        4. Reporte de Trámites Finalizados
                                        5. Reporte de Pagos
                                        6. Volver al Menú Principal
                                      
                                       """;

                        opcionSubMenu = Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu));

                        switch (opcionSubMenu) {
                            case 1:
                                reportes.reporteVisualAgencia(recepcion, documento, cajas);
                                break;
                            case 2:
                                 JOptionPane.showMessageDialog(null, "Elegiste la opción: 2");
                                break;
                            case 3:
                               reportes.generarReporteTramitesPorFila(recepcion, documento, cajas);
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Elegiste la opción: 4");
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Elegiste la opción: 5");
                                break;
                            case 6:
                                // Salir del submenú y volver al menú principal
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error! La opción " + opcionMenu + " no es válida");

            }
        }

    }
}
