import java.util.Scanner;

public class Ejercicio5input {
    public static void main(String[] args)  {
        //Ejercicio 5 — Calculadora de IMC
        //Pide nombre, peso en kg y altura en metros. Calcula el IMC y 
        //clasifícalo.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su peso en KG: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
    
        sc.close();
        
        double IMC = peso / (altura * altura);
        String clasificacion="";

        if (IMC<18.5) {
            clasificacion = "Bajo peso";
        }
        else if (IMC >= 18.5 && IMC < 25) {
            clasificacion = "Normal";
        }
        else if (IMC >= 25 && IMC < 30) {
            clasificacion = "Sobrepeso";
        }
        else if (IMC >= 30) {
            clasificacion = "Obesidad";
        }

        System.out.println("Nombre:         "+ nombre);
        System.out.println("peso:           "+ peso);
        System.out.println("altura:         "+ altura);
        System.out.println("IMC:            "+ IMC);
        System.out.println("Caslificacion:  "+ clasificacion);
    }
}
