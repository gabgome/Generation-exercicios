package ExerciciosHeranca;

public class FornecedorTeste {
	public static void main (String args[]) {
		Fornecedor loja1 = new Fornecedor("Sempre Vale", "Rua Rodrigues Alves, 113 - SP", "(11) 5234-5634", 15000, 11000);
		
		System.out.println("Fornecedor: " + loja1.getNome());
		System.out.println("Endereço: " + loja1.getEndereco());
		System.out.println("Contato: " + loja1.getTelefone());
		System.out.println("************************************************");
		System.out.println("Crédito Fornecedor: R$" + loja1.getValorCredito());
		System.out.println("Dívida Fornecedor: R$" + loja1.getValorDivida());
		System.out.println("************************************************");
		System.out.println("Total de saldo referente ao fornecedor: " + loja1.obterSaldo());
		
	}
}
