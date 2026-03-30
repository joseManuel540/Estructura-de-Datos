public class Tren {
    Vagon cabeza;

    public Tren(){
        this.cabeza = null;
    }

    public void agregarVagones(Vagon nuevoVagon){
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

    public double calcularPesoTotal(){
        double pesoTotal = 0;
        Vagon actual = cabeza;
        while (actual !=null) {
            pesoTotal += actual.pesoToneladas;
            actual  = actual.siguiente;
        }
        return pesoTotal;
    }
}
