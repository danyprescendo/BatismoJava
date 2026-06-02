package NiveIntermediario.Desafios.Desafio05;

public abstract class ContaBancaria implements Conta {

    int numeroConta;
    String titular;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public ContaBancaria(int numeroConta, String titular, double saldo, TipoConta tipoConta) {
        this(numeroConta, titular, saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + saldo + " reais");
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void tranferenciaEntreContas(ContaBancaria contaDestino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Tranferência de " + valor + "R$ realizada com sucesso para " + contaDestino.titular);
            this.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente para completar a trasnferência!");
        }
    }

    @Override
    public String toString() {
        return "Esta é uma conta bancária do Banco de Konoha";
    }
}
