package NiveIntermediario.Desafios.Desafio05;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public ContaPoupanca(int numeroConta, String titular, double saldo, TipoConta tipoConta) {
        super(numeroConta, titular, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor * 0.01); // Dedução de 1%
    }

    @Override
    public String toString() {
        return "---------- Conta Poupança ---------\n" +
                "Nª da Conta: " + numeroConta + "\n" +
                "Titular: " + titular +  "\n" +
                "Saldo: " + saldo;
    }
}
