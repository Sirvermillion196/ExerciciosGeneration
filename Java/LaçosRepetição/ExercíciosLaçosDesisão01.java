package br.com.generation.condicionalexerc�cios;

import java.util.Scanner;

public class Exerc�ciosLa�osDesis�o01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro n�mero:");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero:");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) 
		{
			System.out.println("O maior n�mero �: " + numero1);
		} else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior n�mero �: " + numero2);
		} else {
			System.out.println("O maior n�mero �: " + numero3);
		}
	}

}
