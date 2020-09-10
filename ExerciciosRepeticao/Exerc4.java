package ExerciciosRepeticao;

import java.util.*;

public class Exerc4 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int idade, genero, temp, dados=0, tempcalmo=0, mulhernerv=0, homemagr=0, othercalm=0, nervQ=0, calmD=0;
		
		while(dados < 150) {
			System.out.printf("Qual a sua idade?\n");
			idade = leia.nextInt();
			
			System.out.printf("Com qual gênero você se identifica? \n (1) Feminino | (2) Masculino | (3) Outros\n");
			genero = leia.nextInt();
			
			System.out.printf("Escolha o seu temperamento: \n (1) Calmo(a) | (2) Nervoso(a) | (3) Agressivo(a)\n");
			temp = leia.nextInt();
			
			if(temp == 1) {
				tempcalmo++;
			}
			
			if(genero == 1 && temp == 2){
				mulhernerv++;
			}
			
			if(genero == 2 && temp == 3) {
				homemagr++;
			}
			
			if(genero == 3 && temp == 1) {
				othercalm++;
			}
			
			if(idade > 40 && temp == 2) {
				nervQ++;
			}
			
			if(idade < 18 && temp == 1) {
				calmD++;
			}
			
			dados++;
		}
		
		leia.close();
		
		System.out.printf("\nTotal de pessoas calmas: %d", tempcalmo);
		System.out.printf("\nTotal de mulheres nervosas: %d", mulhernerv);
		System.out.printf("\nTotal de homens agressivos: %d", homemagr);
		System.out.printf("\nTotal de outros gêneros calmos: %d", othercalm);
		System.out.printf("\nTotal de pessoas nervosas com + 40 anos: %d", nervQ);
		System.out.printf("\nTotal de pessoas calmas com - 18 anos: %d", calmD);
		
	}
}
