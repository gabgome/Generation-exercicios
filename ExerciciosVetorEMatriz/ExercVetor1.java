package ExerciciosVetorEMatriz;

/*
 Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 
*/

public class ExercVetor1 {
	public static void main (String args[]) {
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma=0;
		
		// soma das posições
		for(int i=0; i < 6; i++) {
			if(i == 0) {
				soma = soma + A[i];
			}
			if(i == 1) {
				soma = soma + A[i];
			}
			if(i == 5) {
				soma = soma + A[i];
			}
		}
		
		System.out.printf("Total: %d", soma);
		
		// alteração de valor da posição 4
		for(int i=0; i < 6; i++) {
			if(i == 5) {
				A[i] = 100;
			}
		}
		
		// imprimindo os valores do vetor
		System.out.println("\nValores do vetor: ");
		for(int i : A) {
			System.out.println("\n" + i + "\n");
		}
	}
}
