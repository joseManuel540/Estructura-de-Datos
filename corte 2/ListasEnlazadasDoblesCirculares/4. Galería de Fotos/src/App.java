/*Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente, volver a la anterior, y 
marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero. 
Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y 
mueve actual a la siguiente.
Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria() recorre 
todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces, marca la actual como 
favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Galeria galeria = new Galeria();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Galeria — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar foto");
            System.out.println("  [2] siguiente foto");
            System.out.println("  [3] anterior foto");
            System.out.println("  [4] añadir a favorita");
            System.out.println("  [5] eliminar actual");
            System.out.println("  [6] mostrar todas las fotos");
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
                    String t = sc.nextLine();
                    System.out.println("Ingrese la fecha: ");
                    String d = sc.nextLine();
                    galeria.agregarFoto(t, d);
                    break;

                case 2:
                    galeria.siguiente();
                    break;

                case 3:
                    galeria.anterior();
                    break;

                case 4:
                    galeria.toggleFavorita();
                    break;

                case 5:
                    galeria.elimarActual();
                    galeria.mostrarFotoActual();
                    break;

                case 6:
                    galeria.mostrarGaleria();
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles Circulares!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();

    }
}
