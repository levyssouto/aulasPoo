public abstract class Arma {

    protected double destruicao;
    public Arma(){

        this.destruicao = destruicao;
    }

    public double golpear(){
        return 4;
    }

    public String infos(){
     String msg = "destruicao foi de: " + this.destruicao;
        return msg;
    }



}
