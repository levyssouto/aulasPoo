public abstract class Produto {

    private String nome;
    private double valor;

    public Produto(String nome,double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public double getValorLiquido(){
        return 0;
    }


}
