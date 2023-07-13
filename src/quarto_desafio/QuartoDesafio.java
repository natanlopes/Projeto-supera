/**
 * 
 */
package quarto_desafio;

import java.util.Scanner;

/**
 * O código lê o número de casos de teste, em seguida, itera sobre cada caso de teste. 
 * A função readLine é usada para ler cada linha do caso de teste, garantindo que linhas vazias sejam ignoradas.
 * Em seguida, a linha é dividida em duas partes, parte1 e parte2, usando o índice do meio. 
 * Ambas as partes são revertidas usando o método reverse() do StringBuilder e, por fim, são concatenadas e impressas no console
 * 
 */
public class QuartoDesafio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int N = leitura.nextInt();
		for (int i = 0; i < N; i++) {
			String frase = readLine(leitura);
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
		}
	}
	
	public static String readLine(Scanner leitura) {
		String line = leitura.nextLine();
		while (line.isEmpty())
			line = leitura.nextLine();
		return line;
	}
	
}
