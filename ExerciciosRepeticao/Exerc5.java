package ExerciciosRepeticao;
/*
 	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 	No final, mostre a soma dos números digitados.
*/
import java.util.*;

public class Exerc5 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int num, cont=0;
		
		do {
		System.out.printf("Entre com um número: ");
		num = leia.nextInt();
		cont = cont + num;
		} while(num != 0);
		
		leia.close();
		
		System.out.printf("Total da soma dos números: %d", cont);
	}
}
