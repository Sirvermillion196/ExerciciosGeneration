package ExerciciosPoliformismoHeran�a;

public class TestaAnimalTudo {

	public static void main(String[] args) {

		Cavalo cavalo1 = new Cavalo();
		Cachorro cachorro1 = new Cachorro();
		Pregui�a preguica1 = new Pregui�a();
		
		cavalo1.setNome("Pony Maldito");
		cavalo1.setIdade(5);
		cavalo1.setSom("Relincho");
		cavalo1.setCorrer("Galopar");
		
		cachorro1.setNome("Josesvaldo");
		cachorro1.setIdade(6);
		cachorro1.setSom("Late");
		cachorro1.setCorrer("Correr");
		
		preguica1.setNome("Soneca");
		preguica1.setIdade(12);
		preguica1.setSom("ZzZzZ");
		preguica1.setSubir("subir para dormir");
		
		System.out.println("O nome do cavalo �: " + cavalo1.getNome());
		System.out.println("A idade do cavalo �: " + cavalo1.getIdade());
		System.out.println("O som que o cavalo faz �: " + cavalo1.getSom());
		System.out.println("O cavalo gosta de: " + cavalo1.getCorrer());
		System.out.println();

		System.out.println("O nome do cachorro �: " + cachorro1.getNome());
		System.out.println("A idade do cachorro �: " + cachorro1.getIdade());
		System.out.println("O som que o cachorro faz �: " + cachorro1.getSom());
		System.out.println("O cachorro gosta de: " + cachorro1.getCorrer());
		System.out.println();

		System.out.println("O nome da pregui�a �: " + preguica1.getNome());
		System.out.println("A idade da pregui�a �: " + preguica1.getIdade());
		System.out.println("O som que a pregui�a faz �: " + preguica1.getSom());
		System.out.println("A pregui gosta de: " + preguica1.getSubir());

	}

}
