package finalprojct;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
//Contiene los datos de la nota
public class Note {
    private PrintWriter writer;
    private DateFormat dateFormat;//DateFormat permite elegir el formato de la fecha
    private Date date;
    //Date es una clase que representa la fecha con precisión 
    //(permite obtener la fecha actual) viene de java.util.Date
    public Note(){
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.date = new Date();
    }
    //crearNotaDeVenta se encarga de imprimir en un documento
    public void crearNotaDeVenta (HistorialVentas ventas){
        String currentDate = this.dateFormat.format(this.date);
        try{
            this.writer = new PrintWriter("cierre_" + currentDate + ".txt", "UTF-8");
            this.writer.println("Historial ventas");
            for(int i = 0; i < ventas.size(); i++) {
             //ventas.size se refiere al historial de ventas, es para recorrer lo que ya se tiene   
                this.writer.println( (i+1) + ") Clave de venta: " + ventas.getVentaAt(i).getClave());
                this.writer.println("Precio: " + ventas.getVentaAt(i).getPrecio() + "\t" + "Cantidad: " + ventas.getVentaAt(i).getCantidad());
                this.writer.println("Importe: " + ventas.getVentaAt(i).getImporte());
                this.writer.println("Descripción: ");
                this.writer.println(ventas.getVentaAt(i).getDescripcion());
                this.writer.println("----------------------------------------------------------------");
            }//en esta parte del codigo se esta imprimiendo en el documento la informacion introducida de la venta
            this.writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Whoops something went horribly wrong");
        }
    }  
}
