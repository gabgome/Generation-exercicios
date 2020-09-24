package Odonto;

public class TestePlanoOdontologico {
	public static void main (String args[]) {
		
		Cotacao cotacao = new Cotacao();
		
		System.out.println("Olá! Seja bem vindo ao site da Sorriso Belo.\n\nInteressado em cuidar de sua saúde bucal? Faça uma cotação conosco!! \n");
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
		
		cotacao.pegarNome();
		cotacao.pegarEmail();
		cotacao.pegarInfoTaxa();
		
		cotacao.mostrarOrçamento();
		
	}
}