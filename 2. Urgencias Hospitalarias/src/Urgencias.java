/*El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista 
completa en orden de atención.
Reto: Implementa un método atenderTodos() que extraiga (dequeue) a cada paciente uno a uno, imprima su información 
al momento de ser atendido e imprima al final el total de pacientes procesados. */
public class Urgencias {
    private Paciente salida;
    private Paciente entrada;    
    private int tamanio;

    public Urgencias() {
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

    public Paciente peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía — no hay elemento en salida");
            return null;
        }
        return salida;
    }

    public void enqueue(Paciente paciente) {
      Paciente nuevo = paciente;
      if (isEmpty()) {
          salida = nuevo;   
          entrada = nuevo;
      } else {
          entrada.siguiente = nuevo;
          entrada = nuevo;
      }
      tamanio++;
    }

    public Paciente dequeue() {
      if (isEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Paciente dato = salida;
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
      Paciente actual = salida;
      while (actual != null) {
          System.out.print("Cedula:" + actual.cedula + " Nombre:" + actual.nombreCompleto + " edad: " + actual.edad + " Sintoma: " + actual.sintomaPrincipal);
          if (actual.siguiente != null) 
            System.out.println(" > ");
          actual = actual.siguiente;
      }
      System.out.println(" < Entrada");
    }

    public void antenderTodos(){
        int tamaño = 0;
        Paciente actual = salida;
        while (actual != null) {
            Paciente atendido = dequeue();
            if (atendido != null) {
                System.out.println("Cedula:" + atendido.cedula + " Nombre:" + atendido.nombreCompleto + " edad: " + atendido.edad + " Sintoma: " + atendido.sintomaPrincipal);
                tamaño = tamaño + 1;
                System.out.println("Paciente atendido con exito");
            }
            actual = actual.siguiente;
        }
        System.out.println("Se atendieron un total de: " + tamaño + " Pacientes");
    }
}
