package NiveIntermediario.Desafios.Desafio03;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        super.mostrarInformacoes();
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    }

    @Override // Não sei se isso é de fato necessário???
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
