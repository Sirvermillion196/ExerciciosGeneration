package ExerciciosPOO;

public class Funcionaria04 {
	//Atributos privado
    private String nome;
    private String sexo;
    private String endereço;
    private String hobbys;
    private int idade;
    private double Rg;
    private double CPF;



    //metodos - funções - funcionalidades
    void HorárioEntrada() 
    {
        System.out.println("O colaborador entre na empresa ás...");
    }

    void Organizar() 

    {
        System.out.println("O colaborador está organizando o arquivo...");
    }

    void HorárioDeSaída() 
    {
        System.out.println("O colaborador termina o expediente ás....");
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
