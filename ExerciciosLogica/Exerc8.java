package ExerciciosLogica;

import java.util.Scanner; 

public class Exerc8 {
	public static void main(String[] args) {
		double custoFab, distribuidor, impostos, custoConsumidor; // double recebe números inteiros e reais
		
		Scanner ler = new Scanner(System.in);
			System.out.println("Entre com o custo de fábrica do carro: ");
			custoFab = ler.nextDouble();
			
			distribuidor = custoFab * 0.28;
			impostos = custoFab * 0.45;
			custoConsumidor = custoFab + distribuidor + impostos;
			
			ler.close();
			
			System.out.println("Custo ao consumidor: " + custoConsumidor);
	}

}
