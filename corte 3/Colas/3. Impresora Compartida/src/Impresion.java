/*El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión 
pendiente.
Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de todos 
los documentos en espera, sin alterar la cola. */

public class Impresion {
    private Documento salida;
    private Documento entrada;
    private int tamanio;

    public Impresion() {
        salida = null;
        entrada = null;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public int size() {
        return tamanio;
    }

    public Documento peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía — no hay elemento en salida");
            return null;
        }
        return salida;
    }

    public void enqueue(Documento documento) {
      Documento nuevo = documento;
      if (isEmpty()) {
          salida = nuevo;
          entrada = nuevo;
      } else {
          entrada.siguiente = nuevo;
          entrada = nuevo;
      }
      tamanio++;
    }

    public Documento dequeue() {
      if (isEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Documento dato = salida;
      salida = salida.siguiente;
      if (salida == null) {
          entrada = null;
      }
      tamanio--;
      return dato;
    }

    public void imprimir() {
      if (isEmpty()) {
          System.out.println("[ Cola vacía ]");
          return;
      }
      System.out.print("Salida > ");
      Documento actual = salida;
      while (actual != null) {
            System.out.print("Nombre: " + actual.nombreArchivo + " Usuario: " + actual.usuario + " Numero de paginas: " + actual.numeroPaginas + " A color: " + actual.esColor);
          if (actual.siguiente != null) 
            System.out.println(" > ");
          actual = actual.siguiente;
      }
      System.out.println(" < Entrada");
    }

    //Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de 
    //todos los documentos en espera, sin alterar la cola.
    public void calcularPaginasTotales() {
        if (isEmpty()) {
          System.out.println("[ Cola vacía ]");
          return;
        }
      int nPaginas = 0;
      Documento actual = salida;
      while (actual != null) {
          nPaginas = nPaginas + actual.numeroPaginas;
          actual = actual.siguiente;
        }
        System.out.println("La suma de paginas de todos los documentos en espera es de: " + nPaginas);
    }
}
