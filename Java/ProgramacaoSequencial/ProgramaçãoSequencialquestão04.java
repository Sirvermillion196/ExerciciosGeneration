package exercícios;

import java.util.Scanner;

public class ProgramaçãoSequencialquestão04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int A, B, C, R, S;
		float D;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = (A + B)*(A + B);
		S = (B + C)*(B +C);
		D = (R + S)/ 2;
		
		System.out.println("O resultado da expressão é de :" + D);
		
		leia.close();	
	}

}