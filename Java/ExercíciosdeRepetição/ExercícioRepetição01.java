package br.com.generation.ExercíciosdeRepetição;

public class ExercícioRepetição01 {

	public static void main(String[] args) {

		int x = 1000;
		
		for(;x <= 1999; x++) 
		{	
			if(x % 11 ==5) 
			{
				System.out.println("Os números que divididos são: " + x);
			} 

		}
	}

}
