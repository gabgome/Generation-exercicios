package ExerciciosCondicional;

import java.util.*;

public class Exerc1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		
		int num1, num2, num3, maiornum=0;
		
		System.out.printf("Entre com o primeiro número: ");
		num1 = ler.nextInt();
		System.out.printf("Entre com o segundo número: ");
		num2 = ler.nextInt();
		System.out.printf("Entre com o terceiro número: ");
		num3 = ler.nextInt();
		ler.close();
		
		if(num1 > maiornum) {
			maiornum = num1;
		} 
		
		if (num2 > maiornum) {
			maiornum = num2;			
		}
		
		if (num3 > maiornum) {
			maiornum = num3;
		}
		
		System.out.printf("O maior número é %d", maiornum);
	}
}
