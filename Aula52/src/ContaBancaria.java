public  class ContaBancaria {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Pessoa pessoa;

    public ContaBancaria(int agencia,int numero, double saldo,Pessoa pessoa){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo=saldo;
        this.pessoa = pessoa;
    }
    public double getSaldo(double saldo){
        return saldo;

    }

}
