package ExerciciosPOO;

public class TesteEletronico03 {

	public static void main(String[] args) {

		Eletronico03 e1 = new Eletronico03();
		
		e1.setNome("T-Gamer");
		e1.setModelo("Full-Custom");
		e1.setLançamento(2015);
		
		System.out.println("O nome do computador é: " + e1.getNome());
		System.out.println("O nome do modelo do computador é: " + e1.getModelo());
		System.out.println("A data do lançamento do computador é: " + e1.getLançamento());
		
		e1.Ligando();
		e1.Suspenso();
		e1.Desligando();
	}

}
