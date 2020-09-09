package ExerciciosLogica;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		double x1, x2, y1, y2, distancia;
		
		Scanner ler = new Scanner(System.in);
			System.out.println("Entre com o valor de X1:");
			x1 = ler.nextDouble();
			
			System.out.println("Entre com o valor de X2:");
			x2 = ler.nextDouble();
			
			System.out.println("Entre com o valor de Y1:");
			y1 = ler.nextDouble();
			
			System.out.println("Entre com o valor de Y2:");
			y2 = ler.nextDouble();
			
			ler.close();
			
			distancia = Math.round(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
			
			System.out.println("A distância foi de: " + distancia);
	}
}
