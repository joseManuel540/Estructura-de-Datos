/*Control de Notas (Selección)
Objetivo: Gestionar las notas de un grupo, encontrar los valores extremos y 
ordenar la lista.
¿Qué debes hacer?
1. Entrada: Pide al usuario 5 notas (números decimales) por teclado.
2. Estadísticas: Recorre el arreglo para encontrar cuál es la nota más alta y 
cuál la más baja del grupo.
3. Ordenamiento: Ordena las notas de menor a mayor usando Selección 
(Selection Sort) */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        
       

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Porfavor ingrese la nota #" + (i+1));
            notas[i] = sc.nextDouble();
        }

        double max = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }

        double min = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < min) {
                min = notas[i];
            }
        }

        System.out.println("La nota mas alta es: "+ max);
        System.out.println("La nota mas baja es : " + min);
        ordenar(notas);
        sc.close();
        System.out.println("Arreglo ordenado: ");
        System.out.println(Arrays.toString(notas));

    }

    public static void ordenar(double[] arr) {
        double n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el primero
            double temp = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = temp;
        }
    }

}
