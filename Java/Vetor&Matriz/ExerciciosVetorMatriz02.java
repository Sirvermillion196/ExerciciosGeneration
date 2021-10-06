package exerciciosVetorMatriz;

import java.util.Scanner;

public class ExerciciosVetorMatriz02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [] dado = new int [10];
		int contador, maiorValor = 0, numero = 0;
		double media = 0.0, soma = 0.0;
		
		for(contador = 0; contador < dado.length; contador++) 
		{
		System.out.println("Digite o " + (contador+1) + " valor do dado: ");
		dado[contador] = leia.nextInt();
			while(dado[contador] >= 7 || dado[contador] <= 0) 
			{
				System.out.println("Valor inválido!!");
				System.out.println("Digite o " + (contador+1) + " valor do dado: ");
				dado[contador] = leia.nextInt();
			}
			if(dado[contador] > maiorValor) 
			{
				maiorValor = dado[contador];
			}
			soma += dado[contador];
			media = soma / dado.length;
		}
		for(contador = 0; contador < dado.length; contador++) 
		{
			System.out.println("\nOs valores do vetor são: " + dado[contador]);
			
			if(dado[contador] == maiorValor) 
			{
				numero++;
			}
		}
		System.out.println("\nO maior valor repetido é: " + maiorValor);
		System.out.println("Este valor aparece: " + numero + " vezes");
		System.out.println("\nO valor da media é: " + media);
	}
}
