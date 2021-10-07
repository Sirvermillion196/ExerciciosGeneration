package ExerciciosPOO;

public class Cliente01 {
	//Atributos privado
	private String nome;
	private String curso;
	private int idade;
	
	
	//metodos - funções - funcionalidades
	void PagarConta() 
	{
		System.out.println("O cliente pagando a conta...");
	}
	
	void Cadastrar() 
	
	{
		System.out.println("O cliente cadastrando-se no curso...");
	}
	
	void ComprarCurso() 
	{
		System.out.println("O cliente comprando o curso....");
	}
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
