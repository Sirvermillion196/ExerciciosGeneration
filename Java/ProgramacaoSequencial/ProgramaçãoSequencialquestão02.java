package exerc�cios;

import java.util.Scanner;

public class Programa��oSequencialquest�o02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int dias, dia, mes, anos;
		
		System.out.println("Digite o total de dias que voc� viveu: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		mes = (dias % 365)/ 30;
		dia = (dias % 365) % 30;
		
		System.out.println("Sua data de nascimento �: " +dia+ "/" +mes+ "/" + (2021 - anos));
		
		leia.close();
	}

}
