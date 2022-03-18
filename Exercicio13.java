package ExerciciosLogica;

/*13. Dados 3 valores reais representando os lados de um poss�vel tri�ngulo, verifique se os mesmos formam um tri�ngulo (a
medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes), is�sceles (dois lados iguais) ou eq�il�tero
(tr�s lados iguais).*/

import java.util.Scanner;

public class Exercicio13 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: \n");
		float a = input.nextFloat();
		
		System.out.print("Digite o valor de B: \n");
		float b = input.nextFloat();
		
		System.out.print("Digite o valor de C: \n");
		float c = input.nextFloat();
		
		if( a < b+c && b < a+c && c < a+b) {
			String triangulo;
			
			if((a==b)&& (b==c)&&(c==a)) {
				triangulo = "equilatero, pois todos os lados tem medidas iguais.";
			}
			if((a==b)!= (b==c)!=(c==a)) {
				triangulo = "escaleno, pois todos os lados s�o diferentes.";
			}
			else {
				triangulo = "isoceles, pois s� tem dois lados iguais.";
			}
			System.out.print("Os lados desse triangulo o classificam como " + triangulo);
			
		}else {
			System.out.print("As retas enviadas n�o formam um triangulo.");
		
		}
	}

}
