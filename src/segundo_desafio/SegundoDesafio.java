/**
 * 
 */
package segundo_desafio;

/**
 * O código fornecido realiza o seguinte:
 * Lê um valor de ponto flutuante da entrada usando o Scanner.
 * Define uma lista de notas disponíveis (100, 50, 20, 10, 5, 2) e uma lista de moedas disponíveis (1, 0.5, 0.25, 0.10, 0.05, 0.01).
 * Calcula a quantidade mínima de notas necessárias para trocar o valor inicial. Ele percorre a lista de notas, dividindo o valor atual pelo valor da nota e armazenando a quantidade de notas necessárias. Em seguida, atualiza o valor para o resto da divisão.
   Imprime a quantidade de notas para cada valor na lista de notas.
   Calcula a quantidade mínima de moedas necessárias da mesma maneira que as notas.
   Imprime a quantidade de moedas para cada valor na lista de moedas.
 * 
 */
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble(); // Lê um valor de ponto flutuante da entrada

        int[] notas = { 100, 50, 20, 10, 5, 2 }; // Notas disponíveis
        double[] moedas = { 1, 0.5, 0.25, 0.10, 0.05, 0.01 }; // Moedas disponíveis

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int quantidade = (int) (valor / notas[i]);
            valor %= notas[i];
            System.out.println(quantidade + " nota(s) de R$ " + notas[i] + ".00");
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = (int) (valor / moedas[i]);
            valor %= moedas[i];
            System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moedas[i]));
        }

        scanner.close(); // Fechar o Scanner
    }
}
