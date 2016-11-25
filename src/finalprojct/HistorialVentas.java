package finalprojct;
import java.util.ArrayList;
//Contiene los datos de las ventas de todo el dia
public class HistorialVentas {
    // Propiedades
    //Arraylist puede contener objetos de cualquier tipo
    private ArrayList<Venta> historial;
    //En esta caso es un array de tipo venta y se llama historial
    //Constructor
    public HistorialVentas (){
        this.historial = new ArrayList();
    }
    //agrega ventas
    public void agregarVenta (Venta v) {//add es un metodo de arraylist, se utiliza para añadir
        this.historial.add(v);//en este caso al historial
    }
    //Optiene una venta basado en un index
    public Venta getVentaAt (int index ) {//.get es un metodo, 
        //se utiliza para devolver el elemento que esta en la posicion indicada
        return this.historial.get(index);//en este caso index
    }
    // optiene el tamaño del historial ventas
    public int size(){//.size es un metodo, se utiliza para devolver el numero de elementos
        return this.historial.size();//en este caso el numero de ventas
    }
    // revisa si el historial de ventas esta vacio
    public boolean isEmpty() {//.isEmpty es un metodo
        return this.historial.isEmpty();//se utiliza para verificar si la lista tiene elementos
    }
    // resetea el historial de ventas
    public void clear(){//.clear es un metodo
        this.historial.clear();//se utiliza para eliminar todo los elementos
    }
}
