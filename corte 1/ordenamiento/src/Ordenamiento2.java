/*Organización de Biblioteca Dinámica
Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante
en su posición correcta.
Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN 
(número entero) de cada uno.
Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, 
el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya
están a su izquierda.
Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va 
quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver 
cómo los elementos se desplazan para abrir espacio al nuevo valor. */

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Porfavor ingrese la cantidad de libros que contiene la caja: ");
        int cantidad = sc.nextInt();

        int[] ISBN = new int[cantidad];
        
        for (int i = 0; i < ISBN.length; i++) {
            System.out.println("Porfavor ingrese el ISBN del libro # " + (i+1));
            ISBN[i] = sc.nextInt();
            int key = ISBN[i];
            int j = i - 1;
            // Mueve los elementos de arr[0..i-1], que son mayores que key,
            // una posición adelante de su posición actual
            while (j >= 0 && ISBN[j] > key) {
            ISBN[j + 1] = ISBN[j];
            j = j - 1;
            }
            ISBN[j + 1] = key;
            System.out.println(Arrays.toString(ISBN));
            
        }
        sc.close();

    }

    
    public static void ordenar(int[] arr) {
        //InsertionSort
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
