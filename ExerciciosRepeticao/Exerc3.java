package ExerciciosRepeticao;

import java.util.*;
/*
 	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 	Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. 
*/
public class Exerc3 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int idade, jovem=0, idoso=0;
		System.out.printf("Entre com a idade: ");
		idade = leia.nextInt();
		
		while(idade >= 1) {
			
			
			if(idade < 21) {
				jovem++;
			} 
			else if (idade > 50) {
				idoso++;
			} 
			
			System.out.printf("Entre com a idade: ");
			idade = leia.nextInt();
		}
		leia.close();
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", jovem);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", idoso);
	}
}
