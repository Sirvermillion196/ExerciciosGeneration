package br.com.generation.Exerc�ciosdeRepeti��o;

import java.util.Scanner;
// Feito com ajuda
public class Exerc�cioRepeti��o04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade,pessoaCalmamenor = 0, sexo, outraCalma = 0, pessoaCalma = 0, mulherNervosa = 0, pessoas = 0, homemAgressivo = 0, pessoaNervosa = 0, caracteristica;
		
		while(pessoas < 5) 
		{
			pessoas++;
			System.out.println("Qual � a sua idade?");
			idade = leia.nextInt();
			System.out.println("Informe o seu sexo (1-Feminino /2 Masculino /3 Outros)");
			sexo = leia.nextInt();
			System.out.println("Informe as caract�risticas psicologicas (1 para calma /2 para nervosa /3 para agressiva)");
			caracteristica = leia.nextInt();
			
			if(caracteristica == 1) 
			{
				pessoaCalma++;
			}
			if(sexo == 1 && caracteristica == 2) 
			{
				mulherNervosa++;
			}
			if(sexo == 2 && caracteristica == 3) 
			{
				homemAgressivo++;
			}
			if(sexo == 3 && caracteristica == 1) 
			{
				outraCalma++;
			}
			if(idade > 40 && caracteristica == 2) 
			{
				pessoaNervosa++;
			}
			if(idade < 18 && caracteristica == 1) 
			{
				pessoaCalmamenor++;
			}
		}
		System.out.println("O n�mero de pessoas calmas �:...................... " + pessoaCalma);
		System.out.println("O n�mero de mulheres nervosas �:................... " + mulherNervosa);
		System.out.println("O n�mero de homens agressivos �:................... " + homemAgressivo);
		System.out.println("O n�mero de outros calmas �:....................... " + outraCalma);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + pessoaNervosa);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos  �: " + pessoaCalmamenor);
	}

}
