public class DVD extends Produto{

    private String sn;
    public DVD(String nome, double valor,String sn) {
        super(nome,valor);
        this.sn = sn;
    }

    public double getValorLiquido(){
        return getValor() * 0.9;
    }

}
