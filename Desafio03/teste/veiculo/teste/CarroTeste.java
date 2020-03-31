package veiculo.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import veiculo.model.Carro;

public class CarroTeste {
	
	private Carro carro;
	
	@Before
	public void setup(){
		carro = new Carro("marca","modelo","placa", "cor", 0.000, false, 0, 0, 0.0, 0, 0);
		System.out.println("=====================TESTE======================");
	}
	
	@AfterClass
	public static void fim() {
		System.out.println("=====================FIM DOS TESTE======================");
	} 
	
	@Test
	public void abastecer() throws Exception {
		System.out.println("-------------Abastecer----------------");
		carro.Abastecer("30");
		assertEquals(30, carro.getLitrosCombustivel());
	}
	
	@Test
	public void tentarAbastecerMaisQueOLimite() throws Exception {
		System.out.println("--------------Abastecer acima do limite------------------");
		carro.Abastecer("600");
		assertEquals(45, carro.getLitrosCombustivel());
	}
	
	@Test
	public void naoLigarQuandoEstiverSemGasolina() throws Exception {
		System.out.println("------------Nao Ligar Quando Estiver Sem Gasolina------------------");
		carro.Ligar();
		assertEquals(false, carro.getisLigado());
	}
	
	@Test
	public void ligarApenasSeTiverAbastecido() throws Exception {
		System.out.println("------------Ligar apenas se tiver abastecido--------------------");
		carro.Abastecer("40");
		carro.Ligar();
		assertEquals(true, carro.getisLigado());
	}
	
	
	@Test
	public void acelerar() throws Exception {
		System.out.println("--------------Acelerar----------------");
		carro.Abastecer("45");
		carro.Ligar();
		carro.Acelerar();
		assertEquals(20, carro.getVelocidade());
	}
	
	@Test
	public void naoAcelerarSemEstarLigadoESemGasolina() throws Exception {
		System.out.println("--------------Não acelerar se estiver desligado e sem gasolina------------");
		carro.Acelerar();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void naoAcelerarSeEstiverDesligado() throws Exception {
		System.out.println("----------------Não acelerar se estiver desligado----------------------");
		carro.Abastecer("40");
		carro.Acelerar();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void frearSeAVelocidadeEstiverAcimaDeZero() throws Exception {
		System.out.println("-------------Frear se a velocidade estiver acima de zero -------------");
		carro.Abastecer("40");
		carro.Ligar();
		carro.Acelerar();
		carro.Frear();
		assertEquals(10, carro.getVelocidade());
	}
	
	@Test
	public void naoFrearSeAVelocidadeEstiverZero() throws Exception {
		System.out.println("----------------Não frear se a velocidade estiver zero---------------");
		carro.Abastecer("40");
		carro.Ligar();
		carro.Frear();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void naoFrearSeEstiverDesligado() throws Exception {
		System.out.println("----------------Não frear se estiver desligado---------------------");
		carro.Abastecer("40");
		carro.Frear();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void frearAteAVelocidadeChegarAZeroNaoSerNegativo() throws Exception {
		System.out.println("------------Frear até a velocidade chegar a zero, não ser negativo----------------");
		carro.Abastecer("40");
		carro.Ligar();
		carro.Acelerar();
		carro.Frear();
		carro.Frear();
		carro.Frear();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void pintar() throws Exception {
		System.out.println("----------------------Pintar--------------------");
		carro.Pintar("Azul");
		assertEquals("azul", carro.getCor());
	}
	
	@Test
	public void desligarQuandoOCarroEstiverParado() throws Exception {
		System.out.println("-----------------------Desligar corretamente o carro------------------------");
		carro.Abastecer("40");
		carro.Ligar();
		carro.Acelerar();
		carro.Frear();
		carro.Frear();
		carro.Desligar();
		assertEquals(false, carro.getisLigado());
	}
	
	@Test
	public void naoDesligarSeEstiverOCarroEmMovimento() throws Exception {
		System.out.println("--------------------Desligar apenas se estiver o carro estiver com velocidade zero-------------------");
		carro.Abastecer("100");
		carro.Ligar();
		carro.Acelerar();
		carro.Frear();
		carro.Desligar();
		assertEquals(true, carro.getisLigado());
	}
	
	@Test
	public void setarQuantidadeDePortas() throws Exception {
		System.out.println("------------------Setar quantidade de portas-----------------");
		carro.setarPortas(4);
		assertEquals(4, carro.getPortas());
	}
	
	@Test
	public void setarAnoDeFabricacao() throws Exception {
		System.out.println("-----------------Ano de fabricacao-----------------------");
		carro.setarAnoDeFabricacao(2016);
		assertEquals(2016, carro.getAno());
	}

}
