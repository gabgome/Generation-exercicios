package ExerciciosRepeticao;
/*
 	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 	No final, mostre a soma dos n�meros digitados.
*/
import java.util.*;

public class Exerc5 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int num, cont=0;
		
		do {
		System.out.printf("Entre com um n�mero: ");
		num = leia.nextInt();
		cont = cont + num;
		} while(num != 0);
		
		leia.close();
		
		System.out.printf("Total da soma dos n�meros: %d", cont);
	}
}
