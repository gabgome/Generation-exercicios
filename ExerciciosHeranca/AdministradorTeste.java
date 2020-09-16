package ExerciciosHeranca;

public class AdministradorTeste {
	public static void main (String args[]) {
		Administrador admin = new Administrador("Gabriel", "Rua Eugenio Cunha, 576 - SP", "(11) 8458-9874", 1500.0);
		
		System.out.println("Administrador: " + admin.getNome());
		System.out.println("Administrador: " + admin.getEndereco());
		System.out.println("Administrador: " + admin.getTelefone());
		System.out.println("*****************************************");
		System.out.println("Valor da Ajuda de Custo: R$" + admin.getAjudaDeCusto());
	}
}
