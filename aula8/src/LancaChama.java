public class LancaChama extends Arma implements Disparavel {

    private double gas;

    public LancaChama(double destruicao){
        this.destruicao = destruicao;
        this.gas = 100;
    }
    public void disparar(){
        if(this.gas>0)
            this.gas = this.gas - 50;

    }

    public void recarregar(){

        this.gas = 100;

    }
    public String infos(){
        String msg = super.infos() + "\nGás gasto = " + this.gas;
        return msg;
    }

}