package ExerciciosPOO;

public class TesteAviao02 {

	public static void main(String[] args) {
		
		Aviao02 a1 = new Aviao02();
		
		a1.setNome("Boing");
		a1.setModelo("Modelo de carga");
		a1.setAno(2002);
		
		System.out.println("O nome do avi�o �: " + a1.getNome());
		System.out.println("O modelo do avi�o �: " + a1.getModelo());
		System.out.println("Esse modelo � de: " + a1.getAno());
		
		a1.Decolando();
		a1.Pousando();
		a1.Hangar();

	}

}
