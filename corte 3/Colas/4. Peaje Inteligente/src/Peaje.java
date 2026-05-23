/*El Problema: Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de 
pago.
Reto: Implementa un método cerrarTurno() que extraiga (dequeue) todos los vehículos de la cola, acumule la tarifa 
solo de los que tengan esExento = false e imprima el total recaudado al finalizar. */
public class Peaje {
    private Vehiculo salida;
    private Vehiculo entrada;
    private int tamanio;

    public Peaje() {
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

    public Vehiculo peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía — no hay elemento en salida");
            return null;
        }
        return salida;
    }

    public void enqueue(Vehiculo vehiculo) {
      Vehiculo nuevo = vehiculo;
      if (isEmpty()) {
          salida = nuevo;
          entrada = nuevo;
      } else {
          entrada.siguiente = nuevo;
          entrada = nuevo;
      }
      tamanio++;
    }

    public Vehiculo dequeue() {
      if (isEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Vehiculo dato = salida;
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
      Vehiculo actual = salida;
      while (actual != null) {
            System.out.print("Placa: " + actual.placa + " Tipo: " + actual.tipoVehiculo + " Tarifa: " + actual.tarifa + " Exento: " + actual.esExento);
          if (actual.siguiente != null) 
            System.out.println(" > ");
          actual = actual.siguiente;
      }
      System.out.println(" < Entrada");
    }

    //Reto: Implementa un método cerrarTurno() que extraiga (dequeue) todos los vehículos de la cola, acumule la 
    //tarifa solo de los que tengan esExento = false e imprima el total recaudado al finalizar.
    public void cerrarTurno() {
        if (isEmpty()) {
            System.out.println("[ Cola vacía ]");
            return;
        }
        double tarifaFinal = 0;
        while (!isEmpty()) {
            
            Vehiculo atendido = dequeue();
            if (!atendido.esExento) {
                tarifaFinal = tarifaFinal + atendido.tarifa;
            }
        }
        System.out.println("El total recaudado de vehiculos no exentos es de: " + tarifaFinal);
    }
}
