package NivelIntermediario.Desafios.Desafio05;

public class Main {
    public static void main(String[] args) {

        // Conta Corrente
        /*ContaCorrente contaCorrente = new ContaCorrente(55, "Naruto Uzumaki", 0, TipoConta.CORRENTE);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(1500);
        contaCorrente.consultarSaldo();
        System.out.println(contaCorrente);*/

        // Conta Poupança
        /*ContaPoupanca contaPoupanca = new ContaPoupanca(55, "Sasuke Uchiha", 0,  TipoConta.POUPANCA);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();
        System.out.println(contaPoupanca);*/

        // Transferência entre contas
        ContaCorrente contaDoNaruto = new ContaCorrente(555, "Naruto Uzumaki", 0, TipoConta.CORRENTE);
        contaDoNaruto.depositar(5000);

        ContaPoupanca contaDoSasuke = new ContaPoupanca(999, "Sasuke Uchiha", 0, TipoConta.POUPANCA);
        contaDoSasuke.depositar(10000);

        contaDoNaruto.tranferenciaEntreContas(contaDoSasuke, 2000);

    }




}
