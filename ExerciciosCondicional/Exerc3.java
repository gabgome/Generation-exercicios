package ExerciciosCondicional;

import java.util.*;

public class Exerc3 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.printf("Nome do aluno: ");
		nome = ler.nextLine();
		System.out.printf("Idade do aluno: ");
		idade = ler.nextInt();		
		ler.close();
		
		if(idade >= 10 && idade <= 14) {
			System.out.printf("Classifica��o: INFANTIL");
		} else if (idade >= 15 && idade <= 17) {
			System.out.printf("Classifica��o: JUVENIL");
		} else if (idade >= 18 && idade <= 25) {
			System.out.printf("Classifica��o: ADULTO"); 
		} else {
			System.out.printf("Idade inv�lida. Tente novamente.");
		}
	}
}
