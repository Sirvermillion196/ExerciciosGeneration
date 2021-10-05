package exercícios;

import java.util.Scanner;

public class ProgramaçãoSequencialquestão03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Digite a quantidade de segundos: ");
		segundos = leia.nextInt();
		System.out.println("Em segundos: " + segundos);
		
		minutos = segundos / 60;
		System.out.println("Em minutos: " + minutos);
		
		horas= segundos / 3600;
		System.out.println("Em horas: " + horas);
		
		leia.close();
	
	}	

}
