public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Ligando a TV...");
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume após aumentar: " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Canal após mudar: " + smartTv.canal);

        smartTv.avancarCanal();
        smartTv.retrocederCanal();
        smartTv.mudarCanal(1000); // Teste de canal inválido
        
        smartTv.desligar();
        System.out.println("Desligando a TV...");

    }
}
