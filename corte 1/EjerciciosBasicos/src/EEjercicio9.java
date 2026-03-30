/*Ejercicio 9 — Notas de un curso
Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador 
recibe una referencia al mismo arreglo para revisarlas.
El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
Muestra que el arreglo del profesor también refleja el cambio.
Añade comentarios explicando el concepto de referencia en memoria. */

public class EEjercicio9 {
    public static void main(String[] args) {  

        double[] notasPro = {5,2.5,2,3};
        double[] notasCoor = notasPro;

        notasCoor[1] = 3.0;

        System.out.println("Notas profesor: ");
        for (int i = 0; i < notasPro.length; i++) {
            System.out.println(notasPro[i]);
        }

        System.out.println("notas coordinador: ");
        for (int i = 0; i < notasCoor.length; i++) {
            System.out.println(notasCoor[i]);
        }

        //al asignarse se copia la referencia del arreglo, la referencia de memoria es un valor
        //que apunta al lugar en donde esta el array, entonces ambos apuntan al mismo espacio
        // de memoria
    }
}
