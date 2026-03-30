/*Ejercicio 10 — Intercambio de valores
Pide dos números enteros x e y. Intercambia sus valores usando una variable auxiliar temp. 
Muestra los valores antes y después del intercambio.
 */

import java.util.Scanner;

public class Ejercicio10input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int x = sc.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int y = sc.nextInt();
        sc.close();
    
        System.out.println("Valores antes del intercambio: ");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Valores despues del intercambio: ");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
