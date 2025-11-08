package Ejvs01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN04 - Pode votar? *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode votar e é obrigado a votar.");
        } else if (idade >= 16) {
            System.out.println("Você pode votar, mas o voto é facultativo.");
        } else {
            System.out.println("Você não pode votar.");
        }
        scanner.close();
    }
}