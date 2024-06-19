/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

package Exercicio11;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1, numeroPeca1;
        double valorUnitarioPeca1;

        int codigoPeca2, numeroPeca2;
        double valorUnitarioPeca2;

        double valorFinal;

        codigoPeca1 = scanner.nextInt();
        numeroPeca1 = scanner.nextInt();
        valorUnitarioPeca1 = scanner.nextDouble();

        codigoPeca2 = scanner.nextInt();
        numeroPeca2 = scanner.nextInt();
        valorUnitarioPeca2 = scanner.nextDouble();

        valorFinal = (numeroPeca1 * valorUnitarioPeca1) + (numeroPeca2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);
    }
}
