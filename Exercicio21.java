package ExerciciosLogica;

/*21. Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule
seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores.*/

import java.util.Scanner;

public class Exercicio21 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor multiplicado por x elevado ao quadrado: ");
		int A = input.nextInt();
		System.out.print("Digite o valor multiplicado por x: ");
		int B = input.nextInt();
		System.out.print("Digite o valor que n�o multiplica x: ");
		int C = input.nextInt();
		
		int delta = B*B - 4*A*C; 
		System.out.print("Delta: "+delta);
		
		
	}

}
