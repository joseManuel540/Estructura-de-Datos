import java.util.Scanner;

public class Ejercicio2input {
    public static void main(String[] args) throws Exception {
        //Ejercicio 2 — Conversor de temperatura
        //Pide al usuario una temperatura en Celsius y conviértela a
        //  Fahrenheit y Kelvin.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en Celsius");
        double tempC = sc.nextDouble();
        
        sc.close();
        
        double Fahrenheit = (tempC * 9/5) + 32;
        double Kelvin = tempC + 273.15;

        System.out.println(tempC + " °C = "+ Fahrenheit + " °F = "+ Kelvin + " °K");
    }
}
