/*
3. Sistema de Nómina (Recursos Humanos)
Una empresa de logística administra a sus empleados en un BST organizado por número de cédula. El 
área de RRHH consulta frecuentemente el empleado con el menor y el mayor número de cédula para 
procesar los extremos de la nómina. También necesita conocer la altura del árbol para auditar si la 
estructura sigue siendo eficiente después de muchas incorporaciones.

La Clase Empleado (Nodo): Debe contener cedula (long, clave del BST), nombreCompleto (String), 
cargo (String) y salario (double).
El Problema: El sistema debe poder ubicar al empleado con la cédula más baja (el más antiguo en el 
registro) y al de cédula más alta (el más reciente), y también reportar la altura actual del árbol 
para verificar que las búsquedas siguen siendo eficientes.
Reto: Implementa buscarMinimo() y buscarMaximo(), que recorran el BST siguiendo siempre el subárbol 
izquierdo o derecho respectivamente hasta llegar a una hoja e impriman los datos del empleado 
encontrado. Implementa también reporteEficiencia() que imprima la altura actual del árbol y el 
número total de hojas (contarHojas()).
*/

import java.util.Scanner;

public class App102 {

    public static void main(String[] args) {

        ArbolEmpleados arbol = new ArbolEmpleados();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        arbol.insertar(45871236L, "Jorge Martínez", "Coordinador", 3800000);
        arbol.insertar(10293847L, "Paula Herrera", "Auxiliar Contable", 2100000);
        arbol.insertar(78451239L, "Ricardo Gómez", "Supervisor", 3200000);
        arbol.insertar(56987412L, "Natalia Rojas", "Analista", 3500000);
        arbol.insertar(88997766L, "Camilo Vargas", "Operario", 1900000);
        arbol.insertar(33445566L, "Diana Torres", "Jefe de Compras", 4700000);
        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE NÓMINA (BST) ---");
            System.out.println("1. Ver empleados en InOrden");
            System.out.println("2. Insertar empleado");
            System.out.println("3. Buscar empleado con menor cédula");
            System.out.println("4. Buscar empleado con mayor cédula");
            System.out.println("5. Reporte de eficiencia");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println();
                    arbol.inOrden();
                    break;

                case 2:

                    System.out.print("Cédula: ");
                    long cedula = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    arbol.insertar(cedula, nombre, cargo, salario);
                    System.out.println("Empleado registrado correctamente.");
                    break;

                case 3:

                    Empleado minimo = arbol.buscarMinimo();

                    if (minimo != null)
                    
                        System.out.println("Empleado con menor cédula:\n" + minimo);
                    else
                        System.out.println("El árbol está vacío.");
                    break;

                case 4:

                    Empleado maximo = arbol.buscarMaximo();
                    
                    if (maximo != null)
                        System.out.println("Empleado con mayor cédula:\n" + maximo);
                    else
                        System.out.println("El árbol está vacío.");
                    break;

                case 5:
                    arbol.reporteEficiencia();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
