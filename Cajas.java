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

public class Cajas {

    private TramiteBase[] tramites;
    private int capacidad;
    private int cantidadTramites;

    public Cajas(int capacidad) {
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



    public TramiteBase getTramite(int index) {
        if (index >= 0 && index < cantidadTramites) {
            return tramites[index];
        } else {
            return null;
        }
    }

    public void analizarTramitesCajas() {
        String tipoCliente = JOptionPane.showInputDialog("¿Desea analizar un trámite de un cliente preferencial (P) o normal (N)?");

        // Busca el primer trámite no desertado en la fila del tipo seleccionado
        TramiteBase tramiteSeleccionado = null;
        for (int i = 0; i < cantidadTramites; i++) {
            TramiteBase tramite = tramites[i];
            if ((tipoCliente.equalsIgnoreCase("P") && tramite.getCliente().getPreferencial())
                    || (tipoCliente.equalsIgnoreCase("N") && !tramite.getCliente().getPreferencial())) {
                if (!tramite.isDesertado()) {
                    tramiteSeleccionado = tramite;
                    break;
                }
            }
        }

    }
    // Otros 
}
