import facade.LojaFacade;

public class Main {
    public static void main(String[] args) throws Exception {
        LojaFacade loja = new LojaFacade();

        loja.criarPedido("normal");
        loja.criarPedido("expresso");
    }
}
