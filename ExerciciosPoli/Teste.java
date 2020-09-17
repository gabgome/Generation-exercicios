package ExerciciosPoli;

public class Teste {
	public static void main (String args[]) {
		Cachorro doguinho = new Cachorro();
		doguinho.setNome("Roberval");
		doguinho.setIdade(1);
		doguinho.setSom("Au au au");
		
		System.out.println(doguinho.correr());
		
		Cavalo egua = new Cavalo();
		egua.setNome("Olhos D'Agua");
		egua.setIdade(9);
		egua.setSom("Hinn in in");
		
		System.out.println(egua.correr());
		
		Preguica preguica = new Preguica();
		preguica.setNome("Josefa");
		preguica.setIdade(13);
		preguica.setSom("A-a-u-i-a-a");
		preguica.setArvore("Bananeira");
		
		System.out.println(preguica.subindo());
		
		System.out.println("----------------------------------");
		
		Animal[] animais = new Animal[3];
		animais[0] = doguinho;
		animais[1] = egua;
		animais[2] = preguica;
		
		for(Animal mostra:animais){
			System.out.println(mostra.emitirSom());
		}
	}
}
