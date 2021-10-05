package exercícios;

import java.util.Scanner;

public class ProgramaçãoSequencialquestão06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double x1, x2, y1, y2, d;
		
		System.out.println("O valor de x1 é: ");
		x1 = leia.nextDouble();
		
		System.out.println("O valor x2 é: ");
		x2 = leia.nextDouble();
		
		System.out.println("O valor y1 é: ");
		y1 = leia.nextDouble();
		
		System.out.println("O valor y2 é: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
				
		System.out.println("O resultado da raiz é de: " + d);
		
		leia.close();
	}

}
