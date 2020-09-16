package ExerciciosHeranca;

public class VendedorTeste {
	public static void main (String args[]) {
		Vendedor vend1 = new Vendedor();
		
		vend1.setNome("Roberval");
		vend1.setTelefone("(11) 9834-6789");
		vend1.setSalarioBase(6500);
		vend1.setValorVendas(10500);
		
		System.out.println("Vendedor: " + vend1.getNome());
		System.out.println("Contato: " + vend1.getTelefone());
		System.out.println("*****************************************");
		System.out.println("Total Vendas: R$" + vend1.getValorVendas());
		System.out.println("Total Comissão: R$" + vend1.calcularComissao());
		System.out.println("Total De Imposto Retido: R$" + vend1.calcularImposto());		
		System.out.println("*****************************************");
		System.out.println("Total A Receber: R$" + vend1.calcularSalario());
	}
}
