package NivelAvancado.EscopoEstatico;

public class Main {

    static int idadeGlobal = 17;

    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.kyubi();
        Ninja.sharingan();

        System.out.println(idadeGlobal);

    }
}
