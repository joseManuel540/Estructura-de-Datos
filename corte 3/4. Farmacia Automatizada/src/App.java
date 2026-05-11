/*En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores
 verticales. El personal introduce las cajas por la parte superior y las retira de la misma forma
(el último lote en llegar es el primero en ser despachado).

La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer,
debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope
 sea un medicamento seguro o la pila quede vacía. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Farmacia lista = new Farmacia();
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
        } while (opcion != 5);

        scanner.close();
    }
}
