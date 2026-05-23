/*El Problema: La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser 
despachados, pero registrados en un conteo.
Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola. Para cada pedido: si cancelado = true, lo 
descarta e incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo sus datos. 
Al finalizar, muestra el total despachado y el total cancelado.*/
public class Bodega {
    private Pedido salida;
    private Pedido entrada;    
    private int tamanio;

    public Bodega() {
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

    public Pedido peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía — no hay elemento en salida");
            return null;
        }
        return salida;
    }

    public void enqueue(Pedido pedido) {
      Pedido nuevo = pedido;
      if (isEmpty()) {
          salida = nuevo;   
          entrada = nuevo;
      } else {
          entrada.siguiente = nuevo;
          entrada = nuevo;
      }
      tamanio++;
    }

    public Pedido dequeue() {
      if (isEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Pedido dato = salida;
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
      Pedido actual = salida;
      while (actual != null) {
          System.out.print("Numero: " + actual.numeroPedido + " Cliente: " + actual.cliente + " Total a pagar: " + actual.totalPagar + " Cancelado: " + actual.cancelado);
          if (actual.siguiente != null) 
            System.out.println(" > ");
          actual = actual.siguiente;
      }
      System.out.println(" < Entrada");
    }

    //Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola. Para cada pedido: si cancelado = 
    // true, lo descarta e incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo 
    // sus datos. Al finalizar, muestra el total despachado y el total cancelado.

    public void procesarPedidos(){
        if (isEmpty()) {
          System.out.println("[ Cola vacía ]");
          return;
        }

        int cancelados = 0;
        int despachado = 0;
        while (!isEmpty()) {
            Pedido atendido = dequeue();
            if (!atendido.cancelado) {
                System.out.println("Numero: " + atendido.numeroPedido + " Cliente: " + atendido.cliente + " Total a pagar: " + atendido.totalPagar + " Cancelado: " + atendido.cancelado);
                System.out.println("Pedido despachado con exito");
                System.out.println();
                despachado = despachado + 1;
            }else{
                System.out.println("El pedido " + atendido.numeroPedido + " fue descartado por cancelación");
                System.out.println();
                cancelados = cancelados + 1;
            }
        }
        System.out.println("Total de pedidos despachados: " + despachado);
        System.out.println("Total de pedidos cancelados: " + cancelados);
    }
}
