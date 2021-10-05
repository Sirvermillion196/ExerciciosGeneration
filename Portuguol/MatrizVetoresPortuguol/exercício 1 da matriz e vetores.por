programa
{
	// exercício 1 de matriz e vetores precisou de ajuda para ser finalizado
	
	funcao inicio()
	{
		inteiro contagem=0, numeros [5], maiorValor = 0

		// populando o vetor - inserindo valores
		para (contagem = 0; contagem < 5; contagem++) 
		{
			escreva(" Entre com os valores da pontuação: ")
			leia(numeros[contagem])
		}

		// mostrando este texto
		escreva("\nValores de vetores: ")
		// Lendo todos os valores do vetor
		para ( contagem = 0; contagem < 5; contagem++) 
		{
			se (numeros[contagem] > maiorValor) 
			{
				maiorValor = numeros[contagem]
				
			}
			escreva(numeros[contagem])
		}
			escreva("\n A maior pontuação é de: " + maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */