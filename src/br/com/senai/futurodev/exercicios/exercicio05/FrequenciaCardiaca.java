package br.com.senai.futurodev.exercicios.exercicio05;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNacimento;

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNacimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNacimento = dataNacimento;
    }

    public FrequenciaCardiaca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNacimento, dataAtual).getYears();
    }

    public int calculaFrequenciaCardiacaMaxima(){
        return 220 - calcularIdade();
    }

    public String calculaFrequenciaCardiacaAlvo(){
        int frequanciaMaxima = calculaFrequenciaCardiacaMaxima();
        int frequenciaAlvoMinima = (int)(frequanciaMaxima * 0.50);
        int frequenciaAlvoMaxima = (int)(frequanciaMaxima * 0.85);
        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima;
    }
}
