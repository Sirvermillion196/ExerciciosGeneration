package br.com.generation.ExercíciosdeRepetição;

import java.util.Scanner;

public class ExercícioRepetição02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int par = 0, numeros, impar = 0;
		
		for(int n = 0; n <= 9; n++) 
		{
			System.out.println("Digite números: ");
			numeros = leia.nextInt();
			
		if(numeros % 2 !=0) 
		{ 
			par++;
		}
		else {
			impar++;
	 }
	}
			System.out.println("Os números pares são: " + par);
			System.out.println("Os números impares são: " + impar);
  }
}
