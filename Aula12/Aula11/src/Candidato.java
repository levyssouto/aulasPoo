public class Candidato implements Comparable<Candidato> {

    private String nome;
    private int numero = 0;
    private int totalVotos;

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

    public void setTotalVotos(int t) {
        this.totalVotos = t;
    }

    public int getTotalVotos() {
        return this.totalVotos;
    }

    @Override
    public int compareTo(Candidato o) {
        return o.getTotalVotos() - this.totalVotos;
    }

}