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
    public void ex4(){

        int numero, antecessor, sucessor;

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        antecessor = numero -1;
        sucessor = numero +1;

        System.out.println("O antecessor do número escolhido é: " + antecessor + "\nE o sucessor do número escolhido é: " + sucessor);
        sc.close();
    }
    public void ex5(){

        int areaTerreno, valorm2, valorTerreno;

        System.out.println("Qual a área do seu terreno? ");
        Scanner sc = new Scanner(System.in);
        areaTerreno = sc.nextInt();

        System.out.println("Qual o valor do m² na sua região? ");
        valorm2 = sc.nextInt();

        valorTerreno = areaTerreno * valorm2;
        System.out.println("O valor do seu terreno é: " + valorTerreno);
        sc.close();

    }
    public void ex6(){

        double distancia, valorcombustivel = 5.25, custototal, autonomia;

        System.out.println("Digite a distância percorrida: ");
        Scanner sc = new Scanner(System.in);
        distancia = sc.nextDouble();

        System.out.println("Qual o custo do combustível? ");
        custototal = sc.nextDouble();

        autonomia = distancia/(custototal/valorcombustivel);

        System.out.println("A autonomia do seu veículo é de: " + autonomia);
        sc.close();

    }
    public void ex7(){

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota: ");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();

        System.out.println("\nDigite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("\nDigite a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.println("\nDigite a quarta nota: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média do estudante é: " + media);
        sc.close();
    }
    public void ex8(){

        double celsius, farenheit;

        System.out.println("Digite a temperatura em Farenheit: ");
        Scanner sc = new Scanner(System.in);
        farenheit = sc.nextDouble();

        celsius = (farenheit -32)/ 1.8;

        System.out.println("A temperatura em Celsius é: %s ".formatted(celsius) );
        sc.close();
    }

}
 