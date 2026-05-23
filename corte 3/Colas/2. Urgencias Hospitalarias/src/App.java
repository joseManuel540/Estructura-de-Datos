/*En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados en una fila de
 atención. Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. Al momento
de llamar a un paciente, el sistema debe mostrar su información completa.

La Clase Paciente (Nodo): Debe contener cedula (String), nombreCompleto (String), edad (int) y sintomaPrincipal
(String).
El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista 
completa en orden de atención.
Reto: Implementa un método atenderTodos() que extraiga (dequeue) a cada paciente uno a uno, imprima su información 
al momento de ser atendido e imprima al final el total de pacientes procesados. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Urgencias pacientes = new Urgencias();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE PACIENTES (COLAS) ---");
            System.out.println("1. Ver pacientes en espera");
            System.out.println("2. Registrar nuevo pacientee (Enqueue)");
            System.out.println("3. Atender un paciente (Dequeue)");
            System.out.println("4. Atender cada paciente uno a uno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    pacientes.imprimir();
                    break;
                case 2:
                    System.out.print("Cedula: "); String cedula = scanner.nextLine();
                    System.out.print("Nombre del paciente: "); String nombre = scanner.nextLine();
                    System.out.print("Edad: "); int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sintoma: "); String sintoma = scanner.nextLine();
                    pacientes.enqueue(new Paciente(cedula, nombre, edad, sintoma));
                    System.out.println("paciente registrada correctamente.");
                    break;
                case 3:
                    Paciente atendida = pacientes.dequeue();
                    if (atendida != null) {
                        System.out.println("\nPaciente atendida:");
                        System.out.println("Cedula: " + atendida.cedula + " Edad: " + atendida.edad + " Nombre: " + atendida.nombreCompleto + " Sintoma: " + atendida.sintomaPrincipal);
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 4:
                    pacientes.antenderTodos();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
