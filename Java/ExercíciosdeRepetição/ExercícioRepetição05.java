package br.com.generation.ExercíciosdeRepetição;

import java.util.Scanner;

public class ExercícioRepetição05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int soma = 0, numeros;
		
		do 
		{
			System.out.println("Digite um número");
			numeros = leia.nextInt();
			soma += numeros;

		}
		while(numeros != 0);
		System.out.println("O Resultado da somatoria é: " + soma);
	} 

}
