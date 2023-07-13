# ⚙️ Projeto-supera
# Primeiro Desafio

Este programa lê uma série de números inteiros não negativos da entrada e os separa em duas listas: uma contendo os números pares e outra contendo os números ímpares.

Em seguida, as duas listas são ordenadas em ordem crescente usando o método `Collections.sort()`. Por fim, os valores das listas ordenadas são impressos na saída, separadamente para pares e ímpares, um valor por linha.

## Funcionamento

1. O programa lê um valor inteiro `n` da entrada, indicando o número de valores que serão fornecidos em seguida.
2. Os valores são lidos e separados em duas listas: `pares` e `ímpares`.
3. As duas listas são ordenadas em ordem crescente.
4. Os valores das listas ordenadas são impressos na saída, separadamente para pares e ímpares.

## Exemplo de Entrada e Saída

**Entrada:**
5
4
32
34
543
3456

**Saída:**
Pares:
4
32
34
Ímpares:
543
3456

## Executando o Programa

Para executar o programa, siga os passos abaixo:

1. Certifique-se de ter o Java instalado em seu computador.
2. Compile o código-fonte utilizando o comando `javac PrimeiroDesafio.java`.
3. Execute o programa utilizando o comando `java PrimeiroDesafio`.
   

# Segundo Desafio

Este programa lê um valor de ponto flutuante representando um valor monetário da entrada e calcula a menor quantidade de notas e moedas necessárias para trocar esse valor. As notas consideradas são 100, 50, 20, 10, 5, 2, e as moedas consideradas são 1, 0.50, 0.25, 0.10, 0.05 e 0.01.

## Funcionamento

1. O programa lê um valor de ponto flutuante `valor` da entrada, representando o valor monetário a ser trocado.
2. O programa define as listas `notas` e `moedas`, que contêm os valores das notas e moedas disponíveis, respectivamente.
3. O programa itera sobre a lista de notas e calcula a quantidade mínima de notas necessárias para trocar o valor inicial. Ele divide o valor atual pela nota atual, armazenando a quantidade de notas necessárias, e atualiza o valor para o resto da divisão.
4. O programa imprime a quantidade de notas para cada valor na lista de notas.
5. O programa repete o mesmo processo para as moedas, calculando a quantidade mínima de moedas necessárias e imprimindo a quantidade de moedas para cada valor na lista de moedas.

## Exemplo de Entrada e Saída

**Entrada:**

**Saída:**
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

# Terceiro Desafio

Este programa recebe um array de inteiros e um valor alvo `k` como parâmetros e determina o número de pares entre os elementos do array em que a diferença seja igual ao valor alvo `k`.

## Funcionamento

1. O programa recebe como entrada um array de inteiros `arr` e um valor alvo `k`.
2. O array é ordenado em ordem crescente utilizando o método `Arrays.sort()`.
3. O programa utiliza dois ponteiros, `left` e `right`, para percorrer o array.
4. O programa compara a diferença entre os elementos apontados pelos ponteiros `left` e `right` com o valor alvo `k`.
5. Se a diferença for igual a `k`, um par válido é encontrado e o contador é incrementado.
6. Se a diferença for maior que `k`, o ponteiro `left` é avançado para tentar encontrar um par com uma diferença menor.
7. Se a diferença for menor que `k`, o ponteiro `right` é avançado para aumentar a diferença.
8. O programa repete os passos 4 a 7 até percorrer todo o array.
9. Ao final do processo, o programa retorna o contador como resultado.

## Exemplo de Entrada e Saída

**Entrada:**
arr = [1, 5, 3, 4, 2]
k = 2

**Saída:**
3

# Quarto Desafio

Este programa realiza a descriptografia de linhas impressas de forma incorreta por uma impressora infectada por um vírus. O programa recebe um número de casos de teste, lê cada linha do caso de teste e realiza a descriptografia conforme especificado.

## Funcionamento

1. O programa lê um número inteiro `N` da entrada, indicando a quantidade de casos de teste.
2. O programa itera `N` vezes, realizando o seguinte para cada caso de teste:
   - Utiliza a função `readLine` para ler cada linha do caso de teste, garantindo que linhas vazias sejam ignoradas.
   - Divide a linha em duas partes, `parte1` e `parte2`, utilizando o índice do meio.
   - Reverte as duas partes utilizando o método `reverse()` do `StringBuilder`.
   - Concatena as partes revertidas e imprime a linha descriptografada no console.
3. O programa repete o processo para cada caso de teste.

## Exemplo de Entrada e Saída

**Entrada:**
5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE

**Saída:**
THIS LINE IS GIBBERISH
LEVELKAYAK
HAPPY HOLIDAYS
MLKJIHGFEDCBAZYXWVUTSRQPON
FRENCH HENS TWO DOVES AND A PARTRIDGE
