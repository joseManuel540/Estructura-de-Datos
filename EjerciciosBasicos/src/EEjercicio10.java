/*Ejercicio 10 — Copiando configuración
Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).
Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando
elemento por elemento.
Modifica la copia y demuestra que el original no cambia.
Comenta la diferencia con la asignación directa. */

public class EEjercicio10 {
    public static void main(String[] args) {  

        int[] configuracion = {1920, 1080, 60};
        int[] copia = new int[configuracion.length];

        for (int i = 0; i < configuracion.length; i++) {
            copia[i] = configuracion[i];
        }

        copia[2] = 30;

        System.out.println("Configuracion: ");
        for (int i = 0; i < configuracion.length; i++) {
            System.out.println(configuracion[i]);
        }

        System.out.println("copia: ");
        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i]);
        }

        //la asignacion directa usa la misma referencia mas no recibe una copia, en este
        //ejemplo se creo otro array diferente y 1 a 1 se le fueron asisgnando los valores
        //del primer array por eso, al ser diferentes array, al modificar uno no afecta el otro
    }
}
