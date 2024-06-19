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

    }

