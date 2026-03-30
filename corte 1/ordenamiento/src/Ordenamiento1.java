/*1. El Podio de la Competencia
Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita 
determinar quiénes ganaron las medallas.
Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron
 (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada
 iteración y colocarlo al inicio.
Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente,
 mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y 
 Bronce (3er lugar). */

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese cuantos corredores participaron: ");
        int participantes = sc.nextInt();

        double[] tiempo = new double[participantes];

        for (int i = 0; i < tiempo.length; i++) {
            System.out.println("Porfavor ingrese el tiempo en segundos del corredor #" + (i+1));
            tiempo[i] = sc.nextDouble();
        }
        sc.close();
        ordenar(tiempo);

        System.out.println(Arrays.toString(tiempo));
        System.out.println("El corredor con la medalla de oro hizo: " + tiempo[0]);
        System.out.println("El corredor con la medalla de plata hizo: "+ tiempo[1]);
        System.out.println("El corredor con la medalla de bronce hizo: "+ tiempo[2]);
    
    }

    public static void ordenar(double[] arr) {
        //SelectionSort
        int n = arr.length;
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
