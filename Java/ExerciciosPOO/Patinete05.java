package ExerciciosPOO;

public class Patinete05 {
	//Atributos privador
    private String modelo;
    private String Classifica��o;
    private int numeroSerial;


    //metodos - fun��es - funcionalidades
    void Descendo() 
    {
        System.out.println("O patinete est� descendo o morro...");
    }

    void Desacelerar  () 

    {
        System.out.println("O patinete est� usando o freio...");
    }

    void Bateu() 
    {
        System.out.println("O patinete bateu no murro....");
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getClassifica��o() {
		return Classifica��o;
	}

	public void setClassifica��o(String classifica��o) {
		Classifica��o = classifica��o;
	}

	public int getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
    
}
