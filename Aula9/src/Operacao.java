public class Operacao {

    private int resultado = 0;

    public void dividir(int divisor) throws ArithmeticException {
        this.resultado =  this.resultado / divisor;
    }
    public void mod(int divisor) throws ArithmeticException{
        this.resultado = this.resultado % divisor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }



}