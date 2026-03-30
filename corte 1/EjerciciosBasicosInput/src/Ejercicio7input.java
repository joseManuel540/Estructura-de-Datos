/*Ejercicio 7 — Arreglo compartido (inventario)
Pide al usuario 4 precios para llenar un arreglo precios[]. Crea preciosAuditoria = precios
 (misma referencia). Pide al usuario el índice y el nuevo precio para hacer una corrección
  desde preciosAuditoria. Muestra ambos arreglos y verifica que el cambio se refleja en los 
  dos.*/

import java.util.Scanner;

public class Ejercicio7input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precios[] = new double[4];
        

        System.out.println("Ingrese el primer valor: ");
        double precio1 = sc.nextDouble();
        precios[0] = precio1;
        System.out.println("Ingrese el segundo valor: ");
        double precio2 = sc.nextDouble();
        precios[1] = precio2;
        System.out.println("Ingrese el tercer valor: ");
        double precio3 = sc.nextDouble();
        precios[2] = precio3;
        System.out.println("Ingrese el cuarto valor: ");
        double precio4 = sc.nextDouble();
        precios[3] = precio4;

        //copia
        double preciosAuditoria[] = precios;

        //nuevo precio

        System.out.println("Porfavor ingrese el indice para cambiar un precio (0,1,2,3): ");
        int indice = sc.nextInt();

        System.out.println("Porfavor ingrese el nuevo precio: ");
        double nuevoPrecio = sc.nextDouble();

        preciosAuditoria[indice] = nuevoPrecio;
        sc.close();

        System.out.println("ARRAY PRECIOS: ");
        for (int i = 0; i < preciosAuditoria.length; i++) {
            System.out.println(precios[i]);
        }

        System.out.println("ARRAY PRECIOS AUDITORIA: ");
        for (int i = 0; i < preciosAuditoria.length; i++) {
            System.out.println(preciosAuditoria[i]);
        }

        System.out.println("El cambio sucede en ambos porque el array preciosAuditoria copia la referencia del otro");
    }
}
