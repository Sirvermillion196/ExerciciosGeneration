package exerc�cios;

import java.util.Scanner;

	/* 1. Fa�a um sistema que leia a idade de uma pessoa 
	 expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
	
public class Programa��oSequencialquest�o01 {

	public static void main(String[] args) {
		
		int dias, meses, anos, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o dia que voc� nasceu:");
		dias = leia.nextInt();
		
		System.out.println("Digite o m�s que voc� nasceu: ");
		meses = leia.nextInt();
		
		System.out.println("Digite o ano que voc� nasceu: ");
		anos = leia.nextInt();
		
		resultado = dias +(meses * 30) + ((2021 - anos) * 365);
		
		System.out.println("O total de dias vividos � de: " + resultado);
		
		leia.close();
		
	}

}
