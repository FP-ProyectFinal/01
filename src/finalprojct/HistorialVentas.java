
package finalprojct;

import java.util.ArrayList;

public class HistorialVentas {
    // Propiedades
    private ArrayList<Venta> historial;
    //Constructor
    public HistorialVentas (){
        this.historial = new ArrayList();
    }
    //agrega ventas
    public void agregarVenta (Venta v) {
        this.historial.add(v);
    }
    //Optiene una venta basado en un index
    public Venta getVentaAt (int index ) {
        return this.historial.get(index);
    }
    // optiene el tamaño del historial ventas
    public int size(){
        return this.historial.size();
    }
    // revisa si el historial de ventas esta vacio
    public boolean isEmpty() {
        return this.historial.isEmpty();
    }
    // resetea el historial de ventas
    public void clear(){
        this.historial.clear();
    }
}
