package NiveIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, Hokage{

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    // Metodo da Interface AnbuInterface
    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da Anbu");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage");
    }

    // Metodo da Interface SharinganInterface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

}
