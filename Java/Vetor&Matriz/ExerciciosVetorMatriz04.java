package exerciciosVetorMatriz;

import java.util.Scanner;

public class ExerciciosVetorMatriz04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		int linha, coluna, soma =0, somaD = 0;
		
		System.out.println("Matriz");
		for(linha = 0; linha < matriz.length; linha++) 
		{
			for(coluna = 0; coluna < matriz.length; coluna++) 
			{
				System.out.printf("\nDigite o valor da posição %d %d:" , linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		for(linha = 0; linha < matriz.length; linha++) 
		{
			for(coluna = 0; coluna < matriz.length; coluna++) 
			{
				soma += matriz[linha][coluna];
				
				if(linha == coluna) 
				{
					somaD += matriz[linha][coluna];
				}
			}
			System.out.println("A soma da matriz é: " + soma);
			System.out.println("A soma em diagonal da matriz é: " + somaD);
		}
	}

}
