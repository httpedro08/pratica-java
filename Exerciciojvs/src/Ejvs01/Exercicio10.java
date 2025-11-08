package Ejvs01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN10 - Ano bissexto *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        scanner.close();
    }
}