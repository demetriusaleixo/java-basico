public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // Estado inicial de ligada = false 'desligada'
        smartTv.ligarTv();
        smartTv.desligarTv();
        System.out.println("Estado da TV: " + smartTv.ligada);

        // Volume inicial = 10
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // Canal inicial = 1
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.escolherCanal(17);
        System.out.println("Canal atual : " + smartTv.canal);
    }
}
