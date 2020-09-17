package ExerciciosPoli;

public class Animal {
	private String nome;
	private int idade;
	private String som;
	private String corre;
	
	
	public String emitirSom() {
		return som;
	}
	
	public String correr() {
		return this.nome + " está correndo...";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	
	
	
	
	
}
