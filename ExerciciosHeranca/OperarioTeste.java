package ExerciciosHeranca;

public class OperarioTeste {
	public static void main (String args[]) {
		Operario oper1 = new Operario("Genaildo", "Rua S�o Sebasti�o, 45 - SP", "(11) 9987-3456", 3500);
		
		oper1.setValorProducao(3000);
		
		System.out.println("Operario: " + oper1.getNome());
		System.out.println("Endere�o: " + oper1.getEndereco());
		System.out.println("Telefone: " + oper1.getTelefone());
		System.out.println("*****************************************");
		System.out.println("Valor produ��o: R$" + oper1.getValorProducao());
		System.out.println("Valor comiss�o: R$ " + oper1.calcularComissao());
		System.out.println("*****************************************");
		System.out.println("Total a Receber: R$" + oper1.calcularSalario());
	}
}
