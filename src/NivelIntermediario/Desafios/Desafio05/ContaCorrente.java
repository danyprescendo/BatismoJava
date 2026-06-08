package NivelIntermediario.Desafios.Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public ContaCorrente(int numeroConta, String titular, double saldo, TipoConta tipoConta) {
        super(numeroConta, titular, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "---------- Conta Corrente ---------\n" +
                "Nª da Conta: " + numeroConta + "\n" +
                "Titular: " + titular +  "\n" +
                "Saldo: " + saldo;
    }
}
