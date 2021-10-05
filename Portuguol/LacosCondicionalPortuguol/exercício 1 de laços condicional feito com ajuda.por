programa {
	// exercício 1 de laços
	funcao inicio() {

		inteiro peso, excesso, multa
		

		escreva("O peso dos tomates em quilos é: ")
		leia(peso)

		excesso = peso - 50

		se( excesso <=0) {
		escreva("Você não tem que pagar multa:")
		}
		senao se( excesso > 0) {
		multa = excesso * 4
		escreva("	O seu excesso é de: " + excesso + "e o valor de sua multa vai ser de: " + multa + ",00 reais: ")

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */