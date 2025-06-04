public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    //Estado da TV
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    //Alterando o volume
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume mínimo atingido.");
        }
    }

    //Alterando o canal
    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 999) {
            canal = novoCanal;
        } else {
            System.out.println("Canal inválido. Deve ser entre 1 e 999.");
        }
    }

    public void avancarCanal(){
        canal++;
    }

    public void retrocederCanal(){
        canal--;
    }
}
