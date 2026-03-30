public class Producto {
    public int Id;
    public String Nombre;
    public double Precio;
    public int Stock;

    public Producto(int id, String nombre, double precio, int stock){
        this.Id = id;
        this.Nombre = nombre;
        this.Precio = precio;
        this.Stock = stock;
    }

    public void MostrarInformacion(){
        System.out.println("Id: " + this.Id);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Precio: " + this.Precio);
        System.out.println("Stock: " + this.Stock);
    }
}
