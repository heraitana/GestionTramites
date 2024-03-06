import java.util.Date;

/**
 *
 * @author Franco Coward
 */
public class TramiteBase {
    //Atributos
    private Date fecha;
    private Cliente tramite; //tipo de tramite que viene de la clase Cliente
    private Date fechaTraslado;

    //Constructor
    public TramiteBase(Date fecha, Cliente tramite, Date fechaTraslado) {
        this.fecha = fecha;
        this.tramite = tramite;
        this.fechaTraslado = fechaTraslado;
    }

    //Getter y Settrer
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getTramite() {
        return tramite;
    }

    public void setTramite(Cliente tramite) {
        this.tramite = tramite;
    }

    public Date getFechaTraslado() {
        return fechaTraslado;
    }

    public void setFechaTraslado(Date fechaTraslado) {
        this.fechaTraslado = fechaTraslado;
    }
    
    
    //Metodo para mover de fila 
}
