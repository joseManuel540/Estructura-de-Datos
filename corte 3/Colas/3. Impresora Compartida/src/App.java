/*En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. Cada vez que 
alguien envía un documento, este se agrega al final de la cola de impresión. La impresora procesa los trabajos en 
el orden exacto en que fueron recibidos.

La Clase Documento (Nodo): Debe contener nombreArchivo (String), usuario (String), numeroPaginas (int) y esColor 
(boolean).
El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión 
pendiente.
Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de todos 
los documentos en espera, sin alterar la cola. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Impresion documentos = new Impresion();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE COLA DE IMPRESION ---");
            System.out.println("1. Ver documentos en cola");
            System.out.println("2. Agregar documento (Enqueue)");
            System.out.println("3. Imprimir documento (Dequeue)");
            System.out.println("4. Calcular páginas totales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    documentos.imprimir();
                    break;

                case 2:

                    System.out.print("Nombre del archivo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();

                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = scanner.nextBoolean();

                    scanner.nextLine();

                    documentos.enqueue(new Documento(nombre, usuario, paginas, color));

                    System.out.println("Documento agregado correctamente.");
                    break;

                case 3:

                    Documento impreso = documentos.dequeue();

                    if (impreso != null) {
                        System.out.println("\nDocumento impreso:");
                        System.out.println("Archivo: " + impreso.nombreArchivo + " | Usuario: " + impreso.usuario + " | Páginas: " + impreso.numeroPaginas + " | Color: " + impreso.esColor);

                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;

                case 4:
                    documentos.calcularPaginasTotales();
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
