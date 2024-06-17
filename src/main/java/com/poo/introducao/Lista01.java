package com.poo.introducao;
import java.util.Scanner;

public class Lista01 {
    public void ex1() {
        int num1;
        int num2;
        int resultado;

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        System.out.println("Digite mais um número: ");

        num2 = sc.nextInt();

        resultado = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é igual à: " + resultado);
        sc.close();
    }
    public void ex2(){

        String nome, sobrenome;

        System.out.println("Digite seu primeiro nome: ");
        Scanner sc = new Scanner(System.in);

        nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.next();

        System.out.println("Olá, " + nome + " " + sobrenome + "!!!");
        sc.close();
    }
    public void ex3(){

        double valorReal, valorDolar, taxaConversao = 5.25;

        System.out.println("Digite o valor em reais: R$");
        Scanner sc = new Scanner(System.in);
        valorReal = sc.nextDouble();

        valorDolar = valorReal/ taxaConversao;
        System.out.println("O valor convertido é: U$" + valorDolar);
        sc.close();

    }
}
