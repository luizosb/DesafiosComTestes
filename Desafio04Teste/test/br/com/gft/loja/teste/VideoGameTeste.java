package br.com.gft.loja.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.VideoGame;

public class VideoGameTeste {

	private VideoGame games;
	
	@Before
	public void setup() {
		games = new VideoGame("",0.0,0,"","",false);
	}
	
	
	@Test
	public void impostoSobreUmVideoGameNovo() throws Exception {
		games.setUsado(false);
		games.calculoDoPreco(100);
		assertEquals(45, games.getPreco(), 0.0001);
	}
	
	@Test
	public void impostoSobreUmVideoGameUsado() throws Exception {
		games.setUsado(true);
		games.calculoDoPreco(100);
		assertEquals(25, games.getPreco(), 0.0001);
	}
	
	
}
