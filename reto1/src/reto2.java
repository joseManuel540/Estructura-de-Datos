import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cuentasVIP = {10, 20, 45, 50, 60};
        int[] cuenta = new int[5];
        double[] montos = new double[5];
        int inicio = 0;
        int vAlto = cuentasVIP.length - 1;

        for (int i = 0; i < montos.length; i++) {
            System.out.println("Ingrese el numero de cuenta #" + (i+1));
            cuenta[i] = sc.nextInt();
            System.out.println("Ingrese el monto de la cuenta " + cuenta[i]);
            montos[i] = sc.nextDouble();

            
            if (montos[i] >  5000) {

                while (inicio <= vAlto) {
                int medio = inicio + (vAlto - inicio) / 2;

                if (cuentasVIP[medio] == cuenta[i]) {
                    System.out.println("Usted es vip");
                    break;

                } else if (cuentasVIP[medio] < cuenta[i]) {
                    inicio = medio + 1;    
            
                } else {
                    vAlto = medio - 1;  
            }
            }
            System.out.println("Alerta de fraude; cuenta no autorizada para montos altos");
        }
        }
        sc.close();

        

        




    }
}
