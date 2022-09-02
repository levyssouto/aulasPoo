public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int agencia,int numero,double saldo, Pessoa pessoa){
        super(agencia, numero, saldo, pessoa);
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;


    }
}
