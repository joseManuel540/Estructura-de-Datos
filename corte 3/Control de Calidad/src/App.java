/*Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. Un sensor de visión
 artificial inspecciona cada pieza después de ser colocada.

    La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
    El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar la
 primera que tenga esDefectuosa = true. El método debe imprimir el nombre de todas las piezas "buenas" que tuvieron
  que ser retiradas y descartadas antes de llegar a la pieza fallida. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Sensor lista = new Sensor();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE LINEA DE ENSAMBLAJE ---");
            System.out.println("1. Ver contenedores piezas");
            System.out.println("2. Registrar nueva pieza (Push)");
            System.out.println("3. Retirar pieza del tope (Pop)");
            System.out.println("4. Contar piezas");
            System.out.println("5. Limpiar Hasta Pieza Defectuosa");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    lista.imprimir();
                    break;
                case 2:
                    System.out.print("Nombre: "); String n = scanner.nextLine();
                    System.out.print("Numero de serie: "); String num = scanner.nextLine();
                    System.out.print("Esta defectuosa? (true/false) : "); boolean esD = scanner.nextBoolean();
                    scanner.nextLine();
                    lista.push(new Pieza(n, num, esD));
                    System.out.println("Pieza apilada correctamente.");
                    break;
                case 3:
                    Pieza retirado = lista.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("El muelle está vacío.");
                    }
                    break;
                case 4:
                    System.out.println("Hay un total de: " + lista.getTamanio() + " Piezas");
                    break;

                case 5:
                    lista.limpiarHastaDefectuoso();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
