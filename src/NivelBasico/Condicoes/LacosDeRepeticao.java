package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de repetição: Vão repetir infinitamente ou até atingir o parâmetro desejado
        * WHILE e FOR
         */

        // WHILE
        // While (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones ++; // numeroDeClones + 1
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto está se clonando, já se clonou " + i + " vezes");
        }


    }
}
