public class Mascota {
    public int Historial;
    public String Nombre;
    public int Edad;

    public Mascota(int historial, String nombre, int edad){
        this.Historial = historial;
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public void MostrarInformacion(){
        System.out.println("H: " + this.Historial + " | " + "Nombre: " + this.Nombre + " | " + "Edad: " + this.Edad );
    }
}
