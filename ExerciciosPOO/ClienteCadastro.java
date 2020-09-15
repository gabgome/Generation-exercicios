package ExerciciosPOO;

public class ClienteCadastro {
	public static void main (String args[]) {
		Cliente cliente01 = new Cliente("Gabriela", "30/08/93", 27, "Feminino", "567.986.930-00");
		System.out.println(cliente01.getCadastro());
	}
}
