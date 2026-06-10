package NivelIntermediario.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // São dinâmicas e tamanho aumenta de diminui conforme necessário
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O último elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha Stack Atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack Atualizada com pop() = " + ninjaStack);
        System.out.println("Minha Stack com o próximo elemento do topo = " + ninjaStack.peek());
        System.out.println("Tamanho da Stack = " + ninjaStack.size() + " elementos");

        Stack<String> stackTeste = new Stack<>();
        stackTeste.pop();
        // Retorna uma excpetionj EmptyStackException
    }
}
