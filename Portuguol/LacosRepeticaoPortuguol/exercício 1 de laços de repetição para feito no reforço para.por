programa {
	
	/*
	A prefeitura de uma cidade fez uma pesquisa entre 5 de seus habitantes OK, 
	coletando dados sobre o salário OK e número de filhos OK. 
	A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.  

	Autor: Guilherme de Sousa
	*/

	
	funcao inicio() {

	inteiro filhos, habitantes, somaF = 0, menos100 = 0
	real salario, somaS = 0.0, maiorSalario = 0.0, percentual = 0.0

	para (habitantes = 1; habitantes < 5; habitantes++) {	

		escreva("\nQuantos filhos você tem?: ")
		leia(filhos)
		escreva("Qual é o seu salário: ")
		leia(salario)

		somaS += salario
		somaF += filhos
		//a variavel soma que vale 0, recebe o valor que ela já tem mais o salario

		se (salario > maiorSalario) {
			maiorSalario = salario
		}
		se (salario <= 100) {
			menos100 += 1 
		}
     }  
		escreva("\nO salário médio da população é: ", somaS / 4)
		escreva("\nA média de filhos da população é: ", somaF / 4)
		escreva("\nO maior salário é de: ", maiorSalario)
		escreva("\nA quantidade de pessoas com salário menor ou igual a: ", menos100)
		
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */