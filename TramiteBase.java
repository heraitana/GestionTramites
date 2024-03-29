/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author Franco Coward
 */
import javax.swing.JOptionPane;
import java.util.Date;

public class TramiteBase {

    //Atributos
    private Cliente cliente;
    private String tipoTramite;
    private Date fechaHoraIngreso;
    private Date fechaTrasladoDocumentos;
    private Date fechaTrasladoCajas;
    private boolean desertado;
    private boolean pagado;

    public TramiteBase(Cliente cliente, String tipoTramite, Date fechaHoraIngreso, Date fechaTrasladoDocumentos, Date fechaTrasladoCajas, boolean desertado, boolean pagado) {
        this.cliente = cliente;
        this.tipoTramite = tipoTramite;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.fechaTrasladoDocumentos = fechaTrasladoDocumentos;
        this.fechaTrasladoCajas = fechaTrasladoCajas;
        this.desertado = desertado;
        this.pagado = pagado;
    }

    TramiteBase(Cliente cliente, String tipoTramite, Date date, boolean estaPagado, boolean estaDesertado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(Date fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public Date getFechaTrasladoDocumentos() {
        return fechaTrasladoDocumentos;
    }

    public void setFechaTrasladoDocumentos(Date fechaTrasladoDocumentos) {
        this.fechaTrasladoDocumentos = fechaTrasladoDocumentos;
    }

    public Date getFechaTrasladoCajas() {
        return fechaTrasladoCajas;
    }

    public void setFechaTrasladoCajas(Date fechaTrasladoCajas) {
        this.fechaTrasladoCajas = fechaTrasladoCajas;
    }

    public boolean isDesertado() {
        return desertado;
    }

    public void setDesertado(boolean desertado) {
        this.desertado = desertado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void pagado() {
        this.pagado = true;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNombre()
                + ", Cédula: " + cliente.getCedula()
                + ", Preferencial: " + cliente.getPreferencial() 
                + ", Tipo de Trámite: " + tipoTramite 
                + ", Fecha de Ingreso: " + fechaHoraIngreso;
    }

}
