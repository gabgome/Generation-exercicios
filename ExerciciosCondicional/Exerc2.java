package ExerciciosCondicional;

import java.util.*;

public class Exerc2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, primeiro=0, segundo=0, terceiro=0;
		
		System.out.printf("Entre com um número: ");
		num1 = ler.nextInt();
		System.out.printf("Entre com um número: ");
		num2 = ler.nextInt();
		System.out.printf("Entre com um número: ");
		num3 = ler.nextInt();
		ler.close();
		
		if(num1 < num2 && num2 < num3) {
			primeiro = num1;
			segundo = num2;
			terceiro = num3;
		} else if(num2 < num1 && num1 < num3) {
			primeiro = num2;
			segundo = num1;
			terceiro = num3;			
		} else if (num3 < num1 && num1 > num2) {
			primeiro = num3;
			segundo = num2; 
			terceiro = num1; 
		}
		
		System.out.print(primeiro + ", ");
		System.out.print(segundo + ", ");
		System.out.print(terceiro);
		
	}
}
