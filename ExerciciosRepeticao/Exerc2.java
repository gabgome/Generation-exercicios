package ExerciciosRepeticao;

import java.util.*;
/*
 	Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
*/
public class Exerc2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int num, x, par=0, impar=0;
		
		for(x=1; x <= 10; x++) {
			System.out.printf("Entre com um número: ");
			num = leia.nextInt();
			
			if(num%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.printf("\nTotal de números pares: %d", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);
		
	}
}
