package ExerciciosCondicional;

import java.util.*;

public class Exerc4 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Entre com um n�mero: ");
		num = ler.nextInt();
		ler.close();
		
		if(num%2==0) {
			System.out.printf("Esse n�mero � PAR");
			System.out.println("\nSua raiz quadrada �: " + Math.round(Math.sqrt(num)));
		} else {
			System.out.printf("Esse n�mero � �MPAR");
			System.out.println("\nO n�mero " + num + " elevado ao quadrado � " + Math.pow(num, 2));
		}
	}
}
