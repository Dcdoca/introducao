package com.poo.introducao;
import java.util.Scanner;

public class Lista02 {
    public void ex01(){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
    public void ex02(){
        Scanner scanner = new Scanner(System.in);
        int numero01;
        int numero02;

        System.out.println("digite o primeiro numero");
         numero01 = scanner.nextInt();

        System.out.println("digite o segundo numero");
         numero02 = scanner.nextInt();

        if(numero01 > numero02){
            System.out.println("O número(" + numero01 + ") é maior que o número (" + numero02 +").");
        }

        else if (numero01 < numero02){
            System.out.println("O segundo número(" + numero02 + ") é maior que o número (" + numero01 +").");

        }
        else{
            System.out.println("Ambos numeros são iguais.");
        }
        scanner.close();

}
    public void ex03(){
        Scanner scanner = new Scanner(System.in);
        int idade;
        String deficiente;
        String gestante;
        boolean filapreferencial;

        System.out.println("Qual é a sua idade? ");
        idade = scanner.nextInt();

        System.out.println("Você é portador de alguma deficiencia?  (s//n) ");
        deficiente = scanner.next();

        System.out.println("Você é gestante.");
        gestante = scanner.next();

        filapreferencial = (idade > 65) || deficiente.equalsIgnoreCase("s") || gestante.equalsIgnoreCase("s");
        if(filapreferencial){
            System.out.println("Você deve ir para fila preferencial.");
        }
        else{
            System.out.println("Você deve ir para fila comun.");
        }
        scanner.close();

    }
    public void ex04(){
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("digite sua idade.");
        idade=scanner.nextInt();

        if (idade < 16){
            System.out.println("Você nao pode entra no evento");
        }
        else if (idade >= 16 && idade <18){
            System.out.println("Você pode entrar no evento somente acompahado por responsáveis.");
        }
        else{
            System.out.println("Você pode entrar no evento");
        }
        scanner.close();
        }
    public void ex05(){
        Scanner scanner = new Scanner(System.in);
        String logincorreto = "Antonio";
        String senhacorreta = "1234";
        String login;
        String senha;
        boolean loginvalido;
        boolean senhavalida;
        
        System.out.println("Digite seu login:");
        login = scanner.nextLine();

        System.out.println("Digite sua senha:");
        senha = scanner.nextLine();

        loginvalido = login.equals(logincorreto);
        senhavalida = senha.equals(senhacorreta);

        if(loginvalido && senhavalida){
            System.out.println("Login realizado com sucesso!");
        }
        else{
            if(!loginvalido){
                System.out.println("Login incorreto.");
            }
            if(!senhavalida){
                System.out.println("senha incorreta.");
            }
        }
        scanner.close();
    }

    }

    

