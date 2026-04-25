/*Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando 
anterior; flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio 
(String — el path desde donde se ejecutó).
El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" 
mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el 
comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo 
con el cursor marcado. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Historial historial = new Historial();
        Comando fotoactual = null;

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
