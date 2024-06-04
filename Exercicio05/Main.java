//Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
//
//Entrada
//O arquivo de entrada contém 2 valores inteiros.
//
//Saída
//Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

package Exercicio05;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int A, B, PROD;

        A = input.nextInt();
        B = input.nextInt();

        PROD = A * B;

        System.out.printf("PROD = %d\n", PROD);
    }
}
