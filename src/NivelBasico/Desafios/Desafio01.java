package NivelBasico.Desafios;

public class Desafio01 {
    public static void main(String[] args) {

        /*
        * Desafio 1: Criar 3 ninjas
         */

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Batalhar com o vilão";
        char nivelMissao1 = 'S';
        String statusMissao1 = "Em Andamento";

        // Verificar idade do ninja
        if (idadeNinja1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') { // Verificar nível da missão
                statusMissao1 = "Concluída";
            } else {
                statusMissao1 = "Não Concluída";
            }
        } else {
            statusMissao1 = "Concluída";
        }

        System.out.println("-----------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Missão : " + missaoNinja1);
        System.out.println("Nível da missão: " + nivelMissao1);
        System.out.println("Status da missão: " + statusMissao1);

        System.out.println("-----------------------------------------");

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 22;
        String missaoNinja2 = "Proteger a aldeira";
        char nivelMissao2 = 'S';
        String statusMissao2 = "Em Andamento";

        // Verificar idade do ninja
        if (idadeNinja2 < 15) {
            if (nivelMissao2 == 'C' || nivelMissao2 == 'D') { // Verificar nível da missão
                statusMissao2 = "Concluída";
            } else {
                statusMissao2 = "Não Concluída";
            }
        } else {
            statusMissao2 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missão : " + missaoNinja2);
        System.out.println("Nível da missão: " + nivelMissao2);
        System.out.println("Status da missão: " + statusMissao2);

        System.out.println("-----------------------------------------");

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 12;
        String missaoNinja3 = "Curar aliados feridos";
        char nivelMissao3 = 'B';
        String statusMissao3 = "Em Andamento";

        // Verificar idade do ninja
        if (idadeNinja3 < 15) {
            if (nivelMissao3 == 'C' || nivelMissao3 == 'D') { // Verificar nível da missão
                statusMissao3 = "Concluída";
            } else {
                statusMissao3 = "Não Concluída";
            }
        } else {
            statusMissao3 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missão : " + missaoNinja3);
        System.out.println("Nível da missão: " + nivelMissao3);
        System.out.println("Status da missão: " + statusMissao3);

    }
}
