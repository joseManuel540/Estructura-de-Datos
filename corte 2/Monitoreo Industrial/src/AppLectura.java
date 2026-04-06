/*4. Monitoreo Industrial (Sensores en Tiempo Real)
Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para 
auditoría.

La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y
hora (String).
El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la 
primera que vea el supervisor.
Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta 
registrada en el historial. */

import java.util.Scanner;

public class AppLectura{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaLecturas lista = new ListaLecturas();
        int opcion;

        do {
            System.out.println("\n====== MONITOREO INDUSTRIAL ======");
            System.out.println("==================================");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar mayor temperatura");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID Sensor: ");
                    int id = sc.nextInt();
                    System.out.print("Temperatura: ");
                    double temp = sc.nextDouble();
                    System.out.print("Presión: ");
                    double pres = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    Lectura nuevaLec = new Lectura(id, temp, pres, hora);
                    lista.agregarLectura(nuevaLec);
                    break;

                case 2:
                    lista.mostrarMayorTemperatura();
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
