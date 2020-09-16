package ExerciciosHeranca;

public class EmpregadoTeste {
	public static void main (String args[]) {
		Empregado funcionario = new Empregado("Mauro", "Rua Filomena, 44 - MG", "(13) 3467-9857", 213);
		
		funcionario.setSalarioBase(2500);
		
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Contato: " + funcionario.getTelefone());
		System.out.println("COD: " + funcionario.getCodigoSetor());
		System.out.println("*****************************************");
		System.out.println("Salário Base: R$" + funcionario.getSalarioBase());
		System.out.println("Imposto Retido: R$" + funcionario.calcularImposto());
		System.out.println("Salário líquido: R$" + funcionario.calcularSalario());
		System.out.println("*****************************************");
		
	}
}
