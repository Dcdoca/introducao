package com.poo.introducao;
import java.util.Scanner;

public class Lista03 {
    
    public void ex01(){
        Scanner scanner = new Scanner(System.in);

        int segundos = 0;

        while(true){
            System.out.println("digite um numero de segundos entre 1 e 59:");
            if (scanner.hasNext()) {
                segundos = scanner.nextInt();
                if (segundos >=1 && segundos <= 59){
                    //break;
                }
                else{
                    System.out.println("Erro entrada invalida digite outro numero");
                    scanner.next();
                }
                

            }
            System.out.println("Cronometro iniciado por" + segundos + "segundos.");
            try {
                for (int i = segundos; i > 0; i--){
                    System.out.println(i + "segundos restantes.");
                    Thread.sleep(1000);}
                    System.out.println("tempo egotado!");
                } 
                catch (InterruptedException e) {System.out.println("o cronometro foi interrompido.");
            }
            scanner.close();
            }
        }
    public void ex02(){
            int num;
    
            System.out.println("--------");
            System.out.println("Tabuada");
            System.out.println("--------");
            System.out.print("Digite um número: ");
            Scanner sc = new Scanner(System.in);
    
            num = sc.nextInt();
    
            for (int i=0; i<=10; i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }
            sc.close();
        }
    public void ex03(){
        
        int num1;
        int num2;

        System.out.print("Informe um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.print("Informe outro número inteiro: ");
        num2 = sc.nextInt();

        for (int i=(num1+1); i<num2; i++) {
            if ( (i%2) == 0 ) {
                System.out.println(i);
            }
        }
    }
    public void ex04(){

            int numeroAdvinhar;
            int advinhador;
            Scanner leia = new Scanner(System.in);
    
            System.out.print("Digite um numero para ser advinhado:");
            numeroAdvinhar = leia.nextInt();
    
            do {
                System.out.print("advinhe o numero digitado:");
                advinhador = leia.nextInt();
                if (advinhador == numeroAdvinhar) {
    
                    System.out.println("parabens, voce acertou!");
    
                } else {
                    if ((advinhador - numeroAdvinhar) >= 6) {
                        System.out.println("ta frio! numero muito alto!");
                    } else if ((advinhador - numeroAdvinhar) <= -6) {
                        System.out.println("ta frio! numero muito baixo!");
                    } else if (((advinhador - numeroAdvinhar) <= 5) && ((advinhador - numeroAdvinhar) >= 1)) {
                        System.out.println("ta quente! numero maior");
                    } else if (((advinhador - numeroAdvinhar) >= -5) && ((advinhador - numeroAdvinhar) <= -1)) {
                        System.out.println("ta quente! numero menor");
    
                    }
                    System.out.print("tente novamente, ");
                }
    
            }
            while (advinhador != numeroAdvinhar);
        }
    }
    
               



    
    

