package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos
        * Objetivo da aula: Criar um ninja - Naruto
        * */

        int idade = 17; // Valor Máximo: 2147483647
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 2147483647L; // Valor "Infinito"

        System.out.println(idade); // Comando para mostrar pro usuário
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
