package Ejvs01;

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN13 - Soma dos 100 primeiros números naturais *");
        System.out.println("************************************************");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos 100 primeiros números naturais é: " + soma);
    }
}