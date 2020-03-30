package veiculo.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import veiculo.model.Carro;

public class CarroTestes {
	
	private Carro carro; 
	
	@Before
	public void setup() {
		carro = new Carro("", 0, 0, 0, "", 0, 0);
	}
	
	@Test
	public void setarCombustivel() throws Exception {
		carro.Combustivel(40.0);
		assertEquals(40.0, carro.getCombustivel(), 0.0001);
	}
	
	@Test
	public void setarModelo() throws Exception {
		carro.Modelo("206");
		assertEquals("206", carro.getModelo());
	}
	
	@Test
	public void setarPassageiros() throws Exception {
		carro.Passageiros(4);
		assertEquals(4, carro.getPassageiros());
	}
	
	@Test
	public void setarVelocidade() throws Exception {
		carro.Velocidade(120.0);
		assertEquals(120.0, carro.getVelocidade(), 0.0001);
	}
	
	@Test
	public void setarMarca() throws Exception {
		carro.Marca("Pegeout");
		assertEquals("Pegeout", carro.getMarca());
	}
	
	@Test
	public void setarPortas() throws Exception {
		carro.Portas(4);
		assertEquals(4, carro.getPortas());
	}
	
	@Test
	public void setarAno() throws Exception {
		carro.Ano(2009);
		assertEquals(2009, carro.getAno());
	}
}
