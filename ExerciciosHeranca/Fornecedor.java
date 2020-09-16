package ExerciciosHeranca;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}
	// Cálculo do saldo
	public double obterSaldo() {
		double saldoF = this.valorCredito - this.valorDivida;
		return saldoF;
	}
}
