/*3. Torre de Control (Aterrizajes de Emergencia)
Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String), combustibleRestante (int) y pasajeros
(int).
El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 
unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
Reto: Implementar el método reportarEmergencia(String numeroVuelo) que busque un vuelo en la cola y lo mueva al 
principio. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Lista lista = new Lista();

        do {
            System.out.println("\n=================================");
            System.out.println("   TORRE DE CONTROL");
            System.out.println("=================================");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Reportar emergencia");
            System.out.println("3. Mostrar cola de vuelos");
            System.out.println("0. Salir");
            System.out.println("=================================");
            System.out.println("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    sc.nextLine();

                    System.out.print("Número de vuelo: ");
                    String numero = sc.nextLine();

                    System.out.print("Aerolínea: ");
                    String aerolinea = sc.nextLine();

                    System.out.print("Combustible restante: ");
                    int combustible = sc.nextInt();

                    System.out.print("Pasajeros: ");
                    int pasajeros = sc.nextInt();

                    Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);
                    lista.agregarVuelo(nuevo);
                    break;

                case 2:
                    sc.nextLine(); 

                    System.out.print("Número de vuelo en emergencia: ");
                    String emergencia = sc.nextLine();

                    lista.reportarEmergencia(emergencia);
                    break;

                case 3:
                    System.out.println("\nCola de vuelos:");
                    lista.mostrarCola();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
