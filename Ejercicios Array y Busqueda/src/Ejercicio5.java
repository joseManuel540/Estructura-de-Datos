/*5. Contador de Estudiantes (Registro Académico)
Un profesor tiene un arreglo con las notas finales de 30 estudiantes
 (ej: 3.5, 4.0, 2.8, 5.0, ...).
El Problema: El profesor necesita saber exactamente cuántos estudiantes sacaron una nota de 5.0.
Algoritmo a usar: Búsqueda Lineal con Contador. Debes recorrer todo el arreglo y, cada vez que 
encuentres un 5.0, aumentar una variable contador. */

public class Ejercicio5 {
    public static void main(String[] args) {
        double[] notas = {4.5, 5, 2, 5, 5, 3.5};
        int notaMaxima = 5;
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == notaMaxima) {
                contador ++;
            } 
        }   
        System.out.println("Los estudiantes que sacaron una nota de 5 fueron: " + contador);
    }
}
