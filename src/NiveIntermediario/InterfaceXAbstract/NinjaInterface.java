package NiveIntermediario.InterfaceXAbstract;

public interface NinjaInterface {

    // Tudo é automaticamente FINAL
    // Em uma Inteface todas as variáveis devem ser iniciadas
    String nome = "Naruto Uzumaki";
    String aldeia = "Aldeia da Folha";
    int idade = 17;

    // Todos os metodos são obrigatoriamente abstratos
    public void tacarShuriken();
}
