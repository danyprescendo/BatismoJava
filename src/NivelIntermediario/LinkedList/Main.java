package NivelIntermediario.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Colections é uma interface que usamos nas estruturas de dados

        // Classes
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList);

    }
}
