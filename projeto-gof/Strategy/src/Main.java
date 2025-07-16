import one.digitalinnovation.gof.strategy.*;

public class Main {
    //Teste do projeto: Praticando com Java Puro: Strategy
    public static void main(String[] args) throws Exception {
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
    }
}
