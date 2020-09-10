package ExerciciosRepeticao;

import java.util.*;
/*
 	Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir 
 	a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero) 
*/
public class Exerc6 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int num, totalnum=0, soma=0;
		double media=0;
		
		do {
			System.out.printf("Entre com um n�mero: ");
			num = ler.nextInt();
			
			if(num%3 == 0) {
				soma = soma + num;
				totalnum++;
			}
			
		} while(num != 0);	
		
		if(num == 0) {
			totalnum = totalnum - 1;
		}
		
		ler.close();
		
		media = soma/totalnum;
		
		System.out.println("M�dia dos n�meros m�ltiplos de 3: %f" + media);
	}
}
