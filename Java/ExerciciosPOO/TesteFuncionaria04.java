package ExerciciosPOO;

public class TesteFuncionaria04 {

	public static void main(String[] args) {

		Funcionaria04 f1 = new Funcionaria04();
		
		f1.setNome("Genevi");
		f1.setSexo("Feminino");
		f1.setIdade(24);
		f1.setRg(0000000000);
		f1.setCPF(00000000000);
		f1.setHobbys("Pintura e games");
		
		System.out.println("O nome da colaboradora �: " + f1.getNome());
		System.out.println("O sexo do colaborador �: " + f1.getSexo());
		System.out.println("A idade do colaborador �: " + f1.getIdade());
		System.out.println("O n�mero de RG do colaborador �: " + f1.getRg());
		System.out.println("O n�mero de CPF do colaborador �: " + f1.getCPF());
		System.out.println("Os hobbys do colaborador s�o: " + f1.getHobbys());
		
		f1.Hor�rioEntrada();
		f1.Organizar();
		f1.Hor�rioDeSa�da();

	}

}
