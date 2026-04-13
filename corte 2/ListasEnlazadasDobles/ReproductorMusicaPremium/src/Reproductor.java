/*El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente 
sin tener que recorrer toda la lista desde el principio.
Reto: Implementa un método saltarAtras() que retroceda una posición y saltarAdelante() que 
avance una. Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de error. */
public class Reproductor {
    Cancion cabeza;
    Cancion cola;

    public Reproductor(){
        cabeza = null;
        cola = null;
    }

    public void agregarCancion(Cancion c){
        if (cabeza == null) {
      cabeza = c;
      cola = c;
    } else {
      cola.siguiente = c;
      c.anterior = cola;
      cola = c;
        }
    }

    public Cancion cancionAnterior(Cancion cActual) {
    if (cActual.anterior == null) {
      System.out.println("Esta es la primera foto");
      return cActual;    
    }
    return cActual.anterior;
  }

 
  public Cancion cancionSiguiente(Cancion cActual) {
    if (cActual.siguiente == null) {
      System.out.println("Esta es la ultima foto ");
      return cActual; 
    }
    return cActual.siguiente;
  }

  public void mostrarAdelante() {
        Cancion actual = cabeza;
        while (actual != null) {
            System.out.println("------------------------------------");
            System.out.println(actual.titulo);
            System.out.println(actual.artista);
            System.out.println(actual.duracion);
            actual = actual.siguiente;
        }
        System.out.println("------------------------------------");
    }


}
