package NiveIntermediario.Desafios.Desafio05;

public class Main {
    public static void main(String[] args) {

        // Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente(99, "Naruto Uzumaki", 0);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(1500);
        contaCorrente.consultarSaldo();
        System.out.println(contaCorrente);

        // Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(55, "Sasuke Uchiha", 0);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();
        System.out.println(contaPoupanca);
    }



}
