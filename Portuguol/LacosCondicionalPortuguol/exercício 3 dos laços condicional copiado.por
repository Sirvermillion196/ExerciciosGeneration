programa {
	
     // exercício 3
     inclua biblioteca Matematica --> mat
	funcao inicio() {

	real num1, num2, num3, num4

		escreva("informe o primeiro numero: \n")
		leia(num1)
	
		escreva("informe o segundo numero: \n")
		leia(num2)
	
		escreva("informe o terceiro numero: \n")
		leia(num3)
	
		escreva("informe o quarto numero: \n")
		leia(num4)

		num1 = mat.potencia (num1, 2.0)
		num1 = mat.potencia (num2, 2.0)
		num1 = mat.potencia (num3, 2.0)
		num1 = mat.potencia (num4, 2.0)

		se (num3 >=1000){
			escreva(" Seu resultado é" + num3)
		}
		senao
		escreva("os numeros informados são: " + num1 +  ", " + num2 +  ", " + num3 + ", " + num4)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */