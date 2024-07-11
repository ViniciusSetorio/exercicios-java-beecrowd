/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

package Exercicio20;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int tempoEmSegundos = scanner.nextInt();
        int horas = 0, minutos = 0, segundos = 0;

        while (tempoEmSegundos > 0) {
            if (tempoEmSegundos / 3600 != 0) {
                horas = tempoEmSegundos / 3600;
                tempoEmSegundos %= 3600;
            } else if (tempoEmSegundos / 60 != 0) {
                minutos = tempoEmSegundos / 60;
                tempoEmSegundos %= 60;
            } else {
                segundos = tempoEmSegundos;
                break;
            }
        }
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
