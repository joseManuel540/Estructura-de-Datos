import java.util.Scanner;

public class Ejercicio3input {
    public static void main(String[] args) throws Exception {
        //Ejercicio 3 — Promedio de notas
        //Pide al usuario su nombre y 4 notas de un curso. Calcula el promedio 
        //y determina si aprobó (promedio >= 3.0).
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Ingrese su segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Ingrese su tercera nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Ingrese su cuarta nota: ");
        double nota4 = sc.nextDouble();

        sc.close();
        
        double sumatoria = nota1 + nota2 + nota3 + nota4;
        double promedio = sumatoria/4;

        System.out.println("=== NOTAS ===");
        System.out.println("Nombre:    "+ nombre);
        System.out.println("Promedio:  "+ promedio);
        if (promedio>=3) {
            System.out.println("Estado:    Aprobado");
        } else {
            System.out.println("Estado:    Reprobado");
        }
        

    }
}
