/*2. Inventario de Alimentos (Control de Caducidad)
Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al 
principio para ser vendidos primero.

La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista (prioridad 
de venta). Si vence en más tiempo, se pone al final.
Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;
        Lista lista = new Lista();

        do {
            System.out.println("\n=================================");
            System.out.println("   INVENTARIO DE ALIMENTOS");
            System.out.println("=================================");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos por vencer (<5 días)");
            System.out.println();
            System.out.println("0. Salir");
            System.out.println("=================================");
            System.out.println("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();

                    Producto nuevo = new Producto(nombre, cantidad, dias);
                    lista.agregarProducto(nuevo);
                    break;

                case 2:
                    System.out.println("\nProductos próximos a vencer:");
                    lista.mostrarPorVencer();
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Inventario de Alimentos!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
