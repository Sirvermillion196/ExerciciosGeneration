package br.com.generation.condicionalexerc�cios;

import java.util.Scanner;
// Feito com ajuda dos colegas
public class Exerc�ciosLa�osDesis�o04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if(numero % 2 ==0.0) 
		{
			System.out.println("Este n�mero � par: " + numero);
			System.out.println("A raiz do n�mero par ser�: " + Math.sqrt(numero));
		} else {
			System.out.println("Este n�mero � imp�r: " + numero);
			System.out.println("O n�mero imp�r elevado ao quadrado �: " + Math.pow(numero, 2));
		}
	}

}
