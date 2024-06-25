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
    void ex06() {
        Scanner scanner = new Scanner(System.in);

        String listaDeCompras[] = new String[100];
        int escolhaMenu;
        String item;
        boolean menu = true;
        int contador = 0;
        int removerItem;
        while (menu) {
            System.out.println("""
                    ===== Menu =====
                     1 = Add item na lista de compras.
                     2 = Ver lista de compras
                     3 = Remover item
                     4 = Sair
                    """);
            escolhaMenu = scanner.nextInt();
            if (escolhaMenu == 1) {
                if (contador < 100) {
                    System.out.println("Insira o item que deseja adicionar:");
                    item = scanner.next();
                    listaDeCompras[contador] = item;
                    contador++;
                    System.out.println("\n\n");
                } else {
                    System.out.println("A lista está cheia");
                }
            }
            else if (escolhaMenu == 2) {
                if (contador != 0) {
                    System.out.println("\n\n===== Lista de Compras =====");
                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                } else {
                    System.out.println("\n\nLista de compras vazia");
                }
                System.out.println("\n\n");
            }
            else if (escolhaMenu == 3) {
                if (contador == 0) {
                    System.out.println("Nenhum item adicionado na lista\n\n");
                } else {
                    System.out.println("\n\n===== Lista de Compras =====");
                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                    System.out.println("Digite o número do item para remover: ");
                    removerItem = scanner.nextInt();
                    listaDeCompras[removerItem - 1] = null;
                }
            }
            else if (escolhaMenu == 4) {
                System.out.println("Saindo...");
                menu = false;
            }
            else {
                System.out.println("Digite um número válido! \n\n\n");
            }
        }
    }
}

        
               