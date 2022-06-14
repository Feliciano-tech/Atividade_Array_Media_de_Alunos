package Exercicios_Vetores;

import java.util.Scanner; // impotando biblioteca java util, para utilizar o Scanner.

public class Exercicio_01_pt_02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); // criando objeto do tipo scanner, para leitura do reclado.

		int media = 0, soma = 0, i; // declaracao de variaveis do tipo "int", para guardar numeros inteiros.
		
		int[] array; array = new int[6]; // declarando vetor(array) do tipo int e definindo seu tamanho.

		System.out.printf("Media de alunos por sala.\n\n"); // imprimir texto na tela.

		for (i = 0; i < array.length; i++) { // iniciando laco com "for" e declarando condicao de repeticao em que
												// enquanto "i" for menor que o numero de "array" "i++".

			System.out.printf("Digite a quantidade de alunos na sala n°%d: ", i + 1); // imprimir texto na tela.
			array[i] = ler.nextInt(); // scanear teclado e guardar no vetor

			soma = soma + array[i]; // somar todos os valores recebidos pelo teclado e guardar na variavel "soma".
		}

		media = soma / array.length; // calculando a media e guardando na variavel media.

		System.out.print("\nA media de alunos por sala e: " + media); // imprimir texto e media na tela.

		System.out.print("\n\nSalas acima da media de alunos:");// imprimir texto na tela.
		
		for (i = 0; i < array.length; i++) {// iniciando laco com "for" e declarando condicao de repeticao em que
											// enquanto "i" for menor que o numero de "array" "i++".
			
			if (array[i] > media) { // condicional "if" onde se array maior que media executar comando na chave.
				System.out.printf("\nSala %d c/%d ", i + 1, array[i]);// imprimir texto o numero da sala e o numero de
																		// alunos, na tela.
			}
		}

		System.out.print("\n\nSalas abaixo da media de alunos:");// imprimir texto na tela.
		
		for (i = 0; i < array.length; i++) {// iniciando laco com "for" e declarando condicao de repeticao em que
											// enquanto "i" for menor que o numero de "array" "i++".
			
			if (array[i] < media) {// condicional "if" onde se array menor que media executar comando na chave.
				System.out.printf("\nSala %d c/%d ", i + 1, array[i]);// imprimir texto o numero da sala e o numero de
																		// alunos, na tela.
			}
		}

		System.out.print("\n\nSalas dentro da media de alunos:");// imprimir texto na tela.
		
		for (i = 0; i < array.length; i++) {// iniciando laco com "for" e declarando condicao de repeticao em que
											// enquanto "i" for menor que o numero de "array" "i++".
			
			if (array[i] == media) {// condicional "if" onde se array igual media executar comando na chave.
				System.out.printf("\nSala %d c/%d ", i + 1, array[i]);// imprimir texto o numero da sala e o numero de
																		// alunos, na tela.
			}
		}

		ler.close(); // encerrado leitura do teclado.

	}

}
