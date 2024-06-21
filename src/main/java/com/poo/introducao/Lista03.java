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
               
}


    
    

