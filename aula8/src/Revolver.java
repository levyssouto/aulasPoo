public class Revolver extends Arma implements Disparavel{

    private int cartucho;

    public Revolver(double destruicao){
        this.destruicao = destruicao;
        this.cartucho = 10;

    }
    public void disparar(){
        if(this.cartucho>0)
            this.cartucho = this.cartucho - 1;

    }

    public void recarregar(){

        this.cartucho = 10;

    }
    public String infos(){
        String msg = super.infos() +  "\nCartuchos gastos = " + this.cartucho;
        return msg;
    }
}