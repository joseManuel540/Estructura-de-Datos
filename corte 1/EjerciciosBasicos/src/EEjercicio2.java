/*Ejercicio 2 — Calculadora de una tienda
Una tienda de barrio vende productos al por menor
Precio unitario de un producto (double)
Cantidad comprada (int)
Descuento aplicado en porcentaje (double)
Total a pagar después del descuento*/

public class EEjercicio2 {
    public static void main(String[] args) {

        double precioPro = 4500;
        int cantidadPro = 4;
        double descuento = 30;
        double cantidadTot = precioPro*cantidadPro;
        double descuentoTot = cantidadTot*(descuento/100);
        double precioFinal = cantidadTot-descuentoTot;

        System.out.println("Precio final: "+ precioFinal);
    }
}
