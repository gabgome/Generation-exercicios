package ExerciciosVetorEMatriz;
/*
 Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 
*/
import java.util.*;

public class ExercMatriz4 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		float m1 [][] = new float [2][2];
		float m2 [][] = new float [2][2];
		float mSoma [][] = new float [2][2];
		float mSubtrai [][] = new float [2][2];
		float constante;
		int opcao=0;
		
		for(int linha=0; linha < 2; linha++) {
			for(int coluna=0; coluna < 2; coluna++) {
				System.out.printf("Entre com o valor da M1: ");
				m1[linha][coluna] = leia.nextFloat();
				System.out.printf("Entre com o valor da M2: ");
				m2[linha][coluna] = leia.nextFloat();
				
				mSoma[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
				mSubtrai[linha][coluna] = m1[linha][coluna] - m2[linha][coluna];
			}
		}
		
		System.out.println("Leia o valor de uma constante: ");
		constante = leia.nextFloat();
		
		System.out.println("\nMenu de opções");
		System.out.println("\n(1) Somar as matrizes ");
		System.out.println("\n(2) Subtrair a primeira matriz da segunda ");
		System.out.println("\n(3) Adicionar uma constante as duas matrizes");
		System.out.println("\n(4) Imprimir matrizes ");
		
		System.out.println("\nDigite a sua opção: ");
		opcao = leia.nextInt();
		
		switch(opcao)
		{
		case 1:
			for(int linha=0;linha < 2;linha++)
			{
				for(int coluna=0; coluna < 2;coluna++)
				{
					System.out.println("\nSomatório: "+ mSoma[linha][coluna]);
				}
			}
			break;
		case 2:
			for(int linha=0;linha < 2;linha++)
			{
				for(int coluna=0;coluna < 2;coluna++)
				{
					System.out.println("\nSubtração: "+ mSubtrai[linha][coluna]);
				}
			}
			break;
		case 3:
			for(int linha=0;linha < 2;linha++)
			{
				for(int coluna=0;coluna < 2;coluna++)
				{
					m1[linha][coluna] = m1[linha][coluna] + constante;
					m2[linha][coluna] = m2[linha][coluna] + constante;
					System.out.println("Matriz1: "+ m1[linha][coluna]);
					System.out.println("Matriz2: "+ m2[linha][coluna]);
				}
			}
			break;
		case 4:
			for(int linha=0;linha < 2;linha++)
			{
				for(int coluna=0;coluna < 2;coluna++)
				{
					
					System.out.println("Matriz1: "+ m1[linha][coluna]);
					System.out.println("Matriz2: "+ m2[linha][coluna]);
				}
			}
			break;
		}
		leia.close();
	}
}


