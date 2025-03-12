package br.com.senai.futurodev.exercicios.exercicio02;

public class EmissaoDeCarbono {
    private String atividade;
    private double quantidadeEmissao;
    private double co2NoPeriodo;

    public double getCo2NoPeriodo() {
        return co2NoPeriodo;
    }

    public EmissaoDeCarbono(String atividade, double quantidadeEmissao) {
        this.atividade = atividade;
        this.quantidadeEmissao = quantidadeEmissao;
    }

    public double calcularEmissaoCO2(double minutos){
        return this.co2NoPeriodo =  (this.quantidadeEmissao * minutos) / 60;
    }
}
