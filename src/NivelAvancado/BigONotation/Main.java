package NivelAvancado.BigONotation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // O que é um algoritmo?
        // R: Algoritmo é tudo que fazemos na programação.

        ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
        ninjas.add(new Ninja("Naruto Uzumaki", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", 17));
        ninjas.add(new Ninja("Sakura Haruno", 17));

        // Algoritmo - Complexidade Constante -> O(1)
        System.out.println(ninjas.get(2));

        // Algoritmo - Complexidade Linear -> O(N)
        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

        System.out.println("=====================================");

        // Algoritmo - Complexidade Quadrática -> O(N²)
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + " VS " + ninjas.get(j));
            }
        }

    }

}
