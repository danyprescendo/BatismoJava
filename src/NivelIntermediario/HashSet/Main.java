package NivelIntermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");

        System.out.println(ninjas);

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println(ninjasSet);

    }
}
