package veiculo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import veiculo.model.VeiculoObjeto;

public class VeiculoTeste {
	
	private static VeiculoObjeto veiculo;
		
	@Before
	public void setup() {
		veiculo = new VeiculoObjeto("Honda", "NSX", "ABC-1234", "Vermelho", (float) 0.0000, false, 0, 0, 0.0);
		System.out.println("------------Teste-----------");
		veiculo.Ligar();
	}
	
	@Test
	public void naoAcelerarQuandoEstiverSemGasolinaEDesligado() throws Exception {
		System.out.println("---------Nao Acelerar Quando Estiver Sem Gasolina E Desligado-----------");
		veiculo.Acelerar(10);
		assertEquals(0, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void naoAcelerarQuandoEstiverLigadoESemGasolina() throws Exception {
		System.out.println("--------Nao Acelerar Quando Estiver Ligado E Sem Gasolina----------");
		veiculo.Acelerar(10);
		assertEquals(0, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void naoAcelerarQuandoEstiverDesligadoEComGasolina() throws Exception {
		System.out.println("--------Nao Acelerar Quando Estiver Desligado E Com Gasolina----------");
		veiculo.Desligar();
		veiculo.Abastecer(20);
		veiculo.Acelerar(10);
		assertEquals(0, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void acelerarQuandoTiverComGasolinaELigado() throws Exception {
		System.out.println("---------Acelerar Quando Tiver Com Gasolina E Ligado---------");
		veiculo.Abastecer(20);
		veiculo.Acelerar(20);
		assertEquals(20, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void freiarComGasolinaELigado() throws Exception {
		System.out.println("-------Freiar Com Gasolina E Ligado--------");
		veiculo.Abastecer(20);
		veiculo.Acelerar(20);
		veiculo.Frear();
		assertEquals(10, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void naoFreiarSemGasolinaELigado() throws Exception {
		System.out.println("-------Nao Freiar Sem Gasolina E Ligado-----------");
		veiculo.Frear();
		assertEquals(0, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void naoFreiarComGasolinaEDesligado() throws Exception {
		System.out.println("-------Nao Freiar Com Gasolina E Desligado-----------");
		veiculo.Abastecer(20);
		veiculo.Frear();
		assertEquals(0, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void naoDesligarComOCarroEmMovimento() throws Exception {
		System.out.println("---------Nao Desligar Com O Carro Em Movimento-------------");
		veiculo.Abastecer(30);
		veiculo.Acelerar(40);
		veiculo.Desligar();
		assertEquals(40, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void desligarNormalmente() throws Exception {
		System.out.println("----------------Desligar Normalmente-------------");
		veiculo.Abastecer(20);
		veiculo.Acelerar(20);
		veiculo.Frear();
		veiculo.Desligar();
		veiculo.Frear();
		veiculo.Desligar();
		assertEquals(0, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void pintarOCarro() throws Exception {
		System.out.println("------------Mudar A Cor---------");
		veiculo.Pintar("Preto");
		assertEquals("Preto", veiculo.getCor());
	}

}
