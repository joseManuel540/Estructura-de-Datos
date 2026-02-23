public class EEjercicio4 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio 4 — Placa de un vehículo
        El RUNT almacena datos básicos de vehículos. Modela la información de
        un carro con:
        Placa (String)
        Año de fabricación (int)
        Cilindraje en cc (int)
        Precio de compra (double)
        Inicial del color (char)
        Si tiene SOAT vigente (boolean) */

        String Placa = "R33-13F";
        int AñoFabri = 2002;
        int Cilindraje = 1000;
        double Precio = 200000;
        char Color = 'r';
        boolean SOAT = true;

        System.out.println("=== RUNT ===");
        System.out.println("Placa: "+ Placa);
        System.out.println("Año fabricacion: "+ AñoFabri);
        System.out.println("cilindraje en cc: "+ Cilindraje);
        System.out.println("precio: "+ Precio);
        System.out.println("inicial del color: "+ Color);
        System.out.println("Soat vigente: "+ SOAT);

    }
}
