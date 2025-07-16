package singleton;

import factory.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {
    private static PedidoRepository instancia;
    private List<Pedido> pedidos = new ArrayList<>();

    private PedidoRepository(){

    }

    public static PedidoRepository getInstancia(){
        if (instancia == null){
            instancia = new PedidoRepository();
        }

        return instancia;
    }

    public void adicionar (Pedido pedido){
        pedidos.add(pedido);
    }

    public List<Pedido> listar(){
        return pedidos;
    }
}
