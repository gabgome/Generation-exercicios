package ExerciciosLogica;

import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		double n1, n2, n3, peso1, peso2, peso3, somaNotas, media;
		
		Scanner ler = new Scanner(System.in);
			System.out.println("Nota 1: ");
			n1 = ler.nextDouble();
			
			System.out.println("Nota 2: ");
			n2 = ler.nextDouble();
			
			System.out.println("Nota 3: ");
			n3 = ler.nextDouble();
			
			peso1 = n1 * 2;
			peso2 = n2 * 3;
			peso3 = n3 * 5;
			
			somaNotas = peso1 + peso2 + peso3;
			media = somaNotas/8;
			
			ler.close();
			
			System.out.println("Média: " + Math.round(media));
	}

}
