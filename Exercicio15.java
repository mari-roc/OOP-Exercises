package ExerciciosLogica;

/*15. Escreva um programa que realize as seguintes tarefas:
a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y; 
b) Realize a soma dos valores x e y, exibindo seu resultado; 
c) Realize o produto dos valores x e y exibindo seu resultado; 
d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes.*/

import java.util.Scanner;

public class Exercicio15 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digiteum valor inteiro para X: ");
		int x = input.nextInt();
		System.out.print("Digiteum valor inteiro para Y: ");
		int y = input.nextInt();
		
		System.out.println("Soma: "+ (x+y));
		System.out.println("Produto: " + (x * y));
		
		if(x > y) {
			System.out.println((x) +" > "+ (y));
		}
		else if(x < y) {
			System.out.println((x) +" < "+ (y));
		}
		else {
			System.out.println((x) +" = "+ (y));
		}
		
		
	}

}
