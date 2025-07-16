package one.digitalinnovation.gof;

/* 
    Projeto DIO - Praticando com Java Puro: Singleton

    "Singleton Preguiçoso"
*/
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
