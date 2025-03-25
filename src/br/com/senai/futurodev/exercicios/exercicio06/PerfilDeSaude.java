package br.com.senai.futurodev.exercicios.exercicio06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataNascimento;
    private double altura;
    private int peso;

    public PerfilDeSaude() {
    }

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataNascimento, double altura, int peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public static int calculaIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataNascimento, formatter);
        LocalDate dataAtual = LocalDate.now();

        int diaNascimento = data.getDayOfMonth();
        int mesNascimento = data.getMonthValue();
        int anoNascimento = data.getYear();

        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();



        int idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento) {
            idade--;
        } else if (mesAtual == mesNascimento) {
            if (diaAtual < diaNascimento) {
                idade--;
            }
        }

        return idade;
    }

    public int calculaFrequenciaCardiacaMaxima(){
        return 220 - calculaIdade(dataNascimento);
    }

    public String calculaFrequenciaCardiacaAlvo(Integer calculaFrequenciaCardiacaMaxima){
        int frequenciaMaxima = calculaFrequenciaCardiacaMaxima();
        int frequenciaAlvoMinima = (int)(frequenciaMaxima * 0.50);
        int frequenciaAlvoMaxima = (int)(frequenciaMaxima * 0.85);
        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima;
    }

    public double calculaImc(Integer peso, Double altura){
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        return "PerfilDeSaude{" +
                "nome= " + nome + " " +
                ", sobrenome= " + sobrenome + " " +
                ", sexo= " + sexo + " " +
                ", dataNascimento= " + dataNascimento + " " +
                ", altura= " + altura + " " +
                ", peso= " + peso + " " +
                ", idade= " + calculaIdade(dataNascimento) + " anos " + " " +
                ", IMC= " + calculaImc(peso, altura) + " " +
                ", Intervalo de frequência cardiaca= " + calculaFrequenciaCardiacaAlvo(calculaFrequenciaCardiacaMaxima()) + " " +
                '}';
    }
}
