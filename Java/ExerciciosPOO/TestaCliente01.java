package ExerciciosPOO;

public class TestaCliente01 {

	public static void main(String[] args) {

		Cliente01 c1 = new Cliente01();
		
		c1.setNome("Guilherme");
		c1.setIdade(24);
		c1.setCurso("Programa��o - Java");
		
		System.out.println("O nome do Cliente �: " + c1.getNome());
		System.out.println("A idade do cliente �: " + c1.getIdade());
		System.out.println("O curso que o cliente ter� �: " + c1.getCurso());
		
		c1.Cadastrar();
		c1.PagarConta();
		c1.ComprarCurso();
		
	}

}
