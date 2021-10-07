package ExerciciosPOO;

public class Aviao02 {
	//Atributos privado
	private String nome;
	private String modelo;
	private int ano;
	
	//metodos - funções - funcionalidades
		void Decolando() 
		{
			System.out.println("O avião está decolando...");
		}
		
		void Pousando() 
		
		{
			System.out.println("O avião está pousando...");
		}
		
		void Hangar() 
		{
			System.out.println("O avião está no hangar 06....");
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

}
