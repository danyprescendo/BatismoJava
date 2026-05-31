package NiveIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {

    // TODO: incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    // Metodo existente: Primeiro Metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos você não precisa redeclarar o reconstutor, apenas os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo geral, todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + "! Essa é minha ESTRATEGIA de combate");
    }

    // Inteligencia de Combate - Metodo padrão
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + "! Essa é minha INTELIGENCIA de combate");
    }

    // Inteligencia de Combate - Sobrecarga do metodo
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + "e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + "e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + "e você precisa treinar mais suas estratégias");
        }
    }

    /*// Metodo sem @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Ninja");
    }*/

}
