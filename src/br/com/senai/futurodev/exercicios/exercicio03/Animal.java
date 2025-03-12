package br.com.senai.futurodev.exercicios.exercicio03;

public class Animal {
    private String nome;
    private String habitat;
    private String som;
    private String tipoAlimentacao;

    public Animal(String nome, String habitat, String som, String tipoAlimentacao) {
        this.nome = nome;
        this.habitat = habitat;
        this.som = som;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome() {
        return nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getSom() {
        return som;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void mover(){
        System.out.println(nome + " está se movendo!");
    }

    public void emitirSom(){
        System.out.println(nome + " faz " + som + " !");
    }

    public void alimentar(){
        if (tipoAlimentacao.equalsIgnoreCase(("herbívaro"))) {
            System.out.println(nome + " está comendo plantas.");
        } else if (tipoAlimentacao.equalsIgnoreCase("carnívoro")) {
            System.out.println(nome + " está comendo carne.");
        }else {
            System.out.println(nome + " possui um tipo de alimentação desconhecida.");
        }
    }
}
