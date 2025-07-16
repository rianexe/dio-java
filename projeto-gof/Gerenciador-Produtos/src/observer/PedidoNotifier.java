package observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoNotifier {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer o){
        observers.add(o);
    }

    public void notificarTodos(String mensagem){
        for (Observer o : observers){
            o.notificar(mensagem);
        }
    }
}
