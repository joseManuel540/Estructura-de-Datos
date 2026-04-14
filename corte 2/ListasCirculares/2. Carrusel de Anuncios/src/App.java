/*Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el 
último anuncio, vuelve automáticamente al primero.

La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), vecesRepetido 
(int) y categoria (String - ej: "Oferta", "Marca", "Evento").
El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el 
anuncio que más veces se ha repetido.
Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas completas por 
todos los anuncios, incrementando vecesRepetido en cada paso e imprimiendo qué anuncio está en 
pantalla. Al finalizar, muestra el anuncio más repetido y el tiempo total acumulado en pantalla. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Lista lista = new Lista();

        do {
            System.out.println("\n==============================================");
            System.out.println("   Anuncios — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar Anuncio");
            System.out.println("2. Mostrar Anuncios");
            System.out.println("3. Reproducir Anuncios");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                        System.out.print("Ingrese el titulo del anuncio: ");
                        String titulo = sc.next();
                        System.out.print("Ingrese la duracion del anuncio");
                        int duracion = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese la categoria ");
                        String cat = sc.nextLine();
                        Anuncio nAnuncio = new Anuncio(titulo, duracion, cat);
                        lista.agregarAnuncio(nAnuncio);                    
                    break;

                case 2:
                    System.out.println("Lista de anuncios:");
                    lista.mostrarAnuncios();
                    break;

                case 3:
                    System.out.print("Ingrese el número de ciclos para los anuncios ");
                    int pasos = sc.nextInt();
                    lista.reproducir(pasos);
                    break;
                
                case 0:
                    System.out.println("¡Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
