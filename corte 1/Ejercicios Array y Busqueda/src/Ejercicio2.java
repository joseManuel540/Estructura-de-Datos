/*2. Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su
 número de cédula o ID.
El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus
 datos de la manera más rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá
 encontrar al cliente dividiendo la lista a la mitad en cada paso.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cedulasID =
        {1234, 2345, 3456, 4567, 6789, 7891, 8912, 9012, 
        10000, 10230, 12345, 13456, 14567, 15678, 16789};
        int inicio = 0;
        int vAlto = cedulasID.length - 1;

        System.out.println("Ingrese su numero de cedula: ");
        int cedula = sc.nextInt();
        sc.close();

        while (inicio <= vAlto) {
        int medio = inicio + (vAlto - inicio) / 2;

        if (cedulasID[medio] == cedula) {
            System.out.println("Se encontro la cedula en la posicion: " + medio);
            return;

        } else if (cedulasID[medio] < cedula) {
            inicio = medio + 1;    
        
        } else {
            vAlto = medio - 1;  
        }
        }
        System.out.println("No se encontro la cedula");

    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
int low = 0;
int high = arr.length - 1;
while (low <= high) {
int mid = low + (high - low) / 2;   // evita overflow
if (arr[mid] == objetivo) {
return mid;
} else if (arr[mid] < objetivo) {
low = mid + 1;    
// buscar en mitad derecha
} else {
high = mid - 1;   // buscar en mitad izquierda
}
}
return -1;
}

}
