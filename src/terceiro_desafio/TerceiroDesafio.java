/**
 * 
 */
package terceiro_desafio;

/**
 * Neste código, a função  contParesComDiferencaK recebe o array de inteiros e o valor alvo k como parâmetros. 
 * A função ordena o array em ordem crescente e, em seguida, percorre o array usando dois ponteiros (left e right). 
 * O ponteiro left aponta para o início do array e o ponteiro right avança até o final do array.
 * A diferença entre os elementos apontados pelos ponteiros left e right é comparada com o valor alvo k. 
 * Se for igual a k, um par válido é encontrado e o contador é incrementado.
 * Se a diferença for maior que k, o ponteiro left é avançado para tentar encontrar um par com uma diferença menor. 
 * Se a diferença for menor que k, o ponteiro right é avançado para aumentar a diferença.
 * Ao final do loop, o contador é retornado como resultado.
 * 
 * 
 */
import java.util.Arrays;

public class TerceiroDesafio {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        int count = contParesComDiferencaK(arr, k);
        System.out.println(count);
    }

    public static int contParesComDiferencaK(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (diff == k) {
                count++;
                left++;
                right++;
            } else if (diff > k) {
                left++;
            } else {
                right++;
            }
        }

        return count;
    }
}

