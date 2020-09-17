package ExerciciosPoli;

public class Preguica extends Animal {
	private String arvore;
	
	
	public String getNome() {
		return "Nome do bicho-preguiça: " + super.getNome() + "\nIdade: " + super.getIdade();
	}
	

	public String emitirSom() {
		return "O bicho-preguiça de " + super.getIdade() + " anos diz: " + super.getSom();
	}
	
	
	public String subindo() {
		return super.getNome() + " está subindo na " + this.arvore;
	}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}
}
