package ExerciciosPOO;

public class Funcionaria04 {
	//Atributos privado
    private String nome;
    private String sexo;
    private String endere�o;
    private String hobbys;
    private int idade;
    private double Rg;
    private double CPF;



    //metodos - fun��es - funcionalidades
    void Hor�rioEntrada() 
    {
        System.out.println("O colaborador entre na empresa �s...");
    }

    void Organizar() 

    {
        System.out.println("O colaborador est� organizando o arquivo...");
    }

    void Hor�rioDeSa�da() 
    {
        System.out.println("O colaborador termina o expediente �s....");
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getHobbys() {
		return hobbys;
	}

	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRg() {
		return Rg;
	}

	public void setRg(double rg) {
		Rg = rg;
	}

	public double getCPF() {
		return CPF;
	}

	public void setCPF(double cPF) {
		CPF = cPF;
	}
    
}
