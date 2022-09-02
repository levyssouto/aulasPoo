public class EX5 {
    public static void main(String[] args){

        PJ pessoa1 = new PJ("Ronaldo","Boqueirão",4400,"87746");
        PF pessoa2 = new PF("Serafim","Embaré",7000);
        System.out.println("Rendimentos de PJ: " + pessoa1.nome);
        System.out.println(pessoa1.calculaImposto(pessoa1.rendimentos));

        System.out.println("Rendimentos de PF: " + pessoa2.nome);
        System.out.println(String.format("%,.2f",pessoa2.calculaImpost(pessoa2.rendimentos)));

        ContaCorrente cc = new ContaCorrente(123,1257,12.145,pessoa2);
        ContaPoupanca cp = new ContaPoupanca(133,5689,2.500,pessoa1);

        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo(cc.saldo));
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo(cp.saldo));

        cc.depositar(50);
        cp.setJuros((float)0.8);
        System.out.println("Saldo da Conta Corrente: " + String.format("%,.3f" ,cc.getSaldo(cc.saldo)));
        System.out.println("Saldo da Conta Poupança: " +String.format("%,.3f",cp.novoSaldo(cp.getJuros())));


    }
}
