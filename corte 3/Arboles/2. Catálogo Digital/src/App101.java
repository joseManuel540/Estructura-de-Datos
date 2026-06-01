/* 2. Catálogo Digital (Biblioteca Universitaria)
La biblioteca de la universidad organiza su colección de libros en un BST usando el ISBN como clave
única. Cada vez que ingresa un libro nuevo, se inserta automáticamente en el árbol. El sistema debe
poder confirmar si un ISBN ya existe antes de registrar un nuevo ejemplar y listar toda la colección ordenada por ISBN.

La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y
anioPublicacion (int).
El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo
ordenado de menor a mayor por ISBN para enviarlo a la sede central. También debe verificar si un
ISBN específico ya existe en el catálogo antes de registrar una donación.
Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los
libros en orden ascendente de ISBN (imprime isbn - titulo - autor). Además, implementa
existeISBN(long isbn) que retorne true si el libro ya está registrado y false en caso contrario.*/

import java.util.Scanner;

public class App101 {
    public static void main(String[] args) {

        ArbolLibros catalogo = new ArbolLibros();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        catalogo.insertar(9780306406157L, "Inteligencia Artificial", "John McCarthy", 2015);
        catalogo.insertar(9788420546391L, "Clean Code", "Robert Martin", 2009);
        catalogo.insertar(9780132350884L, "The Pragmatic Programmer", "Andrew Hunt", 1999);
        catalogo.insertar(9789584256789L, "Matemáticas Discretas", "Sergio Gómez", 2021);
        catalogo.insertar(9786071512345L, "Redes y Comunicaciones", "Laura Méndez", 2018);

        int opcion;

        do {
            System.out.println("\n--- CATÁLOGO DIGITAL UNIVERSITARIO (BST) ---");
            System.out.println("1. Ver catálogo ordenado por ISBN");
            System.out.println("2. Insertar nuevo libro");
            System.out.println("3. Verificar si un ISBN existe");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println();
                    catalogo.imprimirCatalogo();
                    break;

                case 2:
                    System.out.print("ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año de publicación: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    catalogo.insertar(isbn, titulo, autor, anio);
                    break;

                case 3:
                    System.out.print("Ingrese el ISBN a buscar: ");
                    long buscar = scanner.nextLong();
                    scanner.nextLine();
                    boolean existe = catalogo.existeISBN(buscar);

                    if (existe)
                        System.out.println("El ISBN ya existe en el catálogo.");
                    else
                        System.out.println("El ISBN NO está registrado.");
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
