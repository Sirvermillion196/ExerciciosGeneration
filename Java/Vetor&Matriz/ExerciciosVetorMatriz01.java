package exerciciosVetorMatriz;

import java.util.Scanner;

public class ExerciciosVetorMatriz01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int[] notas = new int[5]; // [0]....[4]
		int maiorValor = 0;
		
		int valor;
		System.out.println("Digite o valor das notas: ");
		for(valor = 0; valor < notas.length; valor++) 
		{
		notas[valor] = leia.nextInt();
		} 		
		for(valor= 0; valor < notas.length; valor++) 
		{ 
			if(notas[valor] > maiorValor) 
			{
		        System.out.println("\nO valor dos vetores é: " + notas[valor]);
				maiorValor = notas[valor];
			}
		} 	System.out.println("O maior valor é de: " + maiorValor);
	} 

}