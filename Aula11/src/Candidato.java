public class Candidato {

    private String nome;
    private int numero;
    //criar o atributo total votos;
    private int total_votos=0;

    public Candidato() {

    }

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotalVotos() {
        return total_votos;
    }

    public void setTotalVotos(int total_votos) {
        this.total_votos = total_votos;
    }
}