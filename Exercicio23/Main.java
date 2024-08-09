/*
A tarefa aqui neste problema é ler uma expressão matemática na forma de dois números Racionais (numerador / denominador) e apresentar o resultado da operação. Cada operando ou operador é separado por um espaço em branco. A sequência de cada linha que contém a expressão a ser lida é: número, caractere, número, caractere, número, caractere, número. A resposta deverá ser apresentada e posteriormente simplificada. Deverá então ser apresentado o sinal de igualdade e em seguida a resposta simplificada. No caso de não ser possível uma simplificação, deve ser apresentada a mesma resposta após o sinal de igualdade.

Considerando N1 e D1 como numerador e denominador da primeira fração, segue a orientação de como deverá ser realizada cada uma das operações:
Soma: (N1*D2 + N2*D1) / (D1*D2)
Subtração: (N1*D2 - N2*D1) / (D1*D2)
Multiplicação: (N1*N2) / (D1*D2)
Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)
Entrada
A entrada contem vários casos de teste. A primeira linha de cada caso de teste contem um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de casos de teste que devem ser lidos logo a seguir. Cada caso de teste contém um valor racional X (1 ≤ X ≤ 1000), uma operação (-, +, * ou /) e outro valor racional Y (1 ≤ Y ≤ 1000).

Saída
A saída consiste em um valor racional, seguido de um sinal de igualdade e outro valor racional, que é a simplificação do primeiro valor. No caso do primeiro valor não poder ser simplificado, o mesmo deve ser repetido após o sinal de igualdade.
 */
package Exercicio23;

import java.util.Scanner;

public class Main {
    // Função para calcular o MDC (Máximo Divisor Comum) usando o algoritmo de Euclides
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    // Função para simplificar uma fração
    public static String simplificar(int numerador, int denominador) {
        int mdc = mdc(Math.abs(numerador), Math.abs(denominador));
        numerador /= mdc;
        denominador /= mdc;
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Número de casos de teste
        int N = sc.nextInt();
        sc.nextLine();  // Consumir a linha após o número de casos

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] partes = input.split(" ");

            int N1 = Integer.parseInt(partes[0]);
            int D1 = Integer.parseInt(partes[2]);
            String operador = partes[3];
            int N2 = Integer.parseInt(partes[4]);
            int D2 = Integer.parseInt(partes[6]);

            int numerador = 0, denominador = 0;

            // Realiza a operação baseada no operador
            switch (operador) {
                case "+":
                    numerador = N1 * D2 + N2 * D1;
                    denominador = D1 * D2;
                    break;
                case "-":
                    numerador = N1 * D2 - N2 * D1;
                    denominador = D1 * D2;
                    break;
                case "*":
                    numerador = N1 * N2;
                    denominador = D1 * D2;
                    break;
                case "/":
                    numerador = N1 * D2;
                    denominador = N2 * D1;
                    break;
            }

            // Imprime o resultado antes da simplificação
            System.out.print(numerador + "/" + denominador + " = ");

            // Simplifica e imprime o resultado
            System.out.println(simplificar(numerador, denominador));
        }
        sc.close();
    }
}