package ExerciciosVetorEMatriz;
/*
  Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

*/
import java.util.*;

public class ExercVetor2 {
	public static void main(String args[]) {
		int numeros[] = new int[6], somapares=0, contimpar=0, i;
		
		try (Scanner leia = new Scanner(System.in)) {
			for(i=0; i < 6; i++) {
				System.out.println("Entre com um número: ");
				numeros[i] = leia.nextInt();
				
				if(numeros[i]%2 == 0) {
					somapares = somapares + numeros[i];
					System.out.println("\nNúmero par: " + numeros[i]);
				} else {
					contimpar++;
					System.out.println("\nNúmero ímpar: " + numeros[i]);
				}
			}
			
			System.out.println("Soma dos números pares: " + somapares);
			System.out.println("Quantidade de números ímpares: " + contimpar);
			leia.close();
		}
	}
}
