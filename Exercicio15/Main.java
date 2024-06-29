/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */

package Exercicio15;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int distanciaEmKm = scanner.nextInt();
        double conbustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaEmKm / conbustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}