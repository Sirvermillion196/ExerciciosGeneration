package br.com.generation.Exerc�ciosdeRepeti��o;

import java.util.Scanner;

public class Exerc�cioRepeti��o05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int soma = 0, numeros;
		
		do 
		{
			System.out.println("Digite um n�mero");
			numeros = leia.nextInt();
			soma += numeros;

		}
		while(numeros != 0);
		System.out.println("O Resultado da somatoria �: " + soma);
	} 

}
