package veiculo.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import veiculo.model.Aviao;

public class AviaoTestes {


	private Aviao aviao; 
	
	@Before
	public void setup() {
		aviao = new Aviao("", 0, 0, 0, "", "");
	}
	
	@Test
	public void setarCombustivel() throws Exception {
		aviao.Combustivel(40.0);
		assertEquals(40.0, aviao.getCombustivel(), 0.0001);
	}
	
	@Test
	public void setarModelo() throws Exception {
		aviao.Modelo("747");
		assertEquals("747", aviao.getModelo());
	}
	
	@Test
	public void setarPassageiros() throws Exception {
		aviao.Passageiros(250);
		assertEquals(250, aviao.getPassageiros());
	}
	
	@Test
	public void setarVelocidade() throws Exception {
		aviao.Velocidade(278.0);
		assertEquals(278.0, aviao.getVelocidade(), 0.0001);
	}
	
	@Test
	public void setarUso() throws Exception {
		aviao.Uso("Transporte de passageiros");
		assertEquals("Transporte de passageiros", aviao.getUso());
	}
	
	@Test
	public void setarTipo() throws Exception {
		aviao.Tipo("Comercial");
		assertEquals("Comercial", aviao.getTipo());
	}
	
}

