package ExerciciosLogica;

/*27. Calcule a m�dia de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
nota*/

import java.util.Scanner;

public class Exercicio27 {
	
	public void run() {
		float n=0, media=0, notas=0,c=0;

		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Digite a(s) nota(s) da(o) aluna(o) ou um n�mero menor que 0 para encerrar o programa ");
		n = input.nextFloat();
		c++;
		
		if(n >= 0) {
			notas = n+notas;
		}
		
		}while(n >= 0);
		
		media = (notas/(c-1));
		
		System.out.println("Nota final: "+media);
		System.out.println("A m�dia foi calculada com base em: "+ (c-1) +" notas");		
	}

}
