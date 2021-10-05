package exercícios;

import java.util.Scanner;

public class ProgramaçãoSequencialquestão07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, E, F, X, Y;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();
		
		System.out.println("Digite o valor de D; ");
		D = leia.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		F = leia.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		E = leia.nextDouble();
		
		X = ((C*E) - (B*F)) / ((A*F) - (C*D));
		Y = ((A*F) - (C*D)) / ((A*E) - (B*D));
		
		System.out.println("O resultado de X: " + X);
		System.out.println("O resultado de Y: " + Y);
		
		leia.close();
	}

}
