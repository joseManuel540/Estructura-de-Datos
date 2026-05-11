public class ListaTren {
    Vagon cabeza;
    public ListaTren(){
        this.cabeza = null;
    }

    public void agregarVagonesFinal(Vagon nuevoVagon){
        if (cabeza == null) {
            cabeza = nuevoVagon;
        } else {
            Vagon actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVagon;
        }
    }

    public void BuscarPorId(String id){
        Vagon actual = cabeza;
        while (actual != null) {
            if (actual.id.equals(id)) {
                System.out.println("El vagon se encontro: " + actual.id + ", " + actual.contenido + ", " + actual.peso);
                return;
            }else {
                actual = actual.siguiente;
            }
        }
        System.out.println("El vagon no se encontro");
    }

    public double calcularPesoTotal(){
        double pesoTotal = 0;
        Vagon actual = cabeza;
        while (actual !=null) {
            pesoTotal += actual.peso;
            actual  = actual.siguiente;
        }
        return pesoTotal;
    }

    public void VagonMasPesado(){
        double pesado = 0;
        Vagon masPesado = cabeza;
        Vagon actual = cabeza;
        while (actual !=null) {
            if (pesado < actual.peso) {
                pesado = actual.peso;
                masPesado = actual;
            }
            actual  = actual.siguiente;
        }
        System.out.println("El vagon mas pesado es: "  + masPesado.id + ", " + masPesado.contenido + ", " + masPesado.peso);
    }

    public void mostrar(){
        Vagon actuall=cabeza;
        while (actuall != null) {
            System.out.println("\nId: " + actuall.id + "\nContenido: " + actuall.contenido + "\nPeso: " + actuall.peso);
            actuall = actuall.siguiente;
        }
    }

    public boolean IdRepetida(String id){
        Vagon actual = cabeza;
        while (actual != null) {
            if (actual.id.equals(id)) {
                return false;
            }else{
                actual = actual.siguiente;
            }
        }
        return true;
    }
}
