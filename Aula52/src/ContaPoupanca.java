public class ContaPoupanca extends ContaBancaria{


    protected float juros;
    public ContaPoupanca(int agencia,int numero,double saldo, Pessoa pessoa){
        super(agencia, numero, saldo, pessoa);
    }
    public void deposita(double valor){
        this.saldo = saldo + valor;

    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
 public double novoSaldo(float juros){
        return this.saldo = this.saldo * juros;
 }

}
