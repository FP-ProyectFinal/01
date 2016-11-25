package finalprojct;
//Contiene los datos de la venta
//La definición de una clase especifica cómo serán los objetos de dicha clase,
//esto es, de que variables y de que métodos constarán. 
//Indica el nombre de la clase precedido por la palabra clave class
//El cuerpo de la clase sigue a la declaración de la clase y está contenido entre la pareja de llaves ({ y }). 
//El cuerpo de la clase contiene las declaraciones de las variables de la clase, 
//y también la declaración y la implementación de los métodos que operan sobre dichas variables.
//Las variables de instancia se declaran dentro del cuerpo de la clase. 
//Típicamente, las variables de instancia se declaran antes de la declaración de los método.
public class Venta {
    // Propiedades
    private String clave;
    private double precio;
    private int cantidad;
    private String descripcion;
    private double importe;
    // Constructor
    //Un constructor es un tipo específico de método que siempre tiene el mismo nombre que la clase, 
    //y que se utiliza cuando se desean crear objetos de dicha clase, es decir, 
    //se utiliza al crear e iniciar un objeto de una clase. 
    public Venta(String clave, double precio, String descripcion, int cantidad, double importe){
        this.clave = clave;//this se usa para garantizar que 
        this.precio = precio;//accedemos al campo adecuado en lugar de al parámetro del método
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    // Obtiene la cantidad
    public int getCantidad() {//get (mostrar) el valor de un atributo
        return cantidad;
    }
    // actualiza la cantidad
    public void setCantidad(int cantidad) {//set (modificar) el valor de un atributo
        this.cantidad = cantidad;
    }
    // Obtiene la clave
    public String getClave() {
        return clave;
    }
    // actualiza la clave
    public void setClave(String clave) {
        this.clave = clave;
    }
    // obtiene el precio
    public double getPrecio() {
        return precio;
    }
    // Actualiza el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Optiene la description
    public String getDescripcion() {
        return descripcion;
    }
    //Actualiza la descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // optiene el importe
    public double getImporte() {
        return importe;
    }
    // actualiza el importe
    public void setImporte(double importe) {
        this.importe = importe;
    }    
    //El nombre del método siempre sera get o set y a continuación el nombre del atributo, 
    //su modificador siempre es public ya que queremos mostrar o modificar desde fuera la clase
    //Los metodos proporcionan acceso a los atributos
}
