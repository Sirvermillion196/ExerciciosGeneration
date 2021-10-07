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
		
		System.out.println("O nome da colaboradora é: " + f1.getNome());
		System.out.println("O sexo do colaborador é: " + f1.getSexo());
		System.out.println("A idade do colaborador é: " + f1.getIdade());
		System.out.println("O número de RG do colaborador é: " + f1.getRg());
		System.out.println("O número de CPF do colaborador é: " + f1.getCPF());
		System.out.println("Os hobbys do colaborador são: " + f1.getHobbys());
		
		f1.HorárioEntrada();
		f1.Organizar();
		f1.HorárioDeSaída();

	}

}
