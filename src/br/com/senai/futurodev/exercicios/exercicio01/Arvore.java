package br.com.senai.futurodev.exercicios.exercicio01;

public class Arvore {
    private String nome;
    private String tipo;
    private double altura;
    private double oxigenio;

    public Arvore() {}

    public Arvore(String nome, String tipo, double altura) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getOxigenio() {
        return oxigenio;
    }

   public void exibeInformacoes(){
       System.out.printf(" O nome da árvore é: %s, ela é do tipo %s e tem %.2fm de altura.",nome, tipo, altura);
   }

    public double calcularOxigenio (){
        this.oxigenio = this.altura * 10;
        return  this.oxigenio;
    }
}
