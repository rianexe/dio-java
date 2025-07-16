package factory;

public class PedidoFactory {
    public static Pedido criarPedido(String tipo){
        if ("expresso".equalsIgnoreCase(tipo)){
            return new PedidoExpresso();
        }

        return new PedidoNormal();
    }
}
