package exercícios;

import java.util.Scanner;

public class ProgramaçãoSequencialquestão08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double custoDistribuidora, custaDeImposto, custoFinal, custoDeFabrica;
		
		System.out.println("Digite o valor do carro: ");
		custoDeFabrica = leia.nextDouble();
		
		//foi somado o valor da porcentagem de 28% + 45% = 73%
		
		custoFinal = custoDeFabrica * 1.73;
		
		System.out.println("O valor do carro para o consumidor é: " + custoFinal);
		
		leia.close();
	}

}
