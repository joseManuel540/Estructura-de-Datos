/*Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad"
representadas por una baliza que registra los datos del entorno.

La Clase Estacion (Nodo): Debe contener nombrePunto (String), profundidad (int) y nivelOxigeno (double).
El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron
colocadas (de la más profunda a la entrada).
Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida
que se desapila. Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, el sistema debe imprimir
una alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Rescatistas lista = new Rescatistas();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE BALIZAS ---");
            System.out.println("1. Ver balizas");
            System.out.println("2. Registrar nueva baliza (Push)");
            System.out.println("3. Retirar baliza del tope (Pop)");
            System.out.println("4. Contar balizas");
            System.out.println("5. Retroceder A Superficie");
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
                    System.out.print("profundidad: "); int p = scanner.nextInt();
                    System.out.print("Nivel de oxigeno: "); double DiasV = scanner.nextDouble();
                    scanner.nextLine();
                    lista.push(new Estacion(n,p,DiasV));
                    System.out.println("Baliza apilado correctamente.");
                    break;
                case 3:
                    Estacion retirado = lista.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("La lista está vacío.");
                    }
                    break;
                case 4:
                    System.out.println("Hay un total de: " + lista.getTamanio() + " balizas");
                    break;

                case 5:
                    lista.retrocederASuperficie();
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
