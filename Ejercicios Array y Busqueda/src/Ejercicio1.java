/*1. El Cajero del Supermercado (Inventario)
Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo
desordenado con los códigos de los productos disponibles en la estantería actual.
El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de
la estantería se encuentra.
Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen
un orden numérico específico. */

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[] codigos = {123456, 234567,945678, 456789, 770123, 678912};
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
