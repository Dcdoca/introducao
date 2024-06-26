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
    public void ex06(){
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;
        double notarecuperacao;

        System.out.println("digite a nota da primeira prova:");
        nota1 = scanner.nextDouble();

        System.out.println("digite a nota da segunda nota:");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) /2;

        if (media >=6) {
            System.out.println("Aluno aprovado com a média:" + media);
        }
        else{
            System.out.println("Aluno em recuperação. média:" + media);
        }

        System.out.println("Digite a nota da prova de recuperação");
        notarecuperacao = scanner.nextDouble();

        if (nota1 < nota2){
            nota1=notarecuperacao;
        }
        else{
            nota2 = notarecuperacao;
        }
        media = (nota1 + nota2) /2;

        if(media >=6){
            System.out.println("Aluno aprovado apos recuperação");
        }
        else{
            System.out.println("Aluno reprovado mesmo apos recuperação com a media" + media);
        }
        scanner.close();
    }
    public void ex07(){
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int divisor;

        System.out.println("Digite o numero para testar:");
        numero = scanner.nextInt();

        System.out.println("digite o divisor:");
        divisor = scanner.nextInt();

        if(divisor == 0){
            System.out.println("divisao por zero nao é permitida.");
        }
        else{
            if(numero % divisor == 0){
                System.out.println(numero + " é divisivel por " + divisor);
            }
            else{
                System.out.println(numero + " não e divisivel por " + divisor);
            }
        }
            scanner.close();
    }
    public void ex08(){
        Scanner scanner = new Scanner(System.in);
        String[][] perguntas = {
            {"Qual é a capital da França?", "1. Berlim", "2. Madri", "3. Paris", "4. Lisboa", "3"},
            {"Qual é o maior planeta do sistema solar?", "1. Marte", "2. Júpiter", "3. Terra", "4. Saturno", "2"},
            {"Quem escreveu 'Dom Quixote'?", "1. William Shakespeare", "2. Miguel de Cervantes", "3. Dante Alighieri", "4. João Cabral de Melo Neto", "2"},
            {"Qual é o elemento químico representado pelo símbolo 'O'?", "1. Ouro", "2. Prata", "3. Oxigênio", "4. Ozônio", "3"},
            {"Em que ano o homem pisou na Lua pela primeira vez?", "1. 1965", "2. 1969", "3. 1972", "4. 1975", "2"}
        };

        int acertos = 0;
        int erros = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(perguntas[i][j]);
            }

            System.out.print("Digite o número da sua resposta: ");
            String resposta = scanner.nextLine();

            if (resposta.equals(perguntas[i][5])) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta errada.");
            }

            if (erros >= 3) {
                System.out.println("Você errou 3 vezes. Você perdeu o jogo.");
                break;
            }

            System.out.println();
        }

        if (erros < 3) {
            System.out.println("Você chegou ao final do jogo.");
        }

        System.out.println("Número de acertos: " + acertos);

        scanner.close();
    }
}
    
