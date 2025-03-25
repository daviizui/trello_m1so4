package br.com.senai.futurodev.exercicios.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nomeEntrada = entrada.nextLine();
        System.out.println("Informe seu sobrenome: ");
        String sobrenomeEntrada = entrada.nextLine();
        System.out.println("Informe seu sexo: ");
        String sexoEntrada = entrada.nextLine();
        System.out.println("Informe sua data de nascimento no formato dd/MM/yyyy: ");
        String dataNascimentoEntrada = entrada.nextLine();
        System.out.println("Informe sua altura em metros: ");
        Double alturaEntrada = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe seu peso em quilos: ");
        Integer pesoEntrada = Integer.parseInt(entrada.nextLine());

        PerfilDeSaude novoPerfil = new PerfilDeSaude(nomeEntrada,sobrenomeEntrada,sexoEntrada,dataNascimentoEntrada,alturaEntrada,pesoEntrada);

        System.out.println(novoPerfil);





    }
}
