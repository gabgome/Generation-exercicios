package ExerciciosPOO;

public class AviaoDecolagem {
	public static void main (String args[]) {
		Aviao airbus = new Aviao();
		
		airbus.modelo = "A300B1";
		airbus.fabricante = "Aerospatiale Deutsche Airbus Hawker-Siddeley CASA";
		airbus.anoFabricacao = 1971;
		airbus.paisOrigem = "Alemanha";
		airbus.alturaAtual = 0;
		airbus.alturaMaxima = 11000;
		
		airbus.decolagem();
		airbus.voando(10000);
	}
}
