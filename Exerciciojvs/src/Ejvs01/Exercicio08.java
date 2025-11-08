package Ejvs01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Pedro Henrique V.C do Nascimento - 0025603 *");
        System.out.println("* Classe PHVCN08 - Login simples *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido! Bem-vindo(a).");
        } else {
            System.out.println("Erro: Usuário ou senha incorretos.");
        }
        scanner.close();
    }
}