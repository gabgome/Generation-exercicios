package ExerciciosRepeticao;

import java.util.*;
/*
 	Escrever um programa que receba vários números inteiros no teclado. E no final imprimir 
 	a média dos números múltiplos de 3. Para sair digitar 0(zero) 
*/
public class Exerc6 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int num, totalnum=0, soma=0;
		double media=0;
		
		do {
			System.out.printf("Entre com um número: ");
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
		
		System.out.println("Média dos números múltiplos de 3: %f" + media);
	}
}
