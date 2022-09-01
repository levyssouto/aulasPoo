public class EX5 {
    public static void main(String[] args){

        PJ pessoa1 = new PJ("Ronaldo","Boqueirão",4400,"87746");
        PF pessoa2 = new PF("Serafim","Embaré",7000);
        System.out.println("Rendimentos de PJ: " + pessoa1.nome);
        System.out.println(pessoa1.calculaImposto(pessoa1.rendimentos));

        System.out.println("Rendimentos de PF" + pessoa2.nome);
        System.out.println(pessoa2.calculaImpost(pessoa2.rendimentos));


    }


}
