package br.com.generation.ExercíciosdeRepetição;

import java.util.Scanner;
// Feito com ajuda e copia
public class ExercícioRepetição06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double numero, contador= 0, soma = 0;
		
		do 
		{
		System.out.println("Digite um número");
		numero = leia.nextDouble();
		if((numero % 3 ==0) && (numero != 0)) 
		{
			soma += numero;
			contador++;
		}
		
		}
		while(numero != 0);
		System.out.println("A média de números de multiplos de 3 foram: " + (soma/contador));
		leia.close();
		
	}

}
