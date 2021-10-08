package ExerciciosPoliformismoHerança;

public class TestaAnimalTudo {

	public static void main(String[] args) {

		Cavalo cavalo1 = new Cavalo();
		Cachorro cachorro1 = new Cachorro();
		Preguiça preguica1 = new Preguiça();
		
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
		
		System.out.println("O nome do cavalo é: " + cavalo1.getNome());
		System.out.println("A idade do cavalo é: " + cavalo1.getIdade());
		System.out.println("O som que o cavalo faz é: " + cavalo1.getSom());
		System.out.println("O cavalo gosta de: " + cavalo1.getCorrer());
		System.out.println();

		System.out.println("O nome do cachorro é: " + cachorro1.getNome());
		System.out.println("A idade do cachorro é: " + cachorro1.getIdade());
		System.out.println("O som que o cachorro faz é: " + cachorro1.getSom());
		System.out.println("O cachorro gosta de: " + cachorro1.getCorrer());
		System.out.println();

		System.out.println("O nome da preguiça é: " + preguica1.getNome());
		System.out.println("A idade da preguiça é: " + preguica1.getIdade());
		System.out.println("O som que a preguiça faz é: " + preguica1.getSom());
		System.out.println("A pregui gosta de: " + preguica1.getSubir());

	}

}
