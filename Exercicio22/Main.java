/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

package Exercicio22;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double valorMonetario = scanner.nextDouble();
        scanner.close();

        if (valorMonetario < 0 || valorMonetario > 1000000.00) {
            System.out.println("Valor inválido");
        } else {
            double[] moedas = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
            int nNotas;
            int nMoedas;

            System.out.println("NOTAS:");
            for (double moeda : moedas) {
                if (moeda >= 2) {
                    nNotas = (int) (valorMonetario / moeda);
                    valorMonetario -= nNotas * moeda;
                    valorMonetario = Math.round(valorMonetario * 100.0) / 100.0;
                    System.out.printf("%d nota(s) de R$ %.2f\n", nNotas, moeda);
                }
            }

            System.out.println("MOEDAS:");
            for (double moeda : moedas) {
                if (moeda < 2) {
                    nMoedas = (int) (valorMonetario / moeda);
                    valorMonetario -= nMoedas * moeda;
                    valorMonetario = Math.round(valorMonetario * 100.0) / 100.0;
                    System.out.printf("%d moeda(s) de R$ %.2f\n", nMoedas, moeda);
                }
            }
        }
    }
}