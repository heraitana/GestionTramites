/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

import java.util.Date;
import javax.swing.JOptionPane;

public class Recepcion {

    private TramiteBase[] tramites;
    private int capacidad;
    private int espaciosTramites;

    public Recepcion(int capacidad) {
        this.capacidad = capacidad;
        this.tramites = new TramiteBase[capacidad];
        this.espaciosTramites = 0;
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

    public int getEspaciosTramites() {
        return espaciosTramites;
    }

    public void setEspaciosTramites(int espaciosTramites) {
        this.espaciosTramites = espaciosTramites;
    }
//Se llame en menu opcion 1 y solicita la info del cliente

    public void agregarTramite() {
        if (espaciosTramites < capacidad) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente N." + (espaciosTramites + 1));
            String cedulaStr = JOptionPane.showInputDialog("Ingrese la cédula del cliente:" + nombre);
            int cedula;
            try {
                cedula = Integer.parseInt(cedulaStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "La cédula ingresada no es válida.");
                return;
            }
            boolean preferencial = JOptionPane.showInputDialog("¿Es un cliente preferencial? (Si / No)").equalsIgnoreCase("si");
            String tipoTramite = JOptionPane.showInputDialog("Ingrese el tipo de trámite:");
            Cliente cliente = new Cliente(nombre, cedula, preferencial);
            boolean estaPagado = false;
            boolean estaDesertado = false;
            TramiteBase tramite = new TramiteBase(cliente, tipoTramite, new Date(), null, null, false, false);

            tramites[espaciosTramites] = tramite;
            espaciosTramites++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más clientes.");
        }
    }

    public TramiteBase getTramite(int index) {
        if (index >= 0 && index < espaciosTramites) {
            return tramites[index];
        } else {
            return null;
        }
    }
//Se utiliza - agrega tramites al arreglo tramiteBase en agregar al cliente
    public void analizarTramitesRecepcion() {
        String tipoCliente = JOptionPane.showInputDialog("¿Desea analizar un trámite de un cliente preferencial (P) o normal (N)?");
        TramiteBase tramiteSeleccionado = null;
        for (int i = 0; i < espaciosTramites; i++) {
            TramiteBase tramite = tramites[i];
            if (tipoCliente.equalsIgnoreCase("P") && tramite.getCliente().getPreferencial()) {
                tramiteSeleccionado = tramite;
                break;
            } else if (tipoCliente.equalsIgnoreCase("N") && !tramite.getCliente().getPreferencial()) {
                tramiteSeleccionado = tramite;
                break;
            }
        }
        // Mover el trámite seleccionado a la fila de atención de Documentos
        if (tramiteSeleccionado != null) {
            moverTramiteADocumentos(tramiteSeleccionado);

            JOptionPane.showMessageDialog(null, "Se analizó y trasladó un trámite a la fila de Documentos.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron trámites del tipo seleccionado en Recepción.");
        }
    }

    private void moverTramiteADocumentos(TramiteBase tramite) {
        // Lógica para mover el trámite a la fila de Documentos

    }

    // Otros métodos 
}
