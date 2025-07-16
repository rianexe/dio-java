package facade;

import factory.Pedido;
import factory.PedidoFactory;
import observer.EmailService;
import observer.PedidoNotifier;
import singleton.PedidoRepository;

public class LojaFacade {
    private final PedidoNotifier notifier;

    public LojaFacade(){
        this.notifier = new PedidoNotifier();
        notifier.adicionarObserver(new EmailService());
    }

    public void criarPedido(String tipo){
        Pedido pedido = PedidoFactory.criarPedido(tipo);
        pedido.processar();
        PedidoRepository.getInstancia().adicionar(pedido);
        notifier.notificarTodos("Pedido do tipo '" + tipo + "' criado com sucesso!");
    }
}
