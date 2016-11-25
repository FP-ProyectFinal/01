/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojct;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Note {
    private PrintWriter writer;
    private DateFormat dateFormat;
    private Date date;
    
    public Note(){
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.date = new Date();
    }
    
    public void crearNotaDeVenta (HistorialVentas ventas){
        String currentDate = this.dateFormat.format(this.date);
        try{
            this.writer = new PrintWriter("cierre_" + currentDate + ".txt", "UTF-8");
            this.writer.println("Historial ventas");
            for(int i = 0; i < ventas.size(); i++) {
                
                this.writer.println( (i+1) + ") Clave de venta: " + ventas.getVentaAt(i).getClave());
                this.writer.println("Precio: " + ventas.getVentaAt(i).getPrecio() + "\t" + "Cantidad: " + ventas.getVentaAt(i).getCantidad());
                this.writer.println("Importe: " + ventas.getVentaAt(i).getImporte());
                this.writer.println("Descripción: ");
                this.writer.println(ventas.getVentaAt(i).getDescripcion());
                this.writer.println("----------------------------------------------------------------");
            }
            this.writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Whoops something went horribly wrong");
        }
    }
    
}
