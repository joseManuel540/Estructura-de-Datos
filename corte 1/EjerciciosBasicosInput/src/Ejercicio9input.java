/*
Ejercicio 9 — String inmutable
Pide al usuario su nombre. Asigna alias = nombre. Pide un nuevo alias. Muestra que nombre no
 cambió y explica la inmutabilidad de String con un mensaje en consola. */

import java.util.Scanner;

public class Ejercicio9input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        //Asignacion
        String alias = nombre;

        System.out.println("Ingrese un alias: ");
        alias = sc.nextLine();
        sc.close();
        System.out.println("Nombre: " + nombre);
        System.out.println("Alias: " + alias);
        System.out.println("Al crearse un String este no puede cambiarse, siempre se crea un String nuevo incluso al modificarse el original");
    }
}
