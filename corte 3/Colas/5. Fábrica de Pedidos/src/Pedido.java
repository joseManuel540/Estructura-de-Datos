/*La Clase Pedido (Nodo): Debe contener numeroPedido (String), cliente (String), totalPagar (double) y cancelado 
(boolean).*/
public class Pedido {
    String numeroPedido;
    String cliente;
    double totalPagar;
    boolean cancelado;
    Pedido siguiente;

    public Pedido(String numeroPedido, String cliente, double totalPagar, boolean cancelado) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.totalPagar = totalPagar;
        this.cancelado = cancelado;
        this.siguiente = null;
    }
}
