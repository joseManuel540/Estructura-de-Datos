/*Un taller mecánico almacena los repuestos de su inventario en un BST organizado por código de 
referencia (un número entero único). Cuando un repuesto se agota, su nodo queda como hoja 
(no tiene hijos) porque no ha sido reemplazado por variantes. El administrador quiere saber cuántos 
repuestos son "únicos" (sin variantes relacionadas) y cuál es el recorrido completo del inventario 
en PreOrden para realizar una copia de seguridad del árbol.

La Clase Repuesto (Nodo): Debe contener codigoRef (int, clave del BST), descripcion (String), marca 
(String) y stock (int).
El Problema: El administrador necesita dos reportes: el primero lista todos los repuestos en 
PreOrden (para poder reconstruir el árbol en otro sistema con el mismo orden de inserción), y el 
segundo informa cuántos repuestos son hojas del árbol (sin variantes relacionadas).
Reto: Implementa backupPreOrden() que imprima todos los repuestos en recorrido PreOrden con el 
formato [codigoRef] descripcion - marca (stock uds). Implementa también reporteRepuestosUnicos() 
que use contarHojas() e imprima un mensaje indicando cuántos repuestos no tienen variantes 
relacionadas en el catálogo. */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArbolRepuestos arbol = new ArbolRepuestos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        arbol.insertar(915, "Sensor ABS", "Hitachi", 4);
        arbol.insertar(120, "Filtro de aire", "Mann", 18);
        arbol.insertar(760, "Alternador", "Denso", 6);
        arbol.insertar(450, "Bomba de gasolina", "Delphi", 9);
        arbol.insertar(980, "Compresor A/C", "Sanden", 2);
        arbol.insertar(305, "Tensor de correa", "SKF", 11);
        arbol.insertar(640, "Terminal de dirección", "TRW", 14);

        int opcion;

        do {

            System.out.println("\n--- TALLER MECÁNICO (BST) ---");
            System.out.println("1. Ver backup PreOrden");
            System.out.println("2. Insertar repuesto");
            System.out.println("3. Reporte de repuestos únicos");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println();
                    arbol.backupPreOrden();

                    break;

                case 2:

                    System.out.print("Código de referencia: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(codigo, descripcion, marca, stock);

                    System.out.println("Repuesto registrado correctamente.");

                    break;

                case 3:

                    arbol.reporteRepuestosUnicos();

                    break;

                case 4:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
