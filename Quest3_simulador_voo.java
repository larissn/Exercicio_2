public class Quest3_simulador_voo {

    public static void main(String[] args){
        Quest3_aviao_simulador avianca = new Quest3_aviao_simulador(900, 10);
        System.out.println("Velocidade: "+avianca.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+avianca.getAltitude()+" Km\n");
        avianca.menosAltitude(1);
        avianca.menosVelocidade(100);
        System.out.println("Velocidade: "+avianca.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+avianca.getAltitude()+" Km");
    }
}
