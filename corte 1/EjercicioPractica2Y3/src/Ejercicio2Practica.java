/*Competencia de Atletismo (Inserción)
Objetivo: Ingresar puntajes y organizarlos de mayor a menor para determinar el 
podio.
¿Qué debes hacer?
1. Entrada: Pide al usuario que ingrese 6 puntajes (números enteros) por teclado.
2. Ordenamiento: Usa Inserción (Insertion Sort) para ordenar los puntajes de 
mayor a menor.
3. Búsqueda: Pide un puntaje al usuario y búscalo usando Búsqueda Lineal. 
Indica en qué posición (lugar) de la tabla quedó. */

import java.util.Scanner;

public class Ejercicio2Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puntajes = new int[6];
        int total = 0;
        boolean encontados = false;

        for (int i = 0; i < puntajes.length; i++) {
            System.out.println("Porfavor ingrese el puntaje #" + (i+1));
            puntajes[i] = sc.nextInt();
        }

        System.out.println("\n------ INGRESO DE PUNTAJES ------");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.println("Puntaje del intento #" + (i+1) + " = " + puntajes[i]);
        }
        ordenar(puntajes);
        System.out.println("\nTabla de resultados de mayor a menor");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.println( (i+1) + ". Lugar " + " = " + (puntajes[puntajes.length-1-i]));
            total = total + puntajes[i];
        }

        System.out.println("\nEl promedio es de: "+ (total/puntajes.length));

        System.out.println("Porfavor ingrese el puntaje a buscar: ");
        int buscar = sc.nextInt();
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == buscar) {
                System.out.println("Se encontro el puntaje y esta en la posicion: " + (puntajes.length-i));
                encontados = true;
            }
        }
        if (!encontados) {
            System.out.println("El puntaje no se encontro");
        }

        sc.close();
    }

    

    public static void ordenar(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            // Mueve los elementos de arr[0..i-1], que son mayores que key,
            // una posición adelante de su posición actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
