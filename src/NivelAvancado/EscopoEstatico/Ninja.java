package NivelAvancado.EscopoEstatico;

public class Ninja {

    String nome;

    public void kyubi() {
        System.out.println("Kyubi fora do escopo static");
    }

    public static void sharingan() {
        System.out.println("Sharingan dentro do escopo static");
    }
}
