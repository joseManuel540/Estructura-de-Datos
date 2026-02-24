//Ejercicio 4 — Perfil de usuario
//Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo 
// y si acepta términos y condiciones. Muestra un resumen indicando el 
// tipo de dato que se usó para cada campo.

import java.util.Scanner;

public class Ejercicio4input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        String correo = sc.nextLine();
        System.out.println("Acepta terminos y condiciones? (true/false) ");
        boolean terminos = sc.nextBoolean();

        sc.close();
        
        System.out.println("=== PERFIL CREADO ===");
        System.out.println("nombre:   "+ nombre);
        System.out.println("edad:     "+ edad);
        System.out.println("ciudad:   "+ ciudad);
        System.out.println("Correo:   "+ correo);
        System.out.println("T&C:      "+ terminos);
    }
}
