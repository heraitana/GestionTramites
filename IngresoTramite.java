

import javax.swing.JOptionPane;

public class IngresoTramite {
    public String tipoDeTramite;
    public String timeStampIngreso;
    public String timeStampTraslado;
    public Cliente cliente;

    public IngresoTramite(String tipoDeTramite, String timeStampIngreso, String timeStampTraslado, Cliente cliente) {
        this.tipoDeTramite = tipoDeTramite;
        this.timeStampIngreso = timeStampIngreso;
        this.timeStampTraslado = timeStampTraslado;
        this.cliente = cliente;
    }

    public IngresoTramite() {
        
    }

    public void registroDeDatos() {
 
        setTipoDeTramite(JOptionPane.showInputDialog("""
                                                         Digite el tipo de trámite:
                                                         1. Registro exportador
                                                         2. Exoneración de impuestos
                                                         3. Activación de Registro de Importador
                                                         4. Permisos especiales productos"""));

        setTimeStampIngreso(JOptionPane.showInputDialog("Digite la fecha y hora de ingreso(Formato MM/DD/YYYY, HH/MM)"));      
        setTimeStampTraslado(JOptionPane.showInputDialog("Digite la fecha y hora de ingreso(Formato MM/DD/YYYY, HH/MM)"));      

        
    }

    
    private String textoTipoTramite() {
        return switch (tipoDeTramite) {
            case "1" -> "Registro exportador";
            case "2" -> "Exoneración de impuestos";
            case "3" -> "Activación de Registro de Importador";
            case "4" -> "Permisos especiales productos";
            default -> "Tipo de trámite no reconocido";
        };
    }   

    public String getTipoDeTramite() {
        return tipoDeTramite;
    }

    public void setTipoDeTramite(String tipoDeTramite) {
        this.tipoDeTramite = tipoDeTramite;
    }

    public String getTimeStampIngreso() {
        return timeStampIngreso;
    }

    public void setTimeStampIngreso(String timeStampIngreso) {
        this.timeStampIngreso = timeStampIngreso;
    }

    public String getTimeStampTraslado() {
        return timeStampTraslado;
    }

    public void setTimeStampTraslado(String timeStampTraslado) {
        this.timeStampTraslado = timeStampTraslado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        String descripcion = textoTipoTramite();
        return "Tipo de Tramite: " + tipoDeTramite + " - " + descripcion + "\n" +
               "Fecha y hora de ingreso: " + timeStampIngreso + "\n" +
               "Fecha y hora de traslado: " + timeStampTraslado + "\n";
    }
}
