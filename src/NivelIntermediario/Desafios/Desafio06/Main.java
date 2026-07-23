package NivelIntermediario.Desafios.Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Criar uma LinkedList com 7 ninjas
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        // Adicionar os ninjas na LinkedList
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        // Listar os ninjas
        System.out.println("--------------- Lista de Ninjas ---------------");

        // Complexidade O(n)
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        // Adicionar o ninja no início da lista
        listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        System.out.println("=============== Ninjas Removido ===============");


        // Remover o ninja no início da lista
        Ninja removed = listaDeNinjas.removeFirst();
        System.out.println("Ninja Removido = " + removed);

        System.out.println("=============== Mudanças ===============");

        // Listar os ninjas
        for (Ninja listaDeNinjasAtualizada : listaDeNinjas) {
            System.out.println("Lista de Ninjas atualizada = " + listaDeNinjasAtualizada);
        }

        // Procurar um ninja por índice
        Ninja terceiroNinja = listaDeNinjas.get(2);
        System.out.println("Terceiro Ninja = " + terceiroNinja);
    }
}
