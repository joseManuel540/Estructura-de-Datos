import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1Parcial {
    public static void main(String[] args) {
        int[] puntajes = new int[6];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < puntajes.length; i++) {
            System.out.println("\nPorfavor ingrese el puntaje #" + (i+1));
            puntajes[i] = sc.nextInt();
        }

        System.out.println("");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.print("Atleta " + (i+1) + ": " + puntajes[i] + " | ");
        }

        ordenar(puntajes);
        System.out.println("");
        System.out.println("\nArray ordenado: ");
        System.out.println("-------- TABLA DE POSICIONES --------");
        System.out.println(Arrays.toString(puntajes));

        System.out.println("\nPorfavor ingrese un puntaje para buscar: ");
        int busca = sc.nextInt();

        boolean encontrar = false;
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == busca) {
                System.out.println("\nEl puntaje se encontro en la posicion: " + (i+1));
                encontrar = true;
            }
        }

        if (!encontrar) {
            System.out.println("\nEl puntaje no se encontro");
        }

        int min = puntajes[0];
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i]<min) {
                min = puntajes[i];
            }
        }
        System.out.println("\nEl puntaje menor es: " + min);

        int max = puntajes[0];
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i]>max) {
                max = puntajes[i];
            }
        }
        System.out.println("El puntaje mayor es: " + max);

        int dif = max-min;
        System.out.println("La diferencia entre el mayor y el menor es de: " + dif);

        sc.close();

    }

    public static void ordenar(int[] arr) {
        //SelectionSort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[indiceMinimo]) {
                indiceMinimo = j;
                }
        }
        // Intercambiar el elemento mínimo encontrado con el primero
        int temp = arr[indiceMinimo];
        arr[indiceMinimo] = arr[i];
        arr[i] = temp;
        }
    }

}
