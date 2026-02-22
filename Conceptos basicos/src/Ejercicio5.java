public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 5 — Conversor de unidades
        //Una aplicación de cocina necesita convertir unidades

        double Tazas = 3.5;
        double Tazasmm = Tazas*236.588;
        double TazasL = Tazasmm/1000;

        System.out.println("=== Conversor unidades ===");
        System.out.println("Cantidad de tazas: "+ Tazas);
        System.out.println("Cantidad en mililitros "+ Tazasmm);
        System.out.println("Cantidad en litros "+ TazasL);
        

    }
}
