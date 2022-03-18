package ExerciciosLogica;

/*12. Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.*/

import java.util.Scanner;

public class Exercicio12 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Quantidade de copos: ");
		int total = input.nextInt();
		
		
		if(total <= 100 ) {
			System.out.println("Preço total: "+ total*0.05);
		}if(total > 101 && total <500) {
			System.out.println("Preço total: "+ total*0.04 );
		}if(total > 500) {
			System.out.println("Preço total: "+ total*0.035 );
		}
	}

}
