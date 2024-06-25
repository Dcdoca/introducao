package com.poo.introducao;

import java.util.ArrayList;
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
        System.out.printf("A compra de maior valor é: R$ %.2f%n", maiorValor);}
    

        public double encontrarMenorValor(double[] vendas) {
        double menorValor = vendas[0];
    

        // Encontrando o menor valor
        for (double venda : vendas) {
            if (venda < menorValor) {
                menorValor = venda;
            
            }
        }

        return menorValor;
    }
    public  double encontrarMaiorValor(double[] vendas) {
        double maiorValor = vendas[0];

        // Encontrando o maior valor
        for (double venda : vendas) {
            if (venda > maiorValor) {
                maiorValor = venda;
            }
        }
        
    

        return maiorValor;
    }
    


public void ex03(){

    double vendas[] = { 20.50, 100.50, 15.50, 10.50 };
    double fechamento = 0;
    double ticketMedio;

    for (double i : vendas) {
        fechamento += i;
    }

    ticketMedio = fechamento / vendas.length;

    System.out.println("a media foi : " + ticketMedio);
}
public void ex04(){
    int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
    int countPares = 0;

    for(int num : lista){
        if (num % 2 == 0) {
            countPares++;

        }
    }

    System.out.println("Quantidade de números pares: " + countPares);
}
public void ex05(){
        ArrayList<String> lista_de_compras = new ArrayList<>();
        Scanner mercadiunho = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Digite '1' para inserir um item, '2' para ver a lista, ou '3' para sair:");
            opcao = mercadiunho.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do item:");
                    String item = mercadiunho.nextLine();
                    lista_de_compras.add(item);
                    break;
                case "2":
                    System.out.println("Lista de Compras:");
                    for (String i : lista_de_compras) {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (!opcao.equals("3"));
    }

}


