import one.digitalinnovation.gof.facade.Facade;

public class Main {
    //Projeto para o estudo: Java Puro Facade
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();
        facade.migrarCliente("Rian", "07854-020");
    }
}
