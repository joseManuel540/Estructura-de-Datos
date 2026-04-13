/*El Problema: Los pacientes normalmente se agregan al final. Pero si un paciente tiene 
nivelUrgencia == 5, debe ser movido justo después de la Cabeza.
Reto: Implementa un método que recorra la lista desde la Cola hacia la Cabeza para encontrar 
al paciente de mayor edad y mostrar sus datos. */
public class Fila {
    Paciente cabeza;
    Paciente cola;

    public Fila(){
        cabeza = null;
        cola = null;
    }

    public void agregarPaciente(Paciente paciente){
        if (cabeza == null) {
      cabeza = paciente;
      cola = paciente;
    } else if (paciente.nivelUrgencia == 5) {
        paciente.siguiente = cabeza.siguiente;
        cabeza.siguiente.anterior = paciente;
        cabeza.siguiente = paciente;
        paciente.anterior = cabeza;
        System.out.println("Paciente agregado con prioridad por nivel de urgencia");
    } else {
      cola.siguiente = paciente;
      paciente.anterior = cola;
      cola = paciente;
    }
    
    }

    public void mostrarAtrasEdad() {
        int edadmayor = 0;
        Paciente actual = cabeza;
        Paciente mayor = null;
        
        while (actual != null) {
            if (actual.edad > edadmayor) {
                edadmayor = actual.edad;
                mayor = actual;
            }
            actual = actual.siguiente;
        }
        
        if (mayor != null) {
            System.out.println("El paciente con mayor edad tiene: " + edadmayor);
            System.out.println("-------------------------------------------------");
            System.out.println("nombre: " + mayor.nombre);
            System.out.println("edad: " + mayor.edad);
            System.out.println("Nivel Urgencia: " + mayor.nivelUrgencia);
        }else{
            System.out.println("No hay pacientes en la fila");
        } 

    }

    public void mostrarAdelante() {
        Paciente actual = cabeza;
        while (actual != null) {
            System.out.println("------------------------------------");
            System.out.println(actual.nombre);
            System.out.println(actual.edad);
            System.out.println(actual.nivelUrgencia);
            actual = actual.siguiente;
        }
    }

   
}
