package ExerciciosHeranca;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	private double salarioBase;
	private double imposto;
	
	
	public Operario(String nome, String endereco, String telefone, double salarioBase) {
		super(nome, endereco, telefone);
		this.salarioBase = salarioBase;
	}
	
	public double calcularComissao() {
		this.comissao = this.valorProducao * 30 / 100;	
		return comissao;
	}
	
	public double calcularImposto() {
		this.imposto = this.salarioBase * 9 / 100;
		return imposto;
	}
	
	public double calcularSalario() {		
		double salarioLiquido = this.salarioBase - calcularImposto() + calcularComissao();
		return salarioLiquido;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}	
	
	
	
}
