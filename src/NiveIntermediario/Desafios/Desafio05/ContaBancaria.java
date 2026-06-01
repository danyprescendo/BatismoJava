package NiveIntermediario.Desafios.Desafio05;

public abstract class ContaBancaria implements Conta{

    int numeroConta;
    String titular;
    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + saldo + " reais");
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public String toString() {
        return "Esta é uma conta bancária";
    }
}
