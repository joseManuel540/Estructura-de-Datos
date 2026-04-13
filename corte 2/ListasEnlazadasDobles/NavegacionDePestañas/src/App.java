/*Imagina un navegador donde puedes moverte entre pestañas abiertas.

La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura 
(String).
El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña 
actual y el foco debe pasar a la pestaña anterior.
Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, la 
elimine de la lista y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con 
la Cabeza y la Cola!). */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Navegacion navegacion = new Navegacion();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Galeria Interactiva  — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar foto");
            System.out.println("  [2] Eliminar pestaña con url");
            System.out.println("  [3] recorrer lista hacia delante");
            System.out.println("  [4] recorrer lista hacia atras");
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
                    System.out.println("Ingrese la url: ");
                    String url = sc.nextLine();
                    System.out.println("Ingrese la hora de apertura: ");
                    String hora = sc.nextLine();
                    Pestana foto = new Pestana(titulo, url, hora);
                    navegacion.agregarPestana(foto);
                    break;

                case 2:
                    System.out.println("Ingrese la url: ");
                    String url2 = sc.nextLine();
                    navegacion.cerrarPestanaActual(url2);
                    break;

                case 3:
                    System.out.println("Las pestañas son: ");
                    navegacion.mostrarAdelante();
                    break;

                case 4:
                    System.out.println("Las pestañas desde la ultima es: ");
                    navegacion.mostrarAtras();
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
