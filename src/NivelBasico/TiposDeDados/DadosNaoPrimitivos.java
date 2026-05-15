package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que é digitado dentro do PSVM vai ser compilado pelo Java

        /*
        * Dados não primitivos: String, Array, CLass, Enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase(); // toLowerCase vai colocar tudo minúsculo
        System.out.println(aldeiaLowerCase);
    }
}