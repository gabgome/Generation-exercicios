package ExerciciosRepeticao;
/*
 	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 
*/
public class Exerc1 {
	public static void main (String args[]) {
		int num, cont=0;
		
		for(num=1000; num <= 1999; num++) {
			if(num%11==5) {
				cont = num;
				System.out.printf("\n %d", cont);
			}
		}
	}
}
