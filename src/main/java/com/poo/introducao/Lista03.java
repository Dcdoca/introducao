package com.poo.introducao;
import java.util.Scanner;

public class Lista03 {
    /**
     * 
     */
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
    }
    

