package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println("Cadastro = " + cadastro);
        System.out.println("Nome do Cadastro = " + cadastro.getNome());

        NinjaRecord cadastroRecord = new NinjaRecord("João", 11111111);
        System.out.println("Nome do Funcionário = " + cadastroRecord.nomeDoFuncionario() + " -- ID = " + cadastroRecord.id());

    }
}
