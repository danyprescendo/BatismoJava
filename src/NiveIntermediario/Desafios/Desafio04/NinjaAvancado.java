package NiveIntermediario.Desafios.Desafio04;

public class NinjaAvancado implements Ninja{

    // Atributos
    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    // Construtor vazio
    public NinjaAvancado() {
    }

    // Construtor com todos os argumentos
    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    // Metodos
    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, minha habilidade é " + habilidade + " e minha especialidade é " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + nome + " está executando a habilidade " + habilidade);
    }

}
