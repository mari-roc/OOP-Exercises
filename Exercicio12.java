package ExerciciosLogica;

/*12. Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos. O usu�rio deve
fornecer o n�mero de copos a serem comprados e o programa deve calcular o pre�o total a ser cobrado, exibindo-o.
Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; se o n�mero de copos est� entre
101 e 500, o pre�o por copo � R$0.04; finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035.*/

import java.util.Scanner;

public class Exercicio12 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Quantidade de copos: ");
		int total = input.nextInt();
		
		
		if(total <= 100 ) {
			System.out.println("Pre�o total: "+ total*0.05);
		}if(total > 101 && total <500) {
			System.out.println("Pre�o total: "+ total*0.04 );
		}if(total > 500) {
			System.out.println("Pre�o total: "+ total*0.035 );
		}
	}

}
