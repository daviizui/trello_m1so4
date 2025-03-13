package br.com.senai.futurodev.exercicios.main;


import br.com.senai.futurodev.exercicios.exercicio01.Arvore;
import br.com.senai.futurodev.exercicios.exercicio02.EmissaoDeCarbono;
import br.com.senai.futurodev.exercicios.exercicio03.Animal;
import br.com.senai.futurodev.exercicios.exercicio04.Planta;

public class Main {
    public static void main(String[] args) {
        Arvore arvore01 = new Arvore();

        arvore01.setNome("acer");
        arvore01.setTipo("folhosa");
        arvore01.setAltura(1.2);
        arvore01.calcularOxigenio();
        System.out.println(arvore01.getOxigenio());
        arvore01.exibeInformacoes();

        Arvore arvore02 = new Arvore("buxinho", "folhosa", 0.45);
        System.out.println();
        arvore02.exibeInformacoes();
        arvore02.calcularOxigenio();
        System.out.println("A arvore produz: " + arvore02.getOxigenio() + " de oxigênio por dia");

        EmissaoDeCarbono atividade01 = new EmissaoDeCarbono("dirigir", 10);
        atividade01.calcularEmissaoCO2(30);
        System.out.println("Ao dirigir por 30 minutos foi emitido " + atividade01.getCo2NoPeriodo() + " de CO2.");

        Animal burro = new Animal("burro", "deserto", "zurrar", "herbívaro");

        burro.alimentar();
        burro.emitirSom();
        burro.mover();

        Planta planta01 = new Planta("alcafe", "horta", 2);

        planta01.calcularNecessidadeDeAgua(6);
        planta01.irrigar();



    }

}