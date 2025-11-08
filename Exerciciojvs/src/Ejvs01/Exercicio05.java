package Ejvs01;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN05 - Notas e aprovação *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota (0-10): ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota (0-10): ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Aluno APROVADO!");
        } else if (media >= 5.0) {
            System.out.println("Aluno em RECUPERAÇÃO.");
        } else {
            System.out.println("Aluno REPROVADO.");
        }
        scanner.close();
    }
}