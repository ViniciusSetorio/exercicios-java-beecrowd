// Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do
// aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
//
// Entrada
// O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
//
// Saída
// Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

package Exercicio07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        double A, B, C, pesoA, pesoB, pesoC, mediaAluno;

        pesoA = 2;
        pesoB = 3;
        pesoC = 5;

        A = Double.parseDouble(bufferedReader.readLine().replace(",", "."));

        B = Double.parseDouble(bufferedReader.readLine().replace(",", "."));

        C = Double.parseDouble(bufferedReader.readLine().replace(",", "."));

        mediaAluno = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", mediaAluno);
    }
}
