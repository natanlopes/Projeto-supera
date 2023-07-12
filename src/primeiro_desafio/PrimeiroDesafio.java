/**
 * 
 */
package primeiro_desafio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Lê um valor inteiro da entrada

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        scanner.close(); // Fechar o Scanner

        // Ordenar as listas em ordem crescente
        Collections.sort(pares);
        Collections.sort(impares);

        // Imprimir os valores dos arrays de pares e impares
        System.out.println("Pares:");
        for (int par : pares) {
            System.out.println(par);
        }

        System.out.println("Ímpares:");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}
