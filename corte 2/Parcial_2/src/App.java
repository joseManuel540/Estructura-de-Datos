import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        Metro lista = new Metro();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Metro — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar estacion");
            System.out.println("  [2] ver ruta (IDA)");
            System.out.println("  [3] ver ruta (REGRESO)");
            System.out.println("  [4] Consultar una estacion");
            System.out.println("  [5] Eliminar parada");
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
                    String t = sc.nextLine();
                    lista.agregarAlFinal(t);
                    break;

                case 2:
                    lista.RutaIda();
                    break;

                case 3:
                    lista.RutaRegreso();
                    break;

                case 4:
                    System.out.println("Ingrese el nombre a buscar: ");
                    String t1 = sc.nextLine();
                    lista.ConsultarEstacion(t1);
                    break;

                case 5:
                    System.out.println("Ingrese el nombre a eliminar: ");
                    String t2 = sc.nextLine();
                    lista.EliminarParada(t2);
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
