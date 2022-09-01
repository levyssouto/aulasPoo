public class PF extends Pessoa {

    public PF(String nome, String endereco, double rendimentos) {
        super(nome, endereco, rendimentos);
    }

    public double calculaImpost(double rendimentos) {
        double calculo;
        if (rendimentos > 3000) {
            calculo = rendimentos * 0.275;
        } else {
            calculo = rendimentos * 0.11;
        }

        return calculo;
    }
}