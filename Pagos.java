import java.util.Date;
/**
 *
 * @author Franco Coward
 */
public class Pagos {

    private Cliente tramite;
    private double montoPagado;
    private Date fechaPago; 

    public Pagos(Cliente tramite, double montoPagado, Date fechaPago) {
        this.tramite = tramite;
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
    }

    public Cliente getTramite() {
        return tramite;
    }

    public void setTramite(Cliente tramite) {
        this.tramite = tramite;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

}
