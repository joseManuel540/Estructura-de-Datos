/*Ejercicio 7 — Inventario compartido
Un almacén tiene un arreglo con el stock de 5 productos. El sistema de
ventas y el sistema de reportes apuntan al mismo arreglo.
Crea el arreglo stockAlmacen con valores iniciales.
Asigna stockReportes = stockAlmacen.
Simula una venta reduciendo el stock de un producto desde stockReportes.
Muestra que stockAlmacen también cambió y explica en comentarios por qué.*/

public class EEjercicio7 {
    public static void main(String[] args) {  

        int[] stockAlmacen = {4,5,6,3,8};
        int[] stockReportes = stockAlmacen;

        stockReportes[1] = stockReportes[1]- 1;

        System.out.println("Stock Reportes: ");
        for (int i = 0; i < stockReportes.length; i++) {
            System.out.println(stockReportes[i]);
        }

        System.out.println("Stock almacen: ");
        for (int i = 0; i < stockAlmacen.length; i++) {
            System.out.println(stockAlmacen[i]);
        }

        //ambos cambiaron porque al asignar un array a otro, este
        //copia su referencia, mas no copia los valores del array, entonces 
        //ambos apuntan al mismo espacio de memoria, si se modifica uno, cambia en el otro
    }
}
