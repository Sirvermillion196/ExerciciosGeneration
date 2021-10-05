package exercícios;

import java.util.Scanner;

	/* 1. Faça um sistema que leia a idade de uma pessoa 
	 expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
	
public class ProgramaçãoSequencialquestão01 {

	public static void main(String[] args) {
		
		int dias, meses, anos, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o dia que você nasceu:");
		dias = leia.nextInt();
		
		System.out.println("Digite o mês que você nasceu: ");
		meses = leia.nextInt();
		
		System.out.println("Digite o ano que você nasceu: ");
		anos = leia.nextInt();
		
		resultado = dias +(meses * 30) + ((2021 - anos) * 365);
		
		System.out.println("O total de dias vividos é de: " + resultado);
		
		leia.close();
		
	}

}
