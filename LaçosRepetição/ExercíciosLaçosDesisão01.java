package br.com.generation.condicionalexercícios;

import java.util.Scanner;

public class ExercíciosLaçosDesisão01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro número:");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) 
		{
			System.out.println("O maior número é: " + numero1);
		} else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior número é: " + numero2);
		} else {
			System.out.println("O maior número é: " + numero3);
		}
	}

}
