import java.util.*;
public class Ex11 {


    //private Vector<Candidato> candidatos = new Vector<Candidato>();
    //candidatos.add(c); // c é um objeto da classe Candidato

    public static void main(String args[]) {

        Urna urna = new Urna();

        int votos = 0;

        Scanner sc = new Scanner(System.in);

        while (votos < urna.getVotos().capacity()) {
            try {
                System.out.println("ELEICOES 2021 - PREFEITURA FICTICIA");
                System.out.println("====================================");
                System.out.print("Digitie o numero o candidato: ");
                int op = sc.nextInt();
                Candidato c = urna.getCandidato(op);
                System.out.print("Deseja votar no " + c.getNome() + " (S/N)?");
                String resposta = sc.next();
                if (resposta.equals("S")) {
                    urna.inserirVoto(op);
                    votos++;
                    System.out.println("Voto confirmado!");
                }
            } catch (UrnaException ue) {
                System.out.println(ue.getMessage());
            }
        }

        Vector<Candidato> r = urna.contabilizar();

        for (Candidato c: r){
            System.out.println("Candidato" + c.getNome() + "total de votos = "+c.getTotalVotos());
        }
        /*
         Contabilizar o total de votos de cada candidato, e exibir em ordem decrescente a
        quantidade de votos.
        */

    }
}




