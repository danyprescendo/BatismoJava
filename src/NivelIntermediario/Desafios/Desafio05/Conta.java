package NivelIntermediario.Desafios.Desafio05;

public interface Conta {

    void consultarSaldo();
    void depositar(double valor);
    void tranferenciaEntreContas(ContaBancaria contaDestino, double valor);

}
