import java.util.Scanner;

public class Ejercicio1input {
    
    public static void main(String[] args){
        //Pide al usuario el nombre de un producto, la cantidad comprada y el
        // precio unitario. Calcula el subtotal, aplica un IVA del 19% y 
        // muestra el recibo con el total a pagar.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto:");
        String prod = sc.nextLine();
        System.out.println("Ingrese la cantidad comprada del producto:");
        int cant = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto:");
        double pUnitario = sc.nextDouble();

        sc.close();
        
        double totalPro = pUnitario * cant;
        double pIVA = totalPro * 0.19;
        double totalfinal = totalPro + pIVA;

        System.out.println("=== RECIBO ===");
        System.out.println("producto:   "+ prod);
        System.out.println("cantidad:   "+ cant);
        System.out.println("precio c/u: "+ pUnitario);
        System.out.println("subtotal:   "+ totalPro);
        System.out.println("IVA (19%):  "+ pIVA);
        System.out.println("total:    : "+ totalfinal);

    }
}
