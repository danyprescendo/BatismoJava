package NiveIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        // Objeto Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Schiha";
        sasuke.aleia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        // Objeto Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aleia = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();

    }
}
