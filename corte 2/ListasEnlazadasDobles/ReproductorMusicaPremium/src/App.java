/*Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.

La Clase Cancion (Nodo): Debe contener titulo (String), artista (String) y duracion (int).
El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente 
sin tener que recorrer toda la lista desde el principio.
Reto: Implementa un método saltarAtras() que retroceda una posición y saltarAdelante() que 
avance una. Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Reproductor reproductor = new Reproductor();
        Cancion cancionActual = null;

        do {
            System.out.println("\n==============================================");
            System.out.println(" Reproductor Interactiva  — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar cancion");
            System.out.println("  [2] Mostrar siguiente cancion");
            System.out.println("  [3] Mostrar cancion anterior");
            System.out.println("  [4] recorrer lista hacia delante");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el artista: ");
                    String art = sc.nextLine();
                    System.out.println("Ingrese la duracion: ");
                    int duracion = sc.nextInt();
                    sc.nextLine();
                    Cancion cancion = new Cancion(titulo, art, duracion);
                    reproductor.agregarCancion(cancion);
                    cancionActual = cancion;
                    break;

                case 2:
                    if (cancionActual != null) {
                        System.out.println("Cancion actual: " + cancionActual.titulo);
                        cancionActual = reproductor.cancionSiguiente(cancionActual);
                        System.out.println("Siguiente cancion: " + cancionActual.titulo);
                    } else {
                        System.out.println("No hay canciones");
                    }
                    break;

                case 3:
                    if (cancionActual != null) {
                        System.out.println("cancion actual: " + cancionActual.titulo);
                        cancionActual = reproductor.cancionAnterior(cancionActual);
                        System.out.println("cancion anterior: " + cancionActual.titulo);
                    } else {
                        System.out.println("No hay canciones");
                    }
                    break;

                case 4:
                    System.out.println("La lista de canciones es: ");
                    reproductor.mostrarAdelante();
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
