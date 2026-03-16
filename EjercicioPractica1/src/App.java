/*Inventario "TecnoStore" (Shell Sort)
Objetivo: Registrar productos y ordenarlos por su ID para realizar búsquedas rápidas.
¿Qué debes hacer?
1. Clase: Crea una clase Producto con: id (int), nombre (String), precio 
(double) y stock (int).
2. Entrada de Datos: Pide al usuario que ingrese los datos de 5 productos por 
teclado y guárdalos en un arreglo Producto[] .
3. Ordenamiento: Usa Shell Sort para ordenar los productos de menor a mayor 
según su id .
4. Búsqueda: Pide un id al usuario y búscalo usando Búsqueda Binaria. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Producto producto[] = new Producto[2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos de los productos");

        for (int i = 0; i < producto.length; i++) {
            System.out.println("\nProducto #" + (i+1));
            System.out.println("Ingrese el id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el stock: ");
            int stock = sc.nextInt();

            Producto p = new Producto(id, nombre, precio, stock);
            producto[i] = p;
        }
        

        System.out.println("\nProductos no ordenados: ");
        MostrarInfo(producto);
        ordenar(producto);
        System.out.println("\nProductos ordenados: ");
        MostrarInfo(producto);

        System.out.println("\nPorfavor ingrese el id a buscar: ");
        int Buscarid = sc.nextInt();
        busquedaBinaria(producto, Buscarid);

        sc.close();

    }

    public static void ordenar(Producto[] arr) {
        int n = arr.length;
        // Empezar con una brecha grande y reducirla
        for (int brecha = n / 2; brecha > 0; brecha /= 2) {
        // Realizar un ordenamiento por inserción para esta brecha
            for (int i = brecha; i < n; i++) {
                Producto temp = arr[i];
                int j;
                for (j = i; j >= brecha && arr[j - brecha].Id > temp.Id; j -= brecha) {
                    arr[j] = arr[j - brecha];
                }
                arr[j] = temp;
            }   
        }
    }

    public static void MostrarInfo(Producto[] producto){
        System.out.println("---------REGISTRO DE PRODUCTOS---------");
        for (int i = 0; i < producto.length; i++) {
            System.out.println("\nProducto #" + (i+1));
            producto[i].MostrarInformacion();
        }
    }


    public static int busquedaBinaria(Producto[] arr, int objetivo) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;   // evita overflow
            if (arr[mid].Id == objetivo) {
                return mid;
                
            } else if (arr[mid].Id < objetivo) {
                low = mid + 1;    
                // buscar en mitad derecha
                
            } else {
                high = mid - 1;   // buscar en mitad izquierda
            }
        }
        return -1;
    }

}
