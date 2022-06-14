package Exercicios_Vetores;

public class Exercicio_01 {

	public static void main(String[] args) {

		int soma = 0; // declaracao de variaveis do tipo "int", para guardar numeros inteiros.
		
		int q[] = { 35, 4, 22, 20, 36, 30 }; // declarando vetor(array) do tipo int e atribuindo valores.
		
		int n = q.length; // utilizando o metodo "length" para determinar o tamanho do vetor e guardando
							// valor dentro da variavel "n".
		
		for (int i = 0; i < n; i++) {// iniciando laco com "for" e declarando condicao de repeticao em que
			                         // enquanto "i" for menor que o numero de "q" "i++".
			
			soma = soma + q[i]; //somando valores guardados dentro da variavel "q".

		}
		System.out.printf("A media de pessoas por sala e (%d). \nAs salas:\n1 c/35\n5 "    //imprimir texto na tela 
				+ "c/36\n6 c/30\nestao acima da media de pessoas por sala.", (soma / n));  // dividindo variavel "soma" pela variavel "n".

	}

}