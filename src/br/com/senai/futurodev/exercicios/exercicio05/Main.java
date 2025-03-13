package br.com.senai.futurodev.exercicios.exercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite sua data de nacimento dd/mm/yyy:");
        String dataNacimentoDigitada = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate datanacimento = LocalDate.parse(dataNacimentoDigitada,formatter);

        FrequenciaCardiaca pessoa01 = new FrequenciaCardiaca(nome, sobrenome, datanacimento);
        System.out.println("\nInformações da Pessoa");
        System.out.println("Nome completo: " +pessoa01.getNome() + " " + pessoa01.getSobrenome());
        System.out.println("Data de nascimeto: " + pessoa01.getDataNacimento().format(formatter));
        System.out.println("Idade: " + pessoa01.calcularIdade() + "anos.");
        System.out.println("Frequência cardíaca máxima: " + pessoa01.calculaFrequenciaCardiacaMaxima() + "bpm");
        System.out.println("Frequência cardíaca alvo: " + pessoa01.calculaFrequenciaCardiacaAlvo() + "bpm");

    }
}
