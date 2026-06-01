/*El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo
ordenado de menor a mayor por ISBN para enviarlo a la sede central. También debe verificar si un
ISBN específico ya existe en el catálogo antes de registrar una donación.
Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los
libros en orden ascendente de ISBN (imprime isbn - titulo - autor). Además, implementa
existeISBN(long isbn) que retorne true si el libro ya está registrado y false en caso contrario. */

public class ArbolLibros {

    private Libro raiz;

    public ArbolLibros() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    private Libro insertar(Libro nodo, long isbn, String titulo, String autor, int anioPublicacion) {

        if (nodo == null)
            return new Libro(isbn, titulo, autor, anioPublicacion);

        if (isbn < nodo.isbn)
            nodo.izquierdo = insertar(nodo.izquierdo, isbn, titulo, autor, anioPublicacion);

        else if (isbn > nodo.isbn)
            nodo.derecho = insertar(nodo.derecho, isbn, titulo, autor, anioPublicacion);

        else
            System.out.println("Ya existe un libro con ISBN " + isbn);

        return nodo;
    }

    public void insertar(long isbn, String titulo, String autor, int anioPublicacion) {

        raiz = insertar(raiz, isbn, titulo, autor, anioPublicacion);
    }

    private boolean existeISBN(Libro nodo, long isbn) {

        if (nodo == null)
            return false;

        if (isbn == nodo.isbn)
            return true;

        if (isbn < nodo.isbn)
            return existeISBN(nodo.izquierdo, isbn);

        else
            return existeISBN(nodo.derecho, isbn);
    }

    public boolean existeISBN(long isbn) {
        return existeISBN(raiz, isbn);
    }

    private void imprimirCatalogo(Libro nodo) {

        if (nodo != null) {

            imprimirCatalogo(nodo.izquierdo);
            System.out.println("  " + nodo);
            imprimirCatalogo(nodo.derecho);
        }
    }

    public void imprimirCatalogo() {

        if (isEmpty()) {
            System.out.println("  [ Catálogo vacío ]");
            return;
        }
        System.out.println("  Catálogo ordenado por ISBN:");
        imprimirCatalogo(raiz);
    }
}
