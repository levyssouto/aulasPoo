public class Faca extends Arma{


    private int lamina;
    public Faca(double destruicao) {
       this.destruicao = destruicao;
       this.lamina = 3;
    }

    public double golpear(){
        int lamina = this.lamina;
        if(lamina>= super.golpear() || lamina<=0){
            System.out.println("Lamina quebrada");
            return 0;
        }else
            return destruicao;

    }
    public String infos(){
        String msg = super.infos() +  "\nLamina = " + this.lamina;
        return msg;
    }

}
