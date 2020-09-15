package ExerciciosPOO;

public class ProdutoEletronico {
	String marca;
	String modelo;
	int polegadas;
	String modeloTela;
	int botaoLigar;
	int botaoDesligar;
	int trocaCanal;
	
	void controleTV (double comando) {
		if(comando == 1) {
			System.out.println("Olá! Sua tv está ligada...");
		}
		if(comando == 2) {
			System.out.println("Desligando... até logo!");
		}
		if(comando == 3) {
			System.out.println("Sintonizando os canais disponíveis...");
		}
	}
	
}
