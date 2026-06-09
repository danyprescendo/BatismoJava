package NivelIntermediario.List;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos, não alteram o tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("NinjasArray = " + ninjasArray[i]);
        }

        // Listas
        // Não são estáticas, podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();

        // Adicionar na Lista
        ninjasList.add("Naruto Uzumaki"); // Index 0
        ninjasList.add("Sasuke Uchiha");  // Index 1
        ninjasList.add("Sakura Haruno");  // Index 2
        ninjasList.add("Tobirama Senju"); // Index 3
        ninjasList.add("Kakashi Hatake"); // Index 4

        System.out.println("NinjaList = " + ninjasList);

        // Remover da Lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("NinjaList = " + ninjasList);

        // Trocar Elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("NinjaList = " + ninjasList);

        // Ver o tamanho da Lista
        System.out.println("Tamanho da lista = " + ninjasList.size() + " elementos");

    }
}
