/*5. Spotify Lite (Lista de Reproducción)
Crea un reproductor de música simplificado que gestione una lista de canciones.

La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la 
cola".
Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en 
formato MM:SS. */
import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaCanciones lista = new ListaCanciones();
        int opcion;

        do {
            System.out.println("\n========= SPOTIFY LITE =========");
            System.out.println("================================");
            System.out.println("1. Agregar al final");
            System.out.println("2. Agregar después de la actual");
            System.out.println("3. Mostrar duración total");
            System.out.println("4. Mostrar toda la lista");
            System.out.println("0. Salir");
            System.out.println("================================");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {
                case 1:
                case 2:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Género: ");
                    String genero = sc.nextLine();

                    Cancion nueva = new Cancion(titulo, artista, duracion, genero);

                    if (opcion == 1) {
                        lista.agregarAlFinal(nueva);
                    } else {
                        lista.agregarDespuesActual(nueva);
                    }
                    break;

                case 3:
                    lista.mostrarDuracionTotal();
                    break;
                case 4:
                    lista.mostrar();
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
