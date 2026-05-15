package NivelBasico.Desafios;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        /*
        * Objetivo: Cadastrar os ninjas em um array e depois mostrar opções com switch cases
         */

        // Menu
        String menu = "===== Menu Ninja =====\n" +
                      "1. Cadastrar Ninja\n" +
                      "2. Listar Ninjas\n" +
                      "3. Excluir Ninja\n" +
                      "4. Sair\n" +
                      "Escolha uma opção: ";

        // Contadores
        int numeroDeNinjasCadastrados = 0;
        int escolhaDoUsuario = 0;

        // Array
        int numeroMaximoDeNinjas = 3;
        String[] ninjas = new String[numeroMaximoDeNinjas];

        Scanner scanner = new Scanner(System.in);

        // Regra para funcionalidade do menu
        while (escolhaDoUsuario != 4) {
            System.out.println(menu);
            escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine(); // O nextInt do Scanner não consome a quebra de linha, quando entra no for executa o enter pendente!
            switch (escolhaDoUsuario) {
                case 1: // Cadastrar
                    if (numeroDeNinjasCadastrados < numeroMaximoDeNinjas) {
                        System.out.println("Digite o nome do ninja " + (numeroDeNinjasCadastrados + 1) + ":");
                        ninjas[numeroDeNinjasCadastrados] = scanner.nextLine();
                        numeroDeNinjasCadastrados++;
                    } else {
                        System.out.println("Número máximo de ninjas já cadastrados!");
                    }
                    break;
                case 2: // Listar
                    if (numeroDeNinjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println((i + 1) + " - " + ninjas[i]);
                        }
                    }
                    break;
                case 3: // Excluir
                    if (numeroDeNinjasCadastrados == 0) {
                        System.out.println("Não existem ninjas a serem excluídos!");
                    } else {
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < numeroDeNinjasCadastrados; i++) {
                            System.out.println((i + 1) + " - " + ninjas[i]);
                        }
                        System.out.println("Digite o número do ninja a ser excluído:");
                        int opcaoExcluir = scanner.nextInt();
                        if (opcaoExcluir <= 0 || opcaoExcluir > numeroDeNinjasCadastrados) {
                            System.out.println("Opção Inválida!");
                        } else {
                            for (int i = opcaoExcluir; i < numeroDeNinjasCadastrados - 1; i++) {
                                ninjas[i] = ninjas[i + 1];
                            }
                            ninjas[numeroDeNinjasCadastrados - 1] = null;
                            numeroDeNinjasCadastrados--;
                            System.out.println("Ninja removido!");
                        }
                    }
                    break;
                case 4: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente!");
                    break;
            }
        }
        scanner.close();
    }
}