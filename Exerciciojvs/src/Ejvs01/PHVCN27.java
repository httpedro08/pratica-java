package Ejvs01;

import java.util.Scanner;

public class PHVCN27 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN27 - Quantidade de números ímpares digitados *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int impares = 0;

        System.out.println("Digite 10 números inteiros:");

        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 != 0) {
                impares++;
            }
            contador++;
        }

        System.out.println("Total de números ímpares digitados: " + impares);
        scanner.close();
    }
}
