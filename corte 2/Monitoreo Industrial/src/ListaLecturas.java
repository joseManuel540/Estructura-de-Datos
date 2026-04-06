public class ListaLecturas {
    Lectura cabeza;

    public ListaLecturas(){
        this.cabeza = null;
    }

    public void agregarLectura(Lectura nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
                nuevo.siguiente = cabeza;
                cabeza = nuevo;
            }
    }

    public void mostrarMayorTemperatura() {
        if (cabeza == null) {
            System.out.println("No existen lecturas.");
            return;
        }
        Lectura actual = cabeza;
        Lectura max = cabeza;

        while (actual != null) {
            if (actual.temperatura > max.temperatura) {
                max = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("\nLectura con mayor temperatura:");
        System.out.println("Sensor: " + max.idSensor + " | Temp: " + max.temperatura + " | Presión: " + max.presion + " | Hora: " + max.hora);
    }
}
