public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio de POO / Classe Carro");

        Carro camaro = new Carro("Camaro" , "Preto" , 200);

        camaro.getModelo();
        camaro.getCor();
        camaro.getCapacidadeTanque();
        camaro.exibirCarro();

        camaro.setCor("Vermelho");
        camaro.setModelo("Camaro 2");
        camaro.setCapacidadeTanque(300);
        camaro.exibirCarro();

        System.out.println("O valor total para encher o tanque é: " + camaro.totalValorTanque(5));
    }
}
