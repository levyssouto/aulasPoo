public class Exercicio7 {

    public static void main(String[] args){
        Faca adaga = new Faca(4);
        Revolver eagle = new Revolver(5);
        LancaChama trevor = new LancaChama(20);

        agredir(adaga);
        atirar(eagle);
        atirar(trevor);



        System.out.println("Faca: " + adaga.infos());
        System.out.println("Revolver: " + eagle.infos());
        System.out.println("Lança chamas:" + trevor.infos());

        reload(trevor);
        System.out.println("Lança chamas:" + trevor.infos());

    }
    public static void agredir(Arma a){
        a.golpear();
    }
    public static void atirar(Disparavel d){
        d.disparar();
    }
    public static void reload(Disparavel d){
        d.recarregar();
    }




}
