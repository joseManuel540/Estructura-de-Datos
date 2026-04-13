public class Navegacion {
    Pestana cabeza;
    Pestana cola;

    public Navegacion(){
        cabeza = null;
        cola = null;
    }

    public void agregarPestana(Pestana pestana){
        if (cabeza == null) {
      cabeza = pestana;
      cola = pestana;
    } else {
      cola.siguiente = pestana;
      pestana.anterior = cola;
      cola = pestana;
    }
    }

  public void mostrarAdelante() {
        Pestana actual = cabeza;
        while (actual != null) {
            System.out.println("------------------------------------");
            System.out.println(actual.tituloPagina);
            System.out.println(actual.url);
            System.out.println(actual.horaApertura);
            actual = actual.siguiente;
        }
    }

   
    public void mostrarAtras() {
        Pestana actual = cola;
        while (actual != null) {
            System.out.println("------------------------------------");
            System.out.println(actual.tituloPagina);
            System.out.println(actual.url);
            System.out.println(actual.horaApertura);
            actual = actual.anterior;
        }
    }

    public void cerrarPestanaActual(String url) {
    Pestana actual = cabeza;
    while (actual != null) {
        if (actual.url.equals(url)) {

            if (actual.anterior == null && actual.siguiente == null) {
                cabeza = null;
                cola = null;
            }
            else if (actual.anterior == null) {
                cabeza = actual.siguiente;
                cabeza.anterior = null;
            } 
            else if (actual.siguiente == null) {
                cola = actual.anterior;
                cola.siguiente = null;
            } 
            else {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            }
            System.out.println("Pestaña eliminada con éxito!");
            return;
        }
        actual = actual.siguiente;
    }

    System.out.println("No se encontró la pestaña.");
}
}
