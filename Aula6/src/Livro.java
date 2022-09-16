public class Livro extends Produto {

    private String isbn;

    public Livro(String nome, double valor, String isbn) {
        super(nome,valor);
        this.isbn = isbn;
    }

    public double getValorLiquido(){
        return getValor() * 0.75;
    }


}