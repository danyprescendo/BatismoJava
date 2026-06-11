package NivelIntermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] nijasArray = new String[6];

        // Listas
        List<String> ninjasList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // Queue
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar Fila
        System.out.println("Ninjas na Fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na Fila depois do Pool: " + ninjasQueue);

        // Ver quem é o primeiro da fila HEAD
        System.out.println("Primeiro da fila/head: " + ninjasQueue.peek());

        // Adicionar na fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na Fila depois do Pool: " + ninjasQueue);

        // * Náo é possível deletar o tail

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na Fila: " + ninjasQueue);
        ninjasQueue.poll();
        System.out.println("Ninjas na Fila: " + ninjasQueue);

        // Verificar se a fila está vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }

    }
}
