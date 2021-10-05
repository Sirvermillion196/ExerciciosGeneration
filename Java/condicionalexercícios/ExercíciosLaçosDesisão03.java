package br.com.generation.condicionalexercícios;

import java.util.Scanner;

public class ExercíciosLaçosDesisão03 {
	// 10-14 infantil/15-17 juvenil/18-25 adulto
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		if(idade <= 14 && idade >=10) 
		{
			System.out.println("Sua classificação é 10-14 Infantil");
		} else if(idade <= 17 && idade >= 15) {
			System.out.println("Sua classificação é 15-17 Juvenil");
		} else if(idade <= 25 && idade >= 18) {
			System.out.println("Sua classificação é de 18-25 Adulto");
		} else if(idade >=26) {
			System.out.println("Você é velho demais para essa pesquisa!!!");
		} else if(idade <= 9) {
			System.out.println("Você é novo demais para essa pesquisa!!!");
		}
	}

}
