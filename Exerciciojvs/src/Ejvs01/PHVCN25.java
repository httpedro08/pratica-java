package Ejvs01;

import java.util.Scanner;

public class PHVCN25 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN25 - Tabuada com while *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;

        System.out.println("Tabuada de " + numero + " (usando while):");
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        scanner.close();
    }
}