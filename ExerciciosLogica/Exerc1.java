package ExerciciosLogica;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		int anoNasc, mesNasc, diaNasc, anoAtual, mesAtual, diaAtual, anosVividos, diasVividos, mesesVividos,
			totalDias;
		String nome;
		
		Scanner ler = new Scanner(System.in); // recebe a entrada de dados
			System.out.println("Digite o seu nome: ");
			nome = ler.next(); // recebe uma string - texto
			
			System.out.println("Qual o ano do seu nascimento? ");
			anoNasc = ler.nextInt();
			
			System.out.println("Qual o mês do seu nascimento? ");
			mesNasc = ler.nextInt();
			
			System.out.println("Qual o dia do seu nascimento? ");
			diaNasc = ler.nextInt();
			
			System.out.println("Qual o ano atual? ");
			anoAtual = ler.nextInt();
			
			System.out.println("Qual o mês atual? ");
			mesAtual = ler.nextInt();
			
			System.out.println("Qual o dia atual? ");
			diaAtual = ler.nextInt();
			
			anosVividos = (anoAtual - anoNasc)*365;
			mesesVividos = (mesAtual - mesNasc)*30;
			diasVividos = (diaAtual - diaNasc);
			totalDias = anosVividos + mesesVividos + diasVividos;
			
			ler.close();
			
			System.out.println(nome);			
			System.out.println("Você já viveu " + totalDias + " dias.");
			
	}

}
