package Ejvs01;

import java.util.Scanner;

public class PHVCN37 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN37 - Soma até o número ser múltiplo de 10 *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números para somar. O loop encerra quando um múltiplo de 10 for digitado.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero % 10 != 0);

        System.out.println("Número múltiplo de 10 digitado. Soma total: " + soma);
        scanner.close();
    }
}