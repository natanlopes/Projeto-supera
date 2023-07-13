/**
 * 
 */
package segundo_desafio;

/**
 * 
 */
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble(); // Lê um valor de ponto flutuante da entrada

        // Calcula a quantidade de notas de cada valor
        int notas100 = (int) (valor / 100);
        valor %= 100;
        int notas50 = (int) (valor / 50);
        valor %= 50;
        int notas20 = (int) (valor / 20);
        valor %= 20;
        int notas10 = (int) (valor / 10);
        valor %= 10;
        int notas5 = (int) (valor / 5);
        valor %= 5;
        int notas2 = (int) (valor / 2);
        valor %= 2;

        // Calcula a quantidade de moedas de cada valor
        int moedas1 = (int) (valor / 1);
        valor %= 1;
        int moedas050 = (int) (valor / 0.50);
        valor %= 0.50;
        int moedas025 = (int) (valor / 0.25);
        valor %= 0.25;
        int moedas010 = (int) (valor / 0.10);
        valor %= 0.10;
        int moedas005 = (int) (valor / 0.05);
        valor %= 0.05;
        int moedas001 = (int) (valor / 0.01);

        // Imprime a quantidade de notas e moedas necessárias
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");
        System.out.println(moedas005 + " moeda(s) de R$ 0.05");
        System.out.println(moedas001 + " moeda(s) de R$ 0.01");

        scanner.close(); // Fechar o Scanner
    }
}
