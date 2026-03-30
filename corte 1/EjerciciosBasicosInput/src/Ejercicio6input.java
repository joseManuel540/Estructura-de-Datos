/*Ejercicio 6 — Demostración por valor
Pide al usuario dos números enteros a y b. Asigna b = a, luego pide un nuevo valor para b. 
Imprime a y b después del cambio y explica con un mensaje en consola por qué a no cambió. */

import java.util.Scanner;

public class Ejercicio6input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int b = sc.nextInt();

        b=a;

        System.out.println("Ingrese un nuevo numero entero");
        b = sc.nextInt();
        sc.close();
        System.out.println("a: "+ a+ " --- No cambio por que b copio el valor de a, mas no su referencia");
        System.out.println("b: "+b + " --- Si cambio porque pedimos ingresar nuevo valor para b");

        System.out.println();
    }
}
