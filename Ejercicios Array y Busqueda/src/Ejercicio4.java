/*4. Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La
 lista está ordenada de menor a mayor.
El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la
 lista de "pagos al día". Si no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista 
que ya está organizada.
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = {10, 20, 40, 60, 100, 160, 260, 400, 500, 543, 786, 890, 1000};
        int inicio = 0;
        int vAlto = codigos.length - 1;
        
        System.out.println("Ingrese el codigo de acceso para buscar: ");
        int opcion = sc.nextInt();
        sc.close();

        while (inicio <= vAlto) {
        int medio = inicio + (vAlto - inicio) / 2;

        if (codigos[medio] == opcion) {
            System.out.println("Se encontro el codigo en la posicion: " + medio);
            System.out.println("Usted esta en la listad de pagos al dia, puede ingresar");
            return;

        } else if (codigos[medio] < opcion) {
            inicio = medio + 1;    
        
        } else {
            vAlto = medio - 1;  
        }
        }   
        System.out.println("No se encontro el codigo en la lista de pagos al dia, no puedes ingresar");
    }
}
