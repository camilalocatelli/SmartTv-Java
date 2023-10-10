public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(6);
        //Indica o canal desejado digitando

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Tv está Ligada? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("NOVO STATUS - Tv está Ligada? " + smartTv.ligada);
    }
}
