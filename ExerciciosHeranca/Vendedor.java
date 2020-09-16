package ExerciciosHeranca;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double valorComissao;
	private double salarioBase;
	private double imposto;
	
	public double calcularComissao() {
		this.valorComissao = this.valorVendas * 30 / 100;	
		return valorComissao;
	}
	
	public double calcularImposto() {
		this.imposto = this.salarioBase * 9 / 100;
		return imposto;
	}
	
	public double calcularSalario() {		
		double salarioLiquido = this.salarioBase - calcularImposto() + calcularComissao();
		return salarioLiquido;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
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
