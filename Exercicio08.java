package ExerciciosLogica;

//8.Leia tr�s n�meros inteiros fornecidos pelo usu�rio. Descubra qual deles � o maior de todos, imprimindo seu valor. 

import java.util.Scanner;

public class Exercicio08 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valo de A: ");
		int a = input.nextInt();
		System.out.print("Digite o valo de B: ");
		int b = input.nextInt();
		System.out.print("Digite o valo de C: ");
		int c = input.nextInt();
		
		int maior = ((int) (Math.pow(2, 32)/2)*(-1) );
		
		maior = (((a>b) && (a>c)) ? a : maior );
		maior = (((b>a) && (b>c)) ? b : maior );
		maior = (((c>a) && (c>b)) ? c : maior );
		
		System.out.print( " O maior valor lido e " + maior );
	}

}
