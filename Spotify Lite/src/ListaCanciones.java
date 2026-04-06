public class ListaCanciones {
    Cancion cabeza;
    Cancion actual;

    public ListaCanciones() {
        cabeza = null;
        actual = null;
    }

    public void agregarAlFinal(Cancion nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
        }
    }

    public void agregarDespuesActual(Cancion nueva) {
        if (actual == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            nueva.siguiente = actual.siguiente;
            actual.siguiente = nueva;
        }
    }

    public void mostrarDuracionTotal() {
        int total = 0;
        Cancion temp = cabeza;

        while (temp != null) {
            total += temp.duracionSegundos;
            temp = temp.siguiente;
        }

        int minutos = total / 60;
        int segundos = total % 60;

        System.out.printf("Duración total: %02d:%02d\n", minutos, segundos);
    }
    
    public void mostrar(){
        Cancion actuall=cabeza;

        while (actuall != null) {
            System.out.println("\nTitulo: " + actuall.titulo + "\nArtista: " + actuall.artista + "\nDuracion segundos: " + actuall.duracionSegundos + "\nGenero: " + actuall.genero);
            actuall = actuall.siguiente;
        }
    }

}
