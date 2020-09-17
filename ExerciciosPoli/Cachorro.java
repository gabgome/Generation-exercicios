package ExerciciosPoli;

public class Cachorro extends Animal {

	public String getNome() {
		return "Nome do cachorro: " + super.getNome() + "\nIdade: " + super.getIdade();
	}
	
	public String emitirSom() {
		return "O cachorro " + super.getNome() + " diz: " + super.getSom();
	}
		
	public String getCorre() {
		return super.correr();
	}
	
}
