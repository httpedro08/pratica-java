package Ejvs01;

public class PHVCN18 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN18 - Múltiplos de 3 entre 1 e 30 *");
        System.out.println("************************************************");
        System.out.println("Múltiplos de 3 entre 1 e 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}