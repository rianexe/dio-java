public class Carro {
    private String modelo;
    private String cor;
    private int capacidadeTanque;

    //Construtores
    Carro(){

    }

    Carro(String modelo, String cor, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    Carro(String modelo, String cor){
        this.cor = cor;
        this.modelo = modelo;
    }

    //Getters and setters
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //Métodos 
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

    public void exibirCarro(){
        System.out.println("Exibindo dados do carro:" + modelo + ", " + cor + ", "  + capacidadeTanque);
    }


}
