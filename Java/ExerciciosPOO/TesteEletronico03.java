package ExerciciosPOO;

public class TesteEletronico03 {

	public static void main(String[] args) {

		Eletronico03 e1 = new Eletronico03();
		
		e1.setNome("T-Gamer");
		e1.setModelo("Full-Custom");
		e1.setLan�amento(2015);
		
		System.out.println("O nome do computador �: " + e1.getNome());
		System.out.println("O nome do modelo do computador �: " + e1.getModelo());
		System.out.println("A data do lan�amento do computador �: " + e1.getLan�amento());
		
		e1.Ligando();
		e1.Suspenso();
		e1.Desligando();
	}

}
