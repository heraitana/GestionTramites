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

public class Reportes {
    
    public void reporteVisualAgencia(Recepcion recepcion, Documento documento, Cajas cajas) {
        String reporte = "Reporte Visual de la Agencia:\n\n";
        
        reporte += "Recepción:\n" + generarEstadoFila(recepcion) + "\n";
        reporte += "Documentos:\n" + generarEstadoFila(documento) + "\n";
        reporte += "Cajas:\n" + generarEstadoFila(cajas);
        
        JOptionPane.showMessageDialog(null, reporte);
    }
    
    private String generarEstadoFila(Recepcion recepcion) {
        String estadoFila = "";
        for (int i = 0; i < recepcion.getCapacidad(); i++) {
            if (recepcion.getTramite(i) != null) {
                String tipoCliente = recepcion.getTramite(i).getCliente().getPreferencial()? "P" : "N";
                estadoFila += "[" + tipoCliente + "] ";
            } else {
                estadoFila += "[ ] ";
            }
        }
        return estadoFila;
    }
    
    private String generarEstadoFila(Documento documento) {
        String estadoFila = "";
        for (int i = 0; i < documento.getCapacidad(); i++) {
            if (documento.getTramite(i) != null) {
                String tipoCliente = documento.getTramite(i).getCliente().getPreferencial() ? "P" : "N";
                estadoFila += "[" + tipoCliente + "] ";
            } else {
                estadoFila += "[ ] ";
            }
        }
        return estadoFila;
    }
    
    private String generarEstadoFila(Cajas cajas) {
        String estadoFila = "";
        for (int i = 0; i < cajas.getCapacidad(); i++) {
            if (cajas.getTramite(i) != null) {
                String tipoCliente = cajas.getTramite(i).getCliente().getPreferencial() ? "P" : "N";
                estadoFila += "[" + tipoCliente + "] ";
            } else {
                estadoFila += "[ ] ";
            }
        }
        return estadoFila;
    }
    
     // Método para generar el reporte de trámites por fila
    public void generarReporteTramitesPorFila(Recepcion recepcion, Documento documento, Cajas cajas) {
        // Construir el mensaje para la fila de Recepción
        String mensajeRecepcion = "Trámites en la fila de Recepción:\n" + generarMensajePorFila(recepcion.getTramites(), recepcion.getEspaciosTramites());

        // Construir el mensaje para la fila de Documentos
        String mensajeDocumentos = "Trámites en la fila de Documentos:\n" + generarMensajePorFila(documento.getTramites(), documento.getCantidadTramites());

        // Construir el mensaje para la fila de Cajas
        String mensajeCajas = "Trámites en la fila de Cajas:\n" + generarMensajePorFila(cajas.getTramites(), cajas.getCantidadTramites());

        // Mostrar los mensajes de las tres filas en un cuadro de diálogo emergente
        JOptionPane.showMessageDialog(null, mensajeRecepcion + "\n\n" + mensajeDocumentos + "\n\n" + mensajeCajas);
    }
    private String generarMensajePorFila(TramiteBase[] tramites, int cantidadTramites) {
    String mensaje = "";
    for (int i = 0; i < cantidadTramites; i++) {
        mensaje += tramites[i].toString() + "\n";
    }
    return mensaje;
}
    // Otros métodos para generar los demás reportes
}
 