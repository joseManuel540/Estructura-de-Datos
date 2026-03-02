/*2. Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su
 número de cédula o ID.
El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus
 datos de la manera más rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá
 encontrar al cliente dividiendo la lista a la mitad en cada paso.*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] codigos = {123456, 234567,345678, 456789, 770123, 678912};
        int codigoBarra = 770123;
        System.out.println("Usted ha escaneado el producto con codigo de barras 770123");

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoBarra) {
                System.out.println("El producto se encontro en la posicion: " + (i+1));
                return;
            } 
        }   
        System.out.println("No se encontro el producto");
    }
}
