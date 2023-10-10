public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=20;

    public void mudarCanal (int escolherCanal) {
        canal = escolherCanal;
    }

    public void mudarCanalSubir (){
        canal++;
        //abreviação para canal = canal + 1;
    }

    public void mudarCanalAbaixar (){
        canal--;
        //abreviação para canal = canal - 1;
    }

    public void aumentarVolume(){
        volume++;
        //abreviação para volume = volume + 1;
        System.out.println("Aumentando o volume: " + volume);
    }
    public void dominuirVolume(){
        volume--;
        //abreviação para volume = volume - 1;
        System.out.println("DIminuindo o volume: " + volume);
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }
}
