package NiveIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Foha", 17, 30, 1.67);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Meu novo nome é: " + naruto.getNome());

        System.out.println("--------------- Sasuke Uchiha ---------------");

    }
}
