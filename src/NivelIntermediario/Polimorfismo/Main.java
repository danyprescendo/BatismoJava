package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja não pode ser criado, Ninja é uma classe abstract

        // Objeto Uzumaki
        System.out.println("--------------- Naruto Uzumaki --------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 2, NivelNinja.CHUUNIN);
        System.out.println(naruto);
        naruto.tacarKunai();
        // naruto.altura = 1.76 Não pode ser setado por ser um atributo definido como FINAL, que não podem ser alterados
        System.out.println(naruto.altura);

        // Objeto Uchiha
        System.out.println("--------------- Sasuke Uchiha --------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        System.out.println(sasuke);
    }

}
