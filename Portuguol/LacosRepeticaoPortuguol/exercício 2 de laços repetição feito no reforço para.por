programa {
	/*
	Desenvolver um sistema que efetue a soma de todos os números 
	ímpares que são  múltiplos de três e que se encontram no 
	conjunto dos números de 1 até 500
	
	Autor: Guilherme de Sousa
	*/
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){

		inteiro numero, soma = 0

		//inicio, fim e passo
		
		para (numero = 1; numero <= 500; numero+=2) { // O ++ é o passo, isso segnifica que ele está indo de 1 em 1
											// O += é para mostrar de 2 em 2

		se(numero % 3 == 0) {
			soma += numero
	   }
		
      }
		escreva("\n Somando todos os valores o resultado é: ", soma)	
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */