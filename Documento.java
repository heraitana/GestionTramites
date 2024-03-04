import javax.swing.JOptionPane;

/**
 *
 * @author heraitana
 */
public class Documento {
    public int posicionFilaDocumento;
    public String estadoDeDocumento;

    public Documento(int posicionFilaDocumento, String estadoDeDocumento) {
        this.posicionFilaDocumento = posicionFilaDocumento;
        this.estadoDeDocumento = estadoDeDocumento;
    }

    public Documento() {}

    public void revisionDocumento() {
        setEstadoDeDocumento(JOptionPane.showInputDialog("Estado del documento (Aprobado/Rechazado): "));            

    }
    public int getPosicionFilaDocumento() {
        return posicionFilaDocumento;
    }

    public void setPosicionFilaDocumento(int posicionFilaDocumento) {
        this.posicionFilaDocumento = posicionFilaDocumento;
    }

    public String getEstadoDeDocumento() {
        return estadoDeDocumento;
    }

    public void setEstadoDeDocumento(String estadoDeDocumento) {
        this.estadoDeDocumento = estadoDeDocumento;
    }

    @Override
    public String toString() {
        return "Estado del documento: " + estadoDeDocumento + "\n"; 
    }


  
    
}
