package NiveIntermediario.Desafios.Desafio04;

public class NinjaBasico implements Ninja {

    // Atributos
    String nome;
    int idade;
    TipoHabilidade habilidade;

    // Construtor vazio
    public NinjaBasico() {
    }

    // Construtor com todos os argumentos
    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    // Metodos
    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e minha habilidade é " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + nome + " está executando a habilidade " + habilidade);
    }

}
