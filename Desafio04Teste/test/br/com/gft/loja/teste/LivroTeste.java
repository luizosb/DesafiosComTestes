package br.com.gft.loja.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.Livros;

public class LivroTeste {
	
	public Livros livros;
	
	@Before
	public void setup() {
		livros = new Livros("", 0.0, 0, "", "", 0);
	}
	
	@Test
	public void impostoSobreUmLivro() throws Exception {
		livros.impostoSobrePreco(65.0);
		assertEquals(6.5, livros.getPreco(), 0.001);
	}
	
	@Test
	public void impostoSobreUmLivroEducativo() throws Exception{
		livros.setTema("educativo");
		livros.impostoSobrePreco(50.0);
		assertEquals(0, livros.getPreco(), 0.0001);
	}

}
