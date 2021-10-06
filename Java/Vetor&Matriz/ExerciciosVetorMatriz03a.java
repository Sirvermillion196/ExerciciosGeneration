package exerciciosVetorMatriz;

import java.util.Scanner;

public class ExerciciosVetorMatriz03a {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		int linha, coluna;
		
		System.out.println("\nMatriz N1");
		for(linha = 0; linha < n1.length; linha++) 
		{
			for(coluna = 0; coluna < n1[linha].length; coluna++) 
			{
				System.out.printf("Digite o valor da posição %d %d: ", linha,coluna);
				n1[linha][coluna] = leia.nextInt();
			}
		}
		System.out.println("\nMatriz N2");
		for(linha = 0; linha < n2.length; linha++) 
		{
			for(coluna = 0; coluna < n2[linha].length; coluna++) 
			{
				System.out.printf("Digite o valor da posição %d %d: ", linha,coluna);
				n2[linha][coluna] = leia.nextInt();
			}
		}
		//O cálculo da matriz M1
		for(linha = 0; linha < m1.length; linha++) 
		{
			for(coluna = 0; coluna < m1[linha].length; coluna++) 
			{
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]; 
			}
		}  
		//O cálculo da matriz M2
		for(linha = 0; linha < m2.length; linha++) 
		{
			for(coluna = 0; coluna < m2[linha].length; coluna++) 
			{
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]; 
			}
		}
		System.out.println("\nMatriz M1");
		for(linha = 0; linha < m1.length; linha++) 
		{
			for(coluna = 0; coluna < m1[linha].length; coluna++) 
			{
				System.out.print(m1[linha][coluna] + "  " );
			}
			System.out.println();
		}
		System.out.println("\nMatriz M2");
		for(linha = 0; linha < m2.length; linha++) 
		{
			for(coluna = 0; coluna < m2[linha].length; coluna++) 
			{
				System.out.print(m2[linha][coluna] + "  " );
			}
			System.out.println();
		}
		
	}

}
