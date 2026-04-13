/*Gestiona una fila de pacientes donde algunos pueden tener emergencias.

La Clase Paciente (Nodo): Debe contener nombre (String), edad (int) y nivelUrgencia (1 al 5).
El Problema: Los pacientes normalmente se agregan al final. Pero si un paciente tiene 
nivelUrgencia == 5, debe ser movido justo después de la Cabeza.
Reto: Implementa un método que recorra la lista desde la Cola hacia la Cabeza para encontrar 
al paciente de mayor edad y mostrar sus datos. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Fila fila = new Fila();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Fila Interactiva  — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Paciente");
            System.out.println("  [2] Encontrar Paciente con mayor edad");
            System.out.println("  [3] recorrer lista");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nom = sc.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Ingrese el nivel de urgencia (1-5)");
                    int urgencia = sc.nextInt();
                    sc.nextLine();
                    Paciente paciente = new Paciente(nom, edad, urgencia);
                    fila.agregarPaciente(paciente);
                    break;

                case 2:
                    fila.mostrarAtrasEdad();
                    break;

                case 3:
                    System.out.println("La lista recorrida: ");
                    fila.mostrarAdelante();
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
