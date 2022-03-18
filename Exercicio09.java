package ExerciciosLogica;

//9.Leia três números reais fornecidos pelo usuário. Descubra qual deles é o menor de todos, imprimindo seu valor

import java.util.Scanner;

public class Exercicio09 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = input.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = input.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = input.nextInt();
		
		int menor = ((int) (Math.pow(2, 32)/2)-1 );
		
		menor = (((a<b) && (a<c)) ? a : menor );
		menor = (((b<a) && (b<c)) ? b : menor );
		menor = (((c<a) && (c<b)) ? c : menor );
		
		System.out.print( " O menor valor lido e " + menor );
	}

}
