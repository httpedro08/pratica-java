package Ejvs01;

import java.util.Scanner;

public class PHVCN22 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN22 - Soma de números até digitar zero *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int numero = -1; 
        int soma = 0;

        System.out.println("Digite números para somar. Digite 0 para encerrar.");

        while (numero != 0) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma total dos números digitados é: " + soma);
        scanner.close();
    }
}
