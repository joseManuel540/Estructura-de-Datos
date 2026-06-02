import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaTren lista = new ListaTren();
        int opcion;

        do {
            System.out.println("\n========= GESTION DE CARGA =========");
            System.out.println("================================");
            System.out.println("1. Agregar al final");
            System.out.println("2. Buscar por Id");
            System.out.println("3. Mostrar todos los vagones y peso total");
            System.out.println("4. Mostrar el vagon mas pesado");
            System.out.println("0. Salir");
            System.out.println("================================");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {
                case 1:
                    String i;
                    double p = 0;
                    double p2;
                    do {
                        System.out.print("Id: ");
                        i = sc.nextLine();
                    } while (!lista.IdRepetida(i));
                    System.out.print("contenido: ");
                    String c = sc.nextLine();
                    do {
                        System.out.print("peso: ");
                        p2 = sc.nextDouble();
                    } while (p2 < p);
                    sc.nextLine();
                    Vagon nueva = new Vagon(i, c, p2);
                    lista.agregarVagonesFinal(nueva);
                    break;
                case 2:
                    System.out.print("ID a buscar: ");
                    String id = sc.nextLine();
                    lista.BuscarPorId(id);
                    break;
                case 3:
                    lista.mostrar();
                    System.out.println("Peso total: ");
                    System.out.println(lista.calcularPesoTotal());
                    break;
                case 4:
                    lista.VagonMasPesado();
                
            }

        } while (opcion != 0);

        sc.close();
    }
}
