package br.com.generation.Exerc�ciosdeRepeti��o;

import java.util.Scanner;

public class Exerc�cioRepeti��o02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int par = 0, numeros, impar = 0;
		
		for(int n = 0; n <= 9; n++) 
		{
			System.out.println("Digite n�meros: ");
			numeros = leia.nextInt();
			
		if(numeros % 2 !=0) 
		{ 
			par++;
		}
		else {
			impar++;
	 }
	}
			System.out.println("Os n�meros pares s�o: " + par);
			System.out.println("Os n�meros impares s�o: " + impar);
  }
}
