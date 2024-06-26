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

public class Documento {

    private TramiteBase[] tramites;
    private int capacidad;
    private int cantidadTramites;

    public Documento(int capacidad) {
        this.capacidad = capacidad;
        this.tramites = new TramiteBase[capacidad];
        this.cantidadTramites = 0;
    }

    public TramiteBase[] getTramites() {
        return tramites;
    }

    public void setTramites(TramiteBase[] tramites) {
        this.tramites = tramites;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadTramites() {
        return cantidadTramites;
    }

    public void setCantidadTramites(int cantidadTramites) {
        this.cantidadTramites = cantidadTramites;
    }

    public void agregarTramite(TramiteBase tramite) {
        if (cantidadTramites < capacidad) {
            tramites[cantidadTramites] = tramite;
            cantidadTramites++;
            JOptionPane.showMessageDialog(null, "Trámite agregado a la fila de Documentos.");
        } else {
            JOptionPane.showMessageDialog(null, "La fila de Documentos está llena. No se puede agregar más trámites.");
        }
    }

    public TramiteBase getTramite(int index) {
        if (index >= 0 && index < cantidadTramites) {
            return tramites[index];
        } else {
            return null;
        }
    }

    public void analizarTramitesDocumento() {
        // Solicitar al agente si desea analizar un trámite de un cliente preferencial o normal
        String tipoCliente = JOptionPane.showInputDialog("¿Desea analizar un trámite de un cliente preferencial (P) o normal (N)?");

        // Buscar el primer trámite en la fila del tipo seleccionado
        TramiteBase tramiteSeleccionado = null;
        for (int i = 0; i < cantidadTramites; i++) {
            TramiteBase tramite = tramites[i];
            if (tipoCliente.equalsIgnoreCase("P") && tramite.getCliente().getPreferencial()) {
                tramiteSeleccionado = tramite;
                break;
            } else if (tipoCliente.equalsIgnoreCase("N") && !tramite.getCliente().getPreferencial()) {
                tramiteSeleccionado = tramite;
                break;
            }
        }

        if (tramiteSeleccionado != null) {
            atenderTramite(tramiteSeleccionado);

            JOptionPane.showMessageDialog(null, "Se analizó y atendió un trámite en la fila de Documentos.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron trámites del tipo seleccionado en Documentos.");
        }
    }

    private void atenderTramite(TramiteBase tramite) {
        // Lógica para traladar el cliente

    }
    // Otros métodos 
}
