package ExerciciosPOO;

public class Funcionario {
	private String nome;
	private int registro;
	private double salario;
	
	public Funcionario (String colaborador, int matricula, double sal) {
		this.nome = colaborador;
		this.registro = matricula;
		this.salario = sal;		
	}
	
	public String getCadastro() {
		String cadastro = "Funcion�rio(a): \n" + nome + "\nCOD: " + registro + "\nSal�rio Mensal: R$ " + salario;
		return cadastro;
	}
}
