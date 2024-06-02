//A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
//
//- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
//
//Entrada
//A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
//
//Saída
//Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

package Exercicio03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        double area;
        double pi = 3.14159;
        int expoente = 2;

        double raio = Double.parseDouble(bufferedReader.readLine().replace(",", "."));
        String raioString = String.format("%.4f", raio).replace(",", ".");
        raio = Double.parseDouble(raioString);

        double raioAoQuadrado = Math.pow(raio, expoente);

        area = pi * raioAoQuadrado;

        String areaString = String.format("%.4f", area).replace(",", ".");
        area = Double.parseDouble(areaString);

        System.out.printf("A=%.4f\n", area);
    }
}