package ExerciciosPOO;

public class Eletronico03 {
    //Atributos privado
    private String nome;
    private String modelo;
    private int lan�amento;


    //metodos - fun��es - funcionalidades
    void Ligando() 
    {
        System.out.println("O computador est� iniciando...");
    }

    void Suspenso() 

    {
        System.out.println("O computador est� em modo suspenso...");
    }

    void Desligando() 
    {
        System.out.println("O computador est� desligando....");
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

	public int getLan�amento() {
		return lan�amento;
	}

	public void setLan�amento(int lan�amento) {
		this.lan�amento = lan�amento;
	}
    
}
