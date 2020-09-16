package ExerciciosHeranca;

public class Empregado extends Pessoa {
	protected int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;	
	}
	
	public double calcularImposto() {
		this.imposto = salarioBase * 9 / 100;
		return imposto;
	}
	
	public double calcularSalario() {
		double salarioLiquido = this.salarioBase - this.imposto;
		return salarioLiquido;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
}
