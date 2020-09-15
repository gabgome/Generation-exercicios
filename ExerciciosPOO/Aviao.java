package ExerciciosPOO;

public class Aviao {
	String modelo;
	String fabricante;
	int anoFabricacao;
	String paisOrigem;
	double alturaAtual;
	double alturaMaxima;
	
	void decolagem() {
		System.out.println("O avião " + modelo + " está decolando...");	
	}
	
	void voando(double metros) {
		double altitude = this.alturaAtual + metros;
		this.alturaAtual = altitude;
		System.out.println("Altitude atual: " + altitude + " mil pés");
	}
	
}
