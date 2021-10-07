package ExerciciosPOO;

public class Eletronico03 {
    //Atributos privado
    private String nome;
    private String modelo;
    private int lançamento;


    //metodos - funções - funcionalidades
    void Ligando() 
    {
        System.out.println("O computador está iniciando...");
    }

    void Suspenso() 

    {
        System.out.println("O computador está em modo suspenso...");
    }

    void Desligando() 
    {
        System.out.println("O computador está desligando....");
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

	public int getLançamento() {
		return lançamento;
	}

	public void setLançamento(int lançamento) {
		this.lançamento = lançamento;
	}
    
}
