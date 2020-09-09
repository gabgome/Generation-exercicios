package ExerciciosLogica;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		int totalDias, ano, mes, dia;
		String nome;
		
		Scanner ler = new Scanner(System.in);
			System.out.println("Entre com o seu nome: ");
			nome = ler.next();
			
			System.out.println("Entre com o total de dias vividos: ");
			totalDias = ler.nextInt();
			
			ano = totalDias/365;
			mes = (totalDias%365)/30;
			dia = (totalDias%365)%30;
			
			ler.close();
			
			System.out.println(nome + ", você tem " + ano + " ano(s) e " + mes + " mes(es) e " + dia + " dia(s) de vida." );
	}
}
