package ExerciciosPOO;

public class Cliente {
	private String nome;
	private String dataNasc;
	private int idade;
	private String genero;
	private String cpf;
	
	public Cliente (String nome, String dataNasc, int idade, String genero, String cpf) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.idade = idade;
		this.genero = genero;
		this.cpf = cpf;	
	}
	
	public String getCadastro() {
		String cadastro = "Cliente: " + nome + "\nNascimento: " + dataNasc + "\nIdade: " + idade + "\nGênero: " + genero + "\nCPF: " + cpf;
		return cadastro;
	}
}
