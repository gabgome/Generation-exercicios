package ExerciciosPOO;

public class TV {
	public static void main (String args[]) {
		ProdutoEletronico tvLG = new ProdutoEletronico();
		
		tvLG.marca = "LG";
		tvLG.modelo = " LG SUHD 55SK8000";
		tvLG.polegadas = 55;
		tvLG.botaoLigar = 1;
		tvLG.botaoDesligar = 1;
		tvLG.trocaCanal = 1;
		
		tvLG.controleTV(1);
		tvLG.controleTV(2);
		tvLG.controleTV(3);
	}
}
