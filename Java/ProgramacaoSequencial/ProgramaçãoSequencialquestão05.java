package exercícios;

import java.util.Scanner;

public class ProgramaçãoSequencialquestão05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double A, B, C, notaFinal;
		
		System.out.println("Digite a primeira nota: ");
		A = leia.nextDouble();
		// peso 2
		System.out.println("Digite a segunda nota: ");
		B = leia.nextDouble();
		// peso 3
		System.out.println("Digite a terceira nota: ");
		C = leia.nextDouble();
		// peso 5
		
		notaFinal = ((A*2) + (B*3) + (C*5) / (2*3*5));
		
		 System.out.println("A nota final é de: " + notaFinal);
		 
		 leia.close();
	}

}
