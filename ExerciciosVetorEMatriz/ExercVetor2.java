package ExerciciosVetorEMatriz;
/*
  Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

*/
import java.util.*;

public class ExercVetor2 {
	public static void main(String args[]) {
		int numeros[] = new int[6], somapares=0, contimpar=0, i;
		
		try (Scanner leia = new Scanner(System.in)) {
			for(i=0; i < 6; i++) {
				System.out.println("Entre com um n�mero: ");
				numeros[i] = leia.nextInt();
				
				if(numeros[i]%2 == 0) {
					somapares = somapares + numeros[i];
					System.out.println("\nN�mero par: " + numeros[i]);
				} else {
					contimpar++;
					System.out.println("\nN�mero �mpar: " + numeros[i]);
				}
			}
			
			System.out.println("Soma dos n�meros pares: " + somapares);
			System.out.println("Quantidade de n�meros �mpares: " + contimpar);
			leia.close();
		}
	}
}
