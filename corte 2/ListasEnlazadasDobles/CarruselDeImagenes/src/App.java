/*Simula el comportamiento de una galería de fotos en una aplicación móvil.

La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion 
(String).
El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". 
Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo 
lineal).
Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego toda 
la lista hacia atrás para mostrar todas las fotos. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Galeria galeria = new Galeria();
        Fotografia fotoactual = null;

        do {
            System.out.println("\n==============================================");
            System.out.println(" Galeria Interactiva  — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar foto");
            System.out.println("  [2] Mostrar siguiente foto");
            System.out.println("  [3] Mostrar foto anterior");
            System.out.println("  [4] recorrer lista hacia delante");
            System.out.println("  [5] recorrer lista hacia atras");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el tamaño: ");
                    double tamaño = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese la resolucion: ");
                    String reso = sc.nextLine();
                    Fotografia foto = new Fotografia(nombre, tamaño, reso);
                    galeria.agregarFoto(foto);
                    fotoactual = foto;
                    break;

                case 2:
                    if (fotoactual != null) {
                        System.out.println("foto actual: " + fotoactual.nombreArchivo);
                        fotoactual = galeria.fotoSiguiente(fotoactual);
                        System.out.println("Siguiente foto: " + fotoactual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos");
                    }
                    break;

                case 3:
                    if (fotoactual != null) {
                        System.out.println("foto actual: " + fotoactual.nombreArchivo);
                        fotoactual = galeria.fotoAnterior(fotoactual);
                        System.out.println("foto anterior: " + fotoactual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos");
                    }
                    break;

                case 4:
                    System.out.println("La galeria de fotos es: ");
                    galeria.mostrarAdelante();
                    break;

                case 5:
                    System.out.println("La galeria de fotos desde la ultima es: ");
                    galeria.mostrarAtras();
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
