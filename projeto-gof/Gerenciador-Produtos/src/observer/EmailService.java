package observer;

public class EmailService implements Observer{
    @Override
    public void notificar(String mensagem){
        System.out.println("Enviando email: " + mensagem);
    }
}
