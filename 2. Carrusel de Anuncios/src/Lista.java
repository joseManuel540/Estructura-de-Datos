/*El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el 
anuncio que más veces se ha repetido.
Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas completas por 
todos los anuncios, incrementando vecesRepetido en cada paso e imprimiendo qué anuncio está en 
pantalla. Al finalizar, muestra el anuncio más repetido y el tiempo total acumulado en pantalla. */
public class Lista {
    Anuncio cabeza;
    Anuncio cola;

    public Lista(){
        cabeza = null;
        cola = null;
    }

    public void agregarAnuncio(Anuncio a){
        if (cabeza == null) {
            cabeza = a;
            cola = a;
            a.siguiente = cabeza; 
        } else {
            cola.siguiente = a; 
            a.siguiente = cabeza; 
            cola = a; 
        }
    }

    public void mostrarAnuncios(){
        if (cabeza == null) {
      System.out.println("No hay anuncios registrados.");
      return;
    }
    Anuncio actual = cabeza;
    do {
      System.out.println("Nombre: " + actual.titulo + ", Numero de veces repetido: " + actual.vecesRepetido + ", Categoria: " + actual.categoria);
      actual = actual.siguiente;
    } while (actual != cabeza);
    }

    public void reproducir(int ciclos){
    int duracion = 0;
    if (cabeza == null) {
        System.out.println("No hay anuncios para realizar los ciclos.");
        return;
    }

    Anuncio actual = cabeza;
    for (int i = 0; i < ciclos; i++) {
        do {
            System.out.println("Mostrando: " + actual.titulo);
            actual.vecesRepetido++;
            duracion += actual.duracionSegundos;

            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    Anuncio actual2 = cabeza;
    Anuncio masRepetido = cabeza;
    do {
        if (actual2.vecesRepetido > masRepetido.vecesRepetido) {
            masRepetido = actual2;
        }
        actual2 = actual2.siguiente;
    } while (actual2 != cabeza);

    System.out.println("\nEl anuncio más repetido fue:");
    System.out.println("Nombre: " + masRepetido.titulo + ", Veces: " + masRepetido.vecesRepetido + ", Categoria: " + masRepetido.categoria);
    System.out.println("Tiempo total en pantalla: " + duracion + " segundos");
}
}
