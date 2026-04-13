public class Galeria {
    Fotografia cabeza;
    Fotografia cola;

    public Galeria(){
        cabeza = null;
        cola = null;
    }

    public void agregarFoto(Fotografia foto){
        if (cabeza == null) {
      cabeza = foto;
      cola = foto;
    } else {
      cola.siguiente = foto;
      foto.anterior = cola;
      cola = foto;
    }
    }

  public Fotografia fotoAnterior(Fotografia fotoactual) {
    if (fotoactual.anterior == null) {
      System.out.println("Esta es la primera foto");
      return fotoactual;    
    }
    return fotoactual.anterior;
  }

 
  public Fotografia fotoSiguiente(Fotografia fotoactual) {
    if (fotoactual.siguiente == null) {
      System.out.println("Esta es la ultima foto ");
      return fotoactual; 
    }
    return fotoactual.siguiente;
  }

  public void mostrarAdelante() {
        Fotografia actual = cabeza;
        while (actual != null) {
            System.out.println("------------------------------------");
            System.out.println(actual.nombreArchivo);
            System.out.println(actual.tamañoMB);
            System.out.println(actual.resolucion);
            System.out.println("------------------------------------");
            actual = actual.siguiente;
        }
    }

   
    public void mostrarAtras() {
        Fotografia actual = cola;
        while (actual != null) {
            System.out.println("------------------------------------");
            System.out.println(actual.nombreArchivo);
            System.out.println(actual.tamañoMB);
            System.out.println(actual.resolucion);
            actual = actual.anterior;
        }
    }


}
