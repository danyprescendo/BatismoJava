package NiveIntermediario.Desafios.Desafio04;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja Básico
        Ninja ninjaBasico = new NinjaBasico("Naruto Uzumaki", 16, TipoHabilidade.NINJUTSU);
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        // Obejto Ninja Avançado
        Ninja ninjaAvancado = new NinjaAvancado("Madara", 45, TipoHabilidade.RINNENGAN, "Invocaçãp dp Susano");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();

    }
}
