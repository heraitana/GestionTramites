import javax.swing.JOptionPane;

public class Cliente {
    public String nombre;
    public Boolean clientePreferencial = false;
    public String cedula;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Cliente() {}

    public void registroDeDatos() {
        setNombre(JOptionPane.showInputDialog("Digite el nombre:"));
        setCedula(JOptionPane.showInputDialog("Digite la cédula:"));
        verificarTipoCliente();
    }

    public void verificarTipoCliente() {
        String respuesta = JOptionPane.showInputDialog("Desea analizar un trámite de un cliente preferencial? (Si/No):");
        this.clientePreferencial = respuesta.equalsIgnoreCase("Si");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getClientePreferencial() {
        return clientePreferencial;
    }

    public void setClientePreferencial(Boolean clientePreferencial) {
        this.clientePreferencial = clientePreferencial;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    

    @Override
    public String toString() {
        String textoClientePreferencial = (clientePreferencial ? "Si" : "No");
        return "Nombre: " + nombre + "\n" +
               "Cédula: " + cedula + "\n" +
               "Cliente Preferencial: " + textoClientePreferencial + "\n";
    }
}
