package ExerciciosPoli;

public class Cavalo extends Animal {
	
	public String getNome() {
		return "Nome do cavalo: " + super.getNome() + "\nIdade: " + super.getIdade();
	}
	
	public String emitirSom() {
		return "O cavalo " + super.getNome() + " diz: " + super.getSom();
	}
	
	public String getCorre() {
		return super.correr();
	}
}
