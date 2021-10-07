package ExerciciosPOO;

public class TestePatinete05 {

	public static void main(String[] args) {

		Patinete05 p1 = new Patinete05();
		
		p1.setModelo("Furius");
		p1.setClassificação("Esporte radicais");
		p1.setNumeroSerial(71514123);
		
		System.out.println("O modelo do patinete é: " + p1.getModelo());
		System.out.println("A classificação do patinete é: " + p1.getClassificação());
		System.out.println("O número serial é de: " + p1.getNumeroSerial());
		
		p1.Descendo();
		p1.Desacelerar();
		p1.Bateu();
	}

}
