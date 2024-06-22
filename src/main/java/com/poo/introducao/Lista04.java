package com.poo.introducao;

import java.util.Scanner;

public class Lista04 {
    public void ex01() {
        double[] vendasDoDia = {120.50, 250.00, 300.75, 99.90, 50.25, 10.00, 150.45};

        // Calculando o fechamento do dia
        double fechamentoDoDia = calcularFechamento(vendasDoDia);

        // Exibindo o resultado
        System.out.printf("O fechamento das vendas do dia é: R$ %.2f%n", fechamentoDoDia);
    }
        double calcularFechamento(double[] vendas) {

        double totalVendas = 0.0;

        // Somando os valores do array
        for (double venda : vendas) {
            totalVendas += venda;
        }

        return totalVendas;
    }

    public void ex02(){
        double[] vendasDoDia = {120.50, 250.00, 300.75, 99.90, 50.25, 10.00, 150.45};

        // Identificando a compra de menor e maior valor
        double menorValor = encontrarMenorValor(vendasDoDia);
        double maiorValor = encontrarMaiorValor(vendasDoDia);

        // Exibindo os resultados
        System.out.printf("A compra de menor valor é: R$ %.2f%n", menorValor);
        System.out.printf("A compra de maior valor é: R$ %.2f%n", maiorValor);
    }

    public static double encontrarMenorValor(double[] vendas) {
        double menorValor = vendas[0];

        // Encontrando o menor valor
        for (double venda : vendas) {
            if (venda < menorValor) {
                menorValor = venda;
            }
        }

        return menorValor;
    }

    public static double encontrarMaiorValor(double[] vendas) {
        double maiorValor = vendas[0];

        // Encontrando o maior valor
        for (double venda : vendas) {
            if (venda > maiorValor) {
                maiorValor = venda;
            }
        }

        return maiorValor;
    }
}
    


    


