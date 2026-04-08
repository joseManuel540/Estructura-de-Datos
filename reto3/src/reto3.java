
/*Reto 2: Contar los Nodos
A diferencia de los arreglos, que tienen la propiedad .length, en las listas enlazadas simples 
por lo general no sabemos la cantidad de elementos a menos que la contemos, o que llevemos una 
variable contadora.

Tu misión: Implementa el método public int contarNodos() en tu clase ListaEnlazada. Este 
método debe recorrer toda la lista, sumando 1 por cada nodo que visite, y retornar el total de 
elementos. Pruébalo en tu método main insertando diferentes cantidades de elementos y 
mostrando el resultado por consola. */

import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        ListaEnlazada lista = new ListaEnlazada();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Nuevo nodo");
            System.out.println("2. Calcular cantidad");
            System.out.println();
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el nombre");
                    String nombre = sc.nextLine();

                    Nodo nuevoNodo = new Nodo(nombre);
                    lista.agregar(nuevoNodo);
                    break;
                case 2:
                    int cantidad = lista.calcularCantidad();
                    System.out.println("la cantidad total es " + cantidad);
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Tren de Carga!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
