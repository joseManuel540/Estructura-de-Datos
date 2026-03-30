/* Registro Alfabético de Estudiantes
Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada 
en el sistema se ordene alfabéticamente de la A a la Z.
Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar 
sus nombres (cadenas de texto).
Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
Requisito técnico: El estudiante debe investigar y aplicar el método 
nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es mayor a 0, el 
primer nombre es alfabéticamente "mayor" que el segundo.
Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto. */

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estudiantes;
        
        System.out.println("Cuantos estudiantes hay en la clase ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        estudiantes = new String[cantidad];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante #" + (i+1));
            estudiantes[i] = sc.nextLine();
        }
        sc.close();
        System.out.println("Estudiantes desordenados: ");
        System.out.println(Arrays.toString(estudiantes));
        ordenar(estudiantes);
        System.out.println("Estudiantes ordenados: ");
        System.out.println(Arrays.toString(estudiantes));


    }

    public static void ordenar(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            // Mueve los elementos de arr[0..i-1], que son mayores que key,
            // una posición adelante de su posición actual
            //El metodo compareToIgnoreCase() devuelve un int:
            //0 si las cadenas son iguales
            //< 0 si la primera es menor
            //> 0 si la primera es mayor    
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
                }
            arr[j + 1] = key;
            }
}

}
