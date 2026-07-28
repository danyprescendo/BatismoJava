package NivelAvancado.ComplexidadeAlgoritmo;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Complexidade: O(n) -> Linear
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Complexidade: O(1) -> Constante
        int a = 1;
        int b = 1;
        int solucao = a + b;

        // Complexidade: O(1) -> Constante
        int solucaoMultiplicacao = (a + b) * 500;

        // ArrayList
        inicio = System.nanoTime();
        arrayList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo ArrayList: " + tempo + " ns");

        // LinkedList
        inicio = System.nanoTime();
        linkedList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + " ns");
    }
}
