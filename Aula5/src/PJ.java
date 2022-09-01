public class PJ extends Pessoa{

    private String cnpj;
    public  PJ(String nome, String endereco, double rendimentos,
                    String cnpj){
        super(nome,endereco,rendimentos);
        this.cnpj = cnpj;
    }

    public double calculaImposto(double rendimentos){
        double calculo = rendimentos * 0.18;
        return calculo;
    }

}
