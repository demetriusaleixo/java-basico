public class SmartTv {

    boolean ligada = false;
    int volume = 10;
    int canal = 1;

    public void ligarTv() {
        ligada = true;
    }

    public void desligarTv() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume ++;
    }

    public void diminuirVolume() {
        volume --;
    }

    public void aumentarCanal() {
        canal ++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }
}