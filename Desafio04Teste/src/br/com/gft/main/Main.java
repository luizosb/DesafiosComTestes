package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Livros;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class Main {

	public static void main(String[] args) {
		
		Livros l1 = new Livros("Harry Potter", 40, 50, "J.K.Rowling", "fantasia", 300);
		Livros l2 = new Livros("Senhor dos Anéis", 60, 30, "J.R.R.Tolkien", "fantasia", 500);
		Livros l3 = new Livros("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4" , 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("PS4", 1500, 500, "Microsoft", "One", false);
		
		List<Livros> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		l2.calculaImposto();
		l3.calculaImposto();
		
		
		ps4Usado.calculaImposto();
		ps4.calculaImposto();

		System.out.println("---------------------------------------------------------------");
		
		americanas.listaLivros();
		System.out.println("---------------------------------------------------------------");
		americanas.listaVideoGame();
		System.out.println("---------------------------------------------------------------");
		americanas.calculaPatrimonio();
		
				
		}

}