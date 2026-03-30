/*Ejercicio 5 — Conversor de unidades
Una aplicación de cocina necesita convertir unidades:
Declara una variable tazas (double) con la cantidad de tazas de un 
ingrediente.
Convierte a mililitros (1 taza = 236.588 ml) y guarda el resultado enotra variable.
Convierte también a litros.
Muestra las tres medidas por consola. */

public class EEjercicio5 {
    public static void main(String[] args) {

        double Tazas = 3.5;
        double Tazasmm = Tazas*236.588;
        double TazasL = Tazasmm/1000;

        System.out.println("=== Conversor unidades ===");
        System.out.println("Cantidad de tazas: "+ Tazas);
        System.out.println("Cantidad en mililitros "+ Tazasmm);
        System.out.println("Cantidad en litros "+ TazasL);
        

    }
}
