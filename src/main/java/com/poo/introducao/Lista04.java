package com.poo.introducao;
import java.util.Scanner;

public class Lista04 {
    public void ex01(){
        double[] vendasDoDia = {120.50 , 250.00 , 350.75 , 99.90 , 50.50 , 10.00 , 150.35};
        double fechamentoDoDia = calcularFechamento(vendasDoDia);

        System.out.printf("O fechamento das vendas do dia é: R$ %.2f%n", fechamentoDoDia);
    }

    public static double calcularFechamento(double[] vendas) {
        double totalVendas = 0.0;

        for (double venda : vendas) {
            totalVendas += venda;
        }

        return totalVendas;
    }
}


