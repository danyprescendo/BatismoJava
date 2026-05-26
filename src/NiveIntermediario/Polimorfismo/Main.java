package NiveIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja não pode ser criado, Ninja é uma classe abstract

        // Objeto Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Objeto Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

    }
}
