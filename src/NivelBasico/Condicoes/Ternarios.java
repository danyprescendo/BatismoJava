package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: São maneiras de reduzir o código
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
         */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missoes" : "Ese ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);

    }
}
