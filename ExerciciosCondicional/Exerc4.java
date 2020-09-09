package ExerciciosCondicional;

import java.util.*;

public class Exerc4 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Entre com um número: ");
		num = ler.nextInt();
		ler.close();
		
		if(num%2==0) {
			System.out.printf("Esse número é PAR");
			System.out.println("\nSua raiz quadrada é: " + Math.round(Math.sqrt(num)));
		} else {
			System.out.printf("Esse número é ÍMPAR");
			System.out.println("\nO número " + num + " elevado ao quadrado é " + Math.pow(num, 2));
		}
	}
}
