package NivelBasico.Array;

public class Array {
    public static void main(String[] args) {

        /*
        * Array = Agrupador de Itens -> São tipo referência
        * Tipo do dado[] nomeDoArray = new Tipo do dado[quantidade de itens a serem alocados na memória]
         */

        // Array ninja
        // String inicializam como NULL
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        // System.out.println(ninja[2]);

        // Redeclarar ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[7]);

        // For para fazer um loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // Array idade
        // Int inicializam como 0
        int[] idade = new int[2];
        idade[0] = 16;
        //System.out.println(idade[1]);

        // Array trueOrFalse
        // Boolean inicializam como False
        boolean[] trueOrFalse = new boolean[1];
        //System.out.println(trueOrFalse[0]);

        //Array flutuante
        // Doubles inicalizam com 0.0
        double[] flutuante = new double[1];
        //System.out.println(flutuante[0]);

        String nomeDoNinja1 = "Gaara Do Deserto";
        String nomeDoNinja2 = "Rock Lee";

        // Redeclarar Variável
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";

        /*
        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
        */

    }
}
