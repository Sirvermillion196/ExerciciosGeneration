package ExercíciosPolimorfismo;

public class ImprimirAnimal {

	public static void main(String[] args) {

		TestaAnimal t = new TestaAnimal();
		
		t.fazerSomAnimal(new Cachorro());
		t.fazerSomAnimal(new Cavalo());
		t.fazerSomAnimal(new Preguiça());
	}

}
