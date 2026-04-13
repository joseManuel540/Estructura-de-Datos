import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    double [] precios = new double[5];
    double precioMayor=0;
    double total = 0;
    double totalDescuento = 0;

    System.out.println("Porfavor ingrese el precico de los 5 productos");

    for (int i = 0; i < precios.length; i++) {
        System.out.println("Ingrese el precio del producto #"+(i+1));
        precios[i] = sc.nextDouble();
        total = total+ precios[i];

        if (precios[i]>precioMayor) {
            precioMayor = precios[i];
        }
    }

    sc.close();

    if (total>20000) {
        System.out.println("");
        System.out.println("Recibiste un descuento de 2000");
        totalDescuento = total - 2000;
    } else {
        totalDescuento = total;
    }

    System.out.println("");
    System.out.println("============ CAJERO SUPERMERECADO ============");
    System.out.println("Total: "+ total);
    System.out.println("Precio mas alto: "+ precioMayor);
    System.out.println("Total final a pagar:: "+ totalDescuento);
    }

}
