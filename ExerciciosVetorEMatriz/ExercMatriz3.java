package ExerciciosVetorEMatriz;
/*
  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. 
*/
import java.util.*;

public class ExercMatriz3 {
	public static void main(String args[]) {		
		int[][] matriz = new int [3][3];
		int soma=0, linha=0, coluna=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0; linha < 3; linha++) {
			for(coluna=0; coluna < 3; coluna++) {
				System.out.println("Entre com um número: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna] > 10) {
					soma++;
				}
			}
		}
		
		System.out.println("\nTotal de números maiores que 10: " + soma);
	}
}
