package ExerciciosRepeticao;

import java.util.*;
/*
 	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. 
*/
public class Exerc2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int num, x, par=0, impar=0;
		
		for(x=1; x <= 10; x++) {
			System.out.printf("Entre com um n�mero: ");
			num = leia.nextInt();
			
			if(num%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.printf("\nTotal de n�meros pares: %d", par);
		System.out.printf("\nTotal de n�meros �mpares: %d", impar);
		
	}
}
