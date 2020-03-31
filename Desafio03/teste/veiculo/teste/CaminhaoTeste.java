package veiculo.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import veiculo.model.Caminhao;

public class CaminhaoTeste {
	
	private Caminhao caminhao;
	
	@Before
	public void setup(){
		caminhao = new Caminhao("marca","modelo","placa", "cor", 0.000, false, 0, 0, 0.0, 0.0, "carga");
		System.out.println("=====================TESTE======================");
	}
	
	@AfterClass
	public static void fim() {
		System.out.println("=====================FIM DOS TESTE======================");
	} 
	
	@Test
	public void abastecer() throws Exception {
		System.out.println("-------------Abastecer----------------");
		caminhao.Abastecer("40");
		assertEquals(40, caminhao.getLitrosCombustivel());
	}
	
	@Test
	public void tentarAbastecerMaisQueOLimite() throws Exception {
		System.out.println("--------------Abastecer acima do limite------------------");
		caminhao.Abastecer("600");
		assertEquals(200, caminhao.getLitrosCombustivel());
	}
	
	@Test
	public void naoLigarQuandoEstiverSemGasolina() throws Exception {
		System.out.println("------------Nao Ligar Quando Estiver Sem Gasolina------------------");
		caminhao.Ligar();
		assertEquals(false, caminhao.getisLigado());
	}
	
	@Test
	public void ligarApenasSeTiverAbastecido() throws Exception {
		System.out.println("------------Ligar apenas se tiver abastecido--------------------");
		caminhao.Abastecer("40");
		caminhao.Ligar();
		assertEquals(true, caminhao.getisLigado());
	}
	
	
	@Test
	public void acelerar() throws Exception {
		System.out.println("--------------Acelerar----------------");
		caminhao.Abastecer("45");
		caminhao.Ligar();
		caminhao.Acelerar();
		assertEquals(70, caminhao.getVelocidade());
	}
	
	@Test
	public void naoAcelerarSemEstarLigadoESemGasolina() throws Exception {
		System.out.println("--------------Não acelerar se estiver desligado e sem gasolina------------");
		caminhao.Acelerar();
		assertEquals(0, caminhao.getVelocidade());
	}
	
	@Test
	public void naoAcelerarSeEstiverDesligado() throws Exception {
		System.out.println("----------------Não acelerar se estiver desligado----------------------");
		caminhao.Abastecer("40");
		caminhao.Acelerar();
		assertEquals(0, caminhao.getVelocidade());
	}
	
	@Test
	public void frearSeAVelocidadeEstiverAcimaDeZero() throws Exception {
		System.out.println("-------------Frear se a velocidade estiver acima de zero -------------");
		caminhao.Abastecer("40");
		caminhao.Ligar();
		caminhao.Acelerar();
		caminhao.Frear();
		assertEquals(30, caminhao.getVelocidade());
	}
	
	@Test
	public void naoFrearSeAVelocidadeEstiverZero() throws Exception {
		System.out.println("----------------Não frear se a velocidade estiver zero---------------");
		caminhao.Abastecer("40");
		caminhao.Ligar();
		caminhao.Frear();
		assertEquals(0, caminhao.getVelocidade());
	}
	
	@Test
	public void naoFrearSeEstiverDesligado() throws Exception {
		System.out.println("----------------Não frear se estiver desligado---------------------");
		caminhao.Abastecer("40");
		caminhao.Frear();
		assertEquals(0, caminhao.getVelocidade());
	}
	
	@Test
	public void frearAteAVelocidadeChegarAZeroNaoSerNegativo() throws Exception {
		System.out.println("------------Frear até a velocidade chegar a zero, não ser negativo----------------");
		caminhao.Abastecer("40");
		caminhao.Ligar();
		caminhao.Acelerar();
		caminhao.Frear();
		caminhao.Frear();
		caminhao.Frear();
		assertEquals(0, caminhao.getVelocidade());
	}
	
	@Test
	public void pintar() throws Exception {
		System.out.println("----------------------Pintar--------------------");
		caminhao.Pintar("Azul");
		assertEquals("azul", caminhao.getCor());
	}
	
	@Test
	public void desligarQuandoOCaminhaoEstiverParado() throws Exception {
		System.out.println("-----------------------Desligar corretamente o caminhao------------------------");
		caminhao.Abastecer("80");
		caminhao.Ligar();
		caminhao.Acelerar();
		caminhao.Frear();
		caminhao.Frear();
		caminhao.Frear();
		caminhao.Desligar();
		assertEquals(false, caminhao.getisLigado());
	}
	
	@Test
	public void naoDesligarSeEstiverOCaminhaoEmMovimento() throws Exception {
		System.out.println("--------------------Desligar apenas se estiver o caminhao estiver com velocidade zero-------------------");
		caminhao.Abastecer("100");
		caminhao.Ligar();
		caminhao.Acelerar();
		caminhao.Frear();
		caminhao.Desligar();
		assertEquals(true, caminhao.getisLigado());
	}
	
	@Test
	public void setarComprimento() throws Exception {
		System.out.println("---------------------Setar comprimento------------------------");
		caminhao.colocarComprimento(82.2);
		assertEquals(82.2, caminhao.getComprimento(), 0.0001);
	}

	@Test
	public void setarACarga() throws Exception {
		System.out.println("------------------------Setar a carga -----------------------");
		caminhao.colocarACarga("Doritos");
		assertEquals("doritos", caminhao.getCarga());
	}

}
