public class Cliente {
    
    //ATRIBUTOS
    private String nombre;
    private String cedula;
    private String tramite;
    private boolean preferencial;
            
    
    
    //CONSTRUCTOR  
    public Cliente(String nombre, String cedula, String tramite, boolean preferencial){
        this.nombre = nombre;
        this.cedula = cedula;
        this.tramite = tramite;
        this.preferencial = preferencial;
    }
    
    
    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tipoTramite) {
        this.tramite = tramite;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }
    
    
    
    
}
