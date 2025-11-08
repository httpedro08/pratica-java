package Ejvs01;

import java.util.Scanner;

public class PHVCN39 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN39 - Validar número entre 1 e 5 *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 5) {
                System.out.println("Número fora do intervalo. Tente novamente.");
            }
        } while (numero < 1 || numero > 5);

        System.out.println("Número válido digitado: " + numero);
        scanner.close();
    }
}
