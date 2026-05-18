package NiveIntermediario.Desafios.Desafio03;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Ninja: " + nome + "\n" +
                           "Idade: " + idade + "\n" +
                           "Missão: " + missao + "\n" +
                           "Dificuldade: " + nivelDificuldade + "\n" +
                           "Status: " + statusMissao);
    }
}
