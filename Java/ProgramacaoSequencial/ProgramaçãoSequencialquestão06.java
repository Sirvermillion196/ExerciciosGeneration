package exerc�cios;

import java.util.Scanner;

public class Programa��oSequencialquest�o06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double x1, x2, y1, y2, d;
		
		System.out.println("O valor de x1 �: ");
		x1 = leia.nextDouble();
		
		System.out.println("O valor x2 �: ");
		x2 = leia.nextDouble();
		
		System.out.println("O valor y1 �: ");
		y1 = leia.nextDouble();
		
		System.out.println("O valor y2 �: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
				
		System.out.println("O resultado da raiz � de: " + d);
		
		leia.close();
	}

}
