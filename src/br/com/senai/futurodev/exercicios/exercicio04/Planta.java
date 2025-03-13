package br.com.senai.futurodev.exercicios.exercicio04;

public class Planta {
    private String nome;
    private String tipo;
    private int necessidadeDeAgua;

    public Planta(String nome, String tipo, int necessidadeDeAgua) {
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
    }



    public void calcularNecessidadeDeAgua(int qtdSemanas){
        int quantidadeAgua =  necessidadeDeAgua * qtdSemanas;
        System.out.println("A quantidade de água nececessaria para irrigar durante " + qtdSemanas + " semanas é de " + quantidadeAgua);
    }

    public void irrigar(){
        System.out.println("A irrigação funcionou com sucesso!");
    }
}
