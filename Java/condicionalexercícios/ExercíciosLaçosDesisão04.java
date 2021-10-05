package br.com.generation.condicionalexercícios;

import java.util.Scanner;
// Feito com ajuda dos colegas
public class ExercíciosLaçosDesisão04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		if(numero % 2 ==0.0) 
		{
			System.out.println("Este número é par: " + numero);
			System.out.println("A raiz do número par será: " + Math.sqrt(numero));
		} else {
			System.out.println("Este número é impár: " + numero);
			System.out.println("O número impár elevado ao quadrado é: " + Math.pow(numero, 2));
		}
	}

}
