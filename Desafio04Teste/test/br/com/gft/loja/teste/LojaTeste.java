package br.com.gft.loja.teste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.Livros;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class LojaTeste {
	
	
	private Loja americanas;
	
	@Before
	public void setup(){
		Livros l1 = new Livros("Harry Potter", 40, 50, "J.K.Rowling", "fantasia", 300);
		Livros l2 = new Livros("Senhor dos An�is", 60, 30, "J.R.R.Tolkien", "fantasia", 500);
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
		
		americanas = new Loja("Americanas", "12345678", livros, games);
	}

	@Test
	public void calcularOImpostoSobreLivro() throws Exception {
		americanas.calculaPatrimonioTeste();
		assertEquals(941800.0, americanas.calculaPatrimonioTeste(), 0.0001);
		
	}
}
