package NiveIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja não pode ser criado, Ninja é uma classe abstract

        // Objeto Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 2, NivelNinja.CHUUNIN);
        naruto.habilidadeEspecial();

        // Objeto Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obejto Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();

        // Obejto Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        // metodo comum
        madara.inteligenciaDeCombate();
        // metodo sobrecarregado
        madara.inteligenciaDeCombate(90);
    }
}
