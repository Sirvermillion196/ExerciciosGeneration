package br.com.generation.Exerc�ciosdeRepeti��o;

import java.util.Scanner;

public class Exerc�cioRepeti��o03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, contador21 = 0, contador50 = 0;
		
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		while(idade != -99) 
		{
			if(idade <= 21) 
			{
				contador21++;
			}
			if(idade >= 50) 
			{
				contador50++;
			}
			System.out.println("\nDigite a idade -> (Para encerrar digite -99):");
			idade = leia.nextInt();
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + contador21);
		System.out.println("Total de pessoas com mais de 50 anos: " + contador50);
	}

}
