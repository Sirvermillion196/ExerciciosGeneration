package ExerciciosPOO;

public class TestePatinete05 {

	public static void main(String[] args) {

		Patinete05 p1 = new Patinete05();
		
		p1.setModelo("Furius");
		p1.setClassifica��o("Esporte radicais");
		p1.setNumeroSerial(71514123);
		
		System.out.println("O modelo do patinete �: " + p1.getModelo());
		System.out.println("A classifica��o do patinete �: " + p1.getClassifica��o());
		System.out.println("O n�mero serial � de: " + p1.getNumeroSerial());
		
		p1.Descendo();
		p1.Desacelerar();
		p1.Bateu();
	}

}
