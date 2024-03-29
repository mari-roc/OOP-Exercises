package ExerciciosLogica;

/*24. Implementar tr�s programas para exibir a tabuada de um n�mero inteiro entre 1 e 20 dado pelo usu�rio.
a) Usando enquanto (while) 
b) Usando fa�a-enquanto (do-while) 
c) Usando para (for)
 Obs. Caso o valor dado seja inv�lido o programa deve apenas exibir uma mensagem de aviso.*/

import java.util.Scanner;

public class Exercicio24 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro entre 1 e 20: ");
		int num = input.nextInt();
		int a = 1;
		
		if((num <= 20) && (num > 0) ) {
			System.out.println("\n");
			
			for(a = 1; a <=10; a++) {
				System.out.println(num+" X "+ a+": "+(num*a));
			}
			
			a=1;
			System.out.println("\n");
	
			while( a <= 10) {
				System.out.println(num+" X "+ a+": "+(num*a));
				a++;
			}
			
			a=1;
			System.out.println("\n");
	
			do {
				System.out.println(num+" X "+ a+": "+(num*a));
				a++;
			}while(a <= 10);
		}else {
			System.out.println("O numero digitado n�o est� entre 1 e 20.");
		}
	}

}
