/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

package Exercicio19;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int valorInicial = scanner.nextInt();
        scanner.close();

        int valor = valorInicial;
        int numeroDeNotas100;
        int numeroDeNotas50;
        int numeroDeNotas20;
        int numeroDeNotas10;
        int numeroDeNotas5;
        int numeroDeNotas2;
        int numeroDeNotas1;

        for (numeroDeNotas100 = 0; valor >= 100; numeroDeNotas100++) {
            valor = valor - 100;
        }

        for (numeroDeNotas50 = 0; valor >= 50; numeroDeNotas50++) {
            valor = valor - 50;
        }

        for (numeroDeNotas20 = 0; valor >= 20; numeroDeNotas20++) {
            valor = valor - 20;
        }

        for (numeroDeNotas10 = 0; valor >= 10; numeroDeNotas10++) {
            valor = valor - 10;
        }

        for (numeroDeNotas5 = 0; valor >= 5; numeroDeNotas5++) {
            valor = valor - 5;
        }

        for (numeroDeNotas2 = 0; valor >= 2; numeroDeNotas2++) {
            valor = valor - 2;
        }

        for (numeroDeNotas1 = 0; valor == 1; numeroDeNotas1++) {
            valor = 0;
        }

        System.out.println(valorInicial);
        System.out.println(numeroDeNotas100 + " nota(s) de R$ 100,00\n" + numeroDeNotas50 + " nota(s) de R$ 50,00\n" + numeroDeNotas20 + " nota(s) de R$ 20,00\n" + numeroDeNotas10 + " nota(s) de R$ 10,00\n" + numeroDeNotas5 + " nota(s) de R$ 5,00\n" + numeroDeNotas2 + " nota(s) de R$ 2,00\n" + numeroDeNotas1 + " nota(s) de R$ 1,00");
    }
}