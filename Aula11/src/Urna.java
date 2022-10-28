import java.util.Vector;

public class Urna {

    private Vector <Candidato> candidatos = new Vector<Candidato>(2);
    private Vector <Integer> votos = new Vector<Integer>(5);
    //private int[] votos = new int[5];
    //private int idx = 0;

    public Urna() {
        Candidato c1 = new Candidato("Guilherme Prado",50);
        Candidato c2 = new Candidato("Arthur Durval",51);

        candidatos.add(c1);
        candidatos.add(c2);
    }

    public Candidato getCandidato(int numero) throws UrnaException {
        for(Candidato c: this.candidatos) {
            if(c.getNumero() == numero) {
                return c;
            }
        }
        throw new UrnaException("Candidato não encontrado!", UrnaException.CANDIDATO_INEXISTENTE);
    }

    public void inserirVoto(int numero) {
        //this.votos[idx] = numero;
        //this.idx++
        this.votos.add(numero);
    }

    public Vector<Integer> getVotos() {
        return this.votos;
    }


    public Vector<Candidato> contabilizar() {
        /* contar todos os votos presentes no atributo votos, e armazenar o total de vontos em cada um 
        dos objetos Candidato presentes no atrituto candidatos.
        Deve retorna o atributo candidatos
        */
        for(Integer v: this.votos){
            if(v == this.candidatos.get(0).getNumero()){
                Candidato c = this.candidatos.get(0);
                int total = c.getTotalVotos();
                c.setTotalVotos(total + 1);
            } else if (v == this.candidatos.get(1).getNumero()) {
                Candidato c = this.candidatos.get(1);
                int total = c.getTotalVotos();
                c.setTotalVotos(total+1);
            }
        }
        return this.candidatos;
    }

}