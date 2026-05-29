package NiveIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {

    // Esse metodo vai vir direto da Interface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }
}
