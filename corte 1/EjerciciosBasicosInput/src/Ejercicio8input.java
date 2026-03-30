/*Ejercicio 8 — Copia real vs referencia
Pide al usuario 3 calificaciones para llenar notas[]. Crea una copia real en notasRespaldo[] 
copiando elemento por elemento. Modifica notas[0] con un valor que el usuario ingrese. Muestra
 ambos arreglos y verifica que notasRespaldo no cambió.*/

import java.util.Scanner;

public class Ejercicio8input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double notas[] = new double[3];
        
        System.out.println("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();
        notas[0] = n1;
        System.out.println("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();
        notas[1] = n2;
        System.out.println("Ingrese la tercera nota: ");
        double n3 = sc.nextDouble();
        notas[2] = n3;

        //copia
        double notasRespaldo[] = new double[3];

        //copiar elementos

        for (int i = 0; i < notasRespaldo.length; i++) {
            notasRespaldo[i] = notas[i];
        }

        System.out.println("Porfavor ingrese un valor para modificar la nota 1: ");
        double nuevoValor = sc.nextDouble();
        notas[0] = nuevoValor;
        sc.close();

        System.out.println("ARRAY NOTAS: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("ARRAY NOTAS RESPALDO");
        for (int i = 0; i < notasRespaldo.length; i++) {
            System.out.println(notasRespaldo[i]);
        }

        System.out.println("No cambiaron ambos por que es una copia independiente, no copio la referencia");
    }
}
