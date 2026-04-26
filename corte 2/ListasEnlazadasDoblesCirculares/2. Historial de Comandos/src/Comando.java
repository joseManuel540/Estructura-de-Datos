/*La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio 
(String — el path desde donde se ejecutó).*/
public class Comando {
    String texto;
    boolean exitoso;
    String directorio;
    Comando siguiente;
    Comando anterior;

    public Comando(String texto, boolean exitoso, String directorio){
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
        this.siguiente = null;
        this.anterior = null;
    }
}
