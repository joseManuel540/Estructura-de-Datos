/*Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento. 
El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. Si un pedido ya fue cancelado por 
el cliente, debe ser descartado automáticamente al momento de ser procesado.

La Clase Pedido (Nodo): Debe contener numeroPedido (String), cliente (String), totalPagar (double) y cancelado 
(boolean).
El Problema: La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser 
despachados, pero registrados en un conteo.
Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola. Para cada pedido: si cancelado = true, lo 
descarta e incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo sus datos. 
Al finalizar, muestra el total despachado y el total cancelado.*/
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Bodega pedidos = new Bodega();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE BODEGA ---");
            System.out.println("1. Ver pedidos en cola");
            System.out.println("2. Registrar pedido (Enqueue)");
            System.out.println("3. Procesar un pedido (Dequeue)");
            System.out.println("4. Procesar todos los pedidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    pedidos.imprimir();
                    break;

                case 2:
                    System.out.print("Número de pedido: ");
                    String numero = scanner.nextLine();
                    System.out.print("Cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Total a pagar: ");
                    double total = scanner.nextDouble();
                    System.out.print("¿Está cancelado? (true/false): ");
                    boolean cancelado = scanner.nextBoolean();
                    scanner.nextLine();

                    pedidos.enqueue(new Pedido(numero, cliente, total, cancelado));
                    System.out.println("Pedido registrado correctamente.");
                    break;
                case 3:

                    Pedido procesado = pedidos.dequeue();
                    if (procesado != null) {
                        System.out.println("\nPedido procesado:");
                        System.out.println("Numero: " + procesado.numeroPedido +" | Cliente: " + procesado.cliente +" | Total: " + procesado.totalPagar +" | Cancelado: " + procesado.cancelado);
                    } else {
                        System.out.println("La cola está vacía.");
                    }

                    break;

                case 4:
                    pedidos.procesarPedidos();
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
