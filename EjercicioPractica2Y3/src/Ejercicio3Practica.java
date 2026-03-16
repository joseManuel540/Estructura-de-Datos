/*Control de Notas (Selección)
Objetivo: Gestionar las notas de un grupo, encontrar los valores extremos y 
ordenar la lista.
¿Qué debes hacer?
1. Entrada: Pide al usuario 5 notas (números decimales) por teclado.
2. Estadísticas: Recorre el arreglo para encontrar cuál es la nota más alta y 
cuál la más baja del grupo.
3. Ordenamiento: Ordena las notas de menor a mayor usando Selección 
(Selection Sort) */

import java.util.Scanner;

public class Ejercicio3Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double max = 0;
        double min = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Porfavor ingrese la nota #" + (i+1));
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            max = notas[i];
            if (notas[i] > max) {
                max = notas[i];
            }
        }

        sc.close();

        System.out.println("La nota mas alta es: ");
    }
}
