/*El Salto de Shell (Optimización de Datos)
Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos
de forma más eficiente que el método de burbuja o inserción simple.
Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al 
menos 10 para notar el efecto).
Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
N/2. El estudiante debe explicar en comentarios por qué este método es generalmente más rápido 
que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar 
todas las fases de reducción de saltos. */

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pesos = new double[10];

        for (int i = 0; i < pesos.length; i++) {
            System.out.println("Porfavor ingrese el peso del paquete #" + (i+1));
            pesos[i] = sc.nextDouble();
        }
        sc.close();
        System.out.println("Arreglo desordenado: "+ Arrays.toString(pesos));
        ordenar(pesos);
        System.out.println("Arreglo ordenado: "+ Arrays.toString(pesos));
    }
        //Shell Sort es mejor ya que en lugar de comparar los elementos consecutivos, compara 
        //elementos que estan separados por una distancia dentro del array,
        //esto hace que los elementos se muevan grandes distancias en
        //pocas operaciones, acercandolos a su posicion correcta de una manera mas rapida
        //que la insercion simple cuando se trata de muchos valores dentro del array.

    public static void ordenar(double[] arr) {
        //ShellSort
        int n = arr.length;
        // Empezar con una brecha grande y reducirla
        for (int brecha = n / 2; brecha > 0; brecha /= 2) {
        // Realizar un ordenamiento por inserción para esta brecha
            for (int i = brecha; i < n; i++) {
                double temp = arr[i];
                int j;
                for (j = i; j >= brecha && arr[j - brecha] > temp; j -= brecha) {
                    arr[j] = arr[j - brecha];
                }
                arr[j] = temp;
            }   
        }
    }
}
