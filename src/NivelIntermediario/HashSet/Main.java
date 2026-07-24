package NivelIntermediario.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Tsunade");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println(ninjas);

        // HashSet
        // Usado para garantir que não tenha nenhum item duplicado
        // Não tem ordenação
        /*Set<String> ninjasSet = new HashSet<>();*/

        // TreeSet
        // Usado para garantir que não tenha nenhum item duplicado
        // Possui ordenação de acordo com a tipagem Ex.: (String -> ordenação alfabética / Integer -> ordenação numérica)
        /*Set<String> ninjasSet = new TreeSet<>();*/

        // LinkedHashSet
        // Usado para garantir que não tenha nenhum item duplicado
        // Ordena os itens de acordo com a sequência de inserção
        Set<String> ninjasSet = new LinkedHashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println(ninjasSet);

    }
}
