package ExerciciosPOO;

public class Patinete05 {
	//Atributos privador
    private String modelo;
    private String Classificação;
    private int numeroSerial;


    //metodos - funções - funcionalidades
    void Descendo() 
    {
        System.out.println("O patinete está descendo o morro...");
    }

    void Desacelerar  () 

    {
        System.out.println("O patinete está usando o freio...");
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

	public String getClassificação() {
		return Classificação;
	}

	public void setClassificação(String classificação) {
		Classificação = classificação;
	}

	public int getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
    
}
