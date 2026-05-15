package NiveIntermediario.Desafios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu = "===== Menu Ninja =====\n" +
                      "1. Cadastrar Ninja\n" +
                      "2. Listar Ninjas\n" +
                      "3. Alterar Habilidade Especial\n" +
                      "4. Sair\n" +
                      "Escolha uma opção: ";

        // Contadores
        int escolhaDoUsuarioMenu = 0;
        int isUchiha = 0;
        int countUchiha = 0;
        int numeroNinjasCadastrados = 0;
        int numeroMaxNinjas = 5;

        //Array de Ninjas
        Ninja[] ninjas = new Ninja[numeroMaxNinjas];

        Scanner scanner = new Scanner(System.in);

        while (escolhaDoUsuarioMenu != 4) {
            System.out.println(menu);
            escolhaDoUsuarioMenu = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaDoUsuarioMenu) {
                case 1:
                    if (numeroNinjasCadastrados >= ninjas.length) {
                        System.out.println("Limite de ninjas atingido");
                        break;
                    }

                    System.out.println("Você deseja cadastrar um Uchiha?\n" +
                                       "1. Sim\n" +
                                       "2. Não");
                    isUchiha = scanner.nextInt();
                    scanner.nextLine();
                    if (isUchiha == 1) {
                        Uchiha U = new Uchiha();
                        System.out.println("Nome:");
                        U.nome = scanner.nextLine();
                        System.out.println("Idade:");
                        U.idade = scanner.nextInt();
                        System.out.println("Missão:");
                        scanner.nextLine();
                        U.missao = scanner.nextLine();
                        System.out.println("Nivel de Dificuldade:");
                        U.nivelDificuldade = scanner.nextLine();
                        System.out.println("Status:");
                        U.statusMissao = scanner.nextLine();
                        System.out.println("Habilidade Especial:");
                        U.habilidadeEspecial = scanner.nextLine();

                        ninjas[numeroNinjasCadastrados] = U;
                        numeroNinjasCadastrados++;
                        countUchiha++;
                    } else {
                        Ninja N = new Ninja();
                        System.out.println("Nome:");
                        N.nome = scanner.nextLine();
                        System.out.println("Idade:");
                        N.idade = scanner.nextInt();
                        System.out.println("Missão:");
                        scanner.nextLine();
                        N.missao = scanner.nextLine();
                        System.out.println("Nivel de Dificuldade:");
                        N.nivelDificuldade = scanner.nextLine();
                        System.out.println("Status:");
                        N.statusMissao = scanner.nextLine();

                        ninjas[numeroNinjasCadastrados] = N;
                        numeroNinjasCadastrados++;
                    }
                    System.out.println("Ninja cadastrado com sucesso!");
                    break;
                case 2:
                    if (numeroNinjasCadastrados == 0) {
                        System.out.println("Ainda não foi cadastrado nenhum ninja!");
                    } else {
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < numeroNinjasCadastrados; i++) {
                            ninjas[i].mostrarInformacoes();
                            System.out.println("\n");
                        }
                    }
                    break;
                case 3:
                    if (countUchiha == 0) {
                        System.out.println("Nenhum ninja com habilidade especial cadastrado!");
                    } else {
                        boolean temUchiha = false;
                        for (int i = 0; i < numeroNinjasCadastrados; i++) {
                            if (ninjas[i] instanceof Uchiha) {
                                temUchiha = true;
                                System.out.println("===== Uchiha Encontrado ====");
                                System.out.println(ninjas[i].nome);
                                Uchiha uchiha = (Uchiha) ninjas[i];
                                System.out.println("Habilidade Atual: " + uchiha.habilidadeEspecial);
                                System.out.println("Descreva uma nova habilidade:");
                                uchiha.habilidadeEspecial = scanner.nextLine();
                                System.out.println("Habilidade especial alterada!");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

            }

        }

        /*
        // Objeto criado a partir da classe mãe Ninja
        Ninja NinjaDefault = new Ninja();
        NinjaDefault.nome = "Ninja Default";
        NinjaDefault.idade = 17;
        NinjaDefault.missao = "Defender a aldeia do ataque inimigo";
        NinjaDefault.nivelDificuldade = "B";
        NinjaDefault.statusMissao = "Em andamento";
        NinjaDefault.mostrarInformacoes();

        System.out.println("\n");

        //Objeto criado a partir da classe filha Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Atacar a vila inimiga em busca de recursos";
        Sasuke.nivelDificuldade = "S";
        Sasuke.statusMissao = "Concluída";
        Sasuke.habilidadeEspecial = "Ativar o Sharingan";
        Sasuke.mostrarHabilidadeEspecial();
        */
    }


}
