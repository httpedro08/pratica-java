package Ejvs01;

public class PHVCN28 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN28 - Soma dos pares entre 1 e 100 *");
        System.out.println("************************************************");
        int soma = 0;
        int i = 2; 

        while (i <= 100) {
            soma += i;
            i += 2; 
        }

        System.out.println("A soma dos números pares entre 1 e 100 é: " + soma);
    }
}
