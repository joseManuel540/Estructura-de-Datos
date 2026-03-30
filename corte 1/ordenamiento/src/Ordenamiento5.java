/*El Inspector de Eficiencia (Duelo de Métodos)
Algoritmos obligatorios: Selección vs Inserción

Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de 
operaciones para un caso específico.
Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa 
aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
Lógica de Conteo:
En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle 
interno.
Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos 
movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos 
ingresados por el teclado. */

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[6];
        int [] copia = new int[6];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Porfavor ingrese el numero #" + (i+1));
            numeros [i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }
        sc.close();

        ordenarSeleccion(numeros);
        System.out.println(Arrays.toString(numeros));
        ordenarInsercion(copia);
        System.out.println(Arrays.toString(copia));

        //El mas eficiente fue el de seleccion ya que generalmente necesita menos swaps, 
        //comparado con los movimientos que realiza el de insercion para poder odenar un 
        //array, aunque si el array esta casi ordenado el de insercion hara menos movimientos,
        //pero por lo general para ordenar el de seleccion es mas eficiente
    }

    public static void ordenarSeleccion(int[] arr) {
        int n = arr.length;
        int c = 0;
            for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[indiceMinimo]) {
                        indiceMinimo = j;
                        }
                    }
                // Intercambiar el elemento mínimo encontrado con el primero
                int temp = arr[indiceMinimo];
                arr[indiceMinimo] = arr[i];
                arr[i] = temp;
                c++;
            }
            System.out.println("La cantidad de swap que hubo fueron: " + c);
        }

    public static void ordenarInsercion(int[] arr) {
        int n = arr.length;
        int c = 0;
            for (int i = 1; i < n; ++i) {
            int key = arr[i]; //key = 1 /25 
            int j = i - 1; // j = 0 / 30
            // Mueve los elementos de arr[0..i-1], que son mayores que key,
            // una posición adelante de su posición actual
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j]; // 1 = 30
                    j = j - 1; // j = -1 
                    c++;
                }
                arr[j + 1] = key; // 0 = 25
            }
            System.out.println("La cantidad de elementos que se movieron hacia la izquierda fueron: "+ c);
        }
        

}
