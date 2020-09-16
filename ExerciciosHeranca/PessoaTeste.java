package ExerciciosHeranca;

public class PessoaTeste {
	public static void main (String args[]) {
		Pessoa n01 = new Pessoa();
		
		n01.setNome("Aline");
		n01.setEndereco("Rua Augusta, 554 - SP");
		n01.setTelefone("(11) 7669-8490");
		
		
		System.out.println(n01.getNome());
		System.out.println(n01.getEndereco());
		System.out.println(n01.getTelefone());
	}
}
