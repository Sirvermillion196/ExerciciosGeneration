package ExercíciosColletions;

//Fiz com ajuda do exercício resolvido de alguém, acho que fiz certo

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueFinal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		double preco1 = 1.0, preco2 = 5.0, preco3 = 3.0;
		int op = 0, qtdProdutos = 0;
		String nome, produto1 = "Bala", produto2 = "Chocolate", produto3 = "Cebola";
		
		System.out.println("Entrando no sistema do Almoxarifado bem vindo! ");
		System.out.println("\nSelecione uma das opções a seguir: ");
		
		System.out.println("Entre com a seguintes opções: \n [1] Adcionar \n [2] Remover \n [3] Atualizar");
		op = leia.nextInt();
		
		estoque.add(new Estoque(produto1, preco1));
		estoque.add(new Estoque(produto2, preco2));
		estoque.add(new Estoque(produto3, preco3));
		
		System.out.println("Entrando no estoque");

		for(Estoque i : estoque) 
		{
			System.out.println(i);
			
		}
		
		if(op == 1) 
		{
			System.out.println("A quantidade do novo produto que deseja adcionar é de? ");
			qtdProdutos = leia.nextInt();
			
			for(int i = 0; i < qtdProdutos; i++) 
			{
				System.out.println("Entre com o nome do produto: ");
				nome = leia.next();
				
				System.out.println("Entre com o preço do novo produto: ");
				double preco = leia.nextDouble();
				
				estoque.add(new Estoque(nome, preco));
				
			}
			
			System.out.println("Novo produto adcionado e o estoque foi atualizado!! ");
			for(Estoque x : estoque) 
			{
				System.out.println(x);
			}
			
		}
			
			if(op == 2) 
			{
				System.out.println("Entre com o código do produto que deseja remover: ");
				int p = leia.nextInt();
				
				if(p == 1) 
				{
					estoque.remove(0);
				}
				if(p == 2) 
				{
					estoque.remove(1);
				}
				if(p == 3) 
				{
					estoque.remove(2);
				}
			System.out.println("Produto removido e estoque atualizado!! ");
			for(Estoque x : estoque) 
			{
				System.out.println(x);
			}
			
			}
			
			if(op == 3) 
			{
				System.out.println("\nEntre com código do produto que deseja atualizar: ");
				int at = leia.nextInt();
			
				System.out.println("Entre com o novo valor do produto: ");
				double novo = leia.nextDouble();
			
				if(at == 1) 
				{
				estoque.remove(0);
				estoque.add(new Estoque(produto1, novo));
				}
				else if(at == 2) 
				{
				estoque.remove(1);
				estoque.add(new Estoque(produto2, novo));
				}
				else if (at == 3)  
				{
				estoque.remove(2);
				estoque.add(new Estoque(produto3, novo));
				}
				
				System.out.println("\n Preço ajustado e estoque atualizado!! ");
				for(Estoque x : estoque) 
				{
					System.out.println(x);
				}
		}	
			leia.close();
	}

}
