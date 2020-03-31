package veiculo.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import veiculo.model.Aviao;

public class AviaoTeste {
	
	private Aviao aviao;
	
	@Before
	public void setup(){
		aviao = new Aviao("marca","modelo","placa", "cor", 0.000, false, 0, 0, 0.0, "pais", "classe");
		System.out.println("=====================TESTE======================");
	}
	
	@AfterClass
	public static void fim() {
		System.out.println("=====================FIM DOS TESTE======================");
	} 
	
	@Test
	public void abastecer() throws Exception {
		System.out.println("-------------Abastecer----------------");
		aviao.Abastecer("300");
		assertEquals(300, aviao.getLitrosCombustivel());
	}
	
	@Test
	public void tentarAbastecerMaisQueOLimite() throws Exception {
		System.out.println("--------------Abastecer acima do limite------------------");
		aviao.Abastecer("600");
		assertEquals(400, aviao.getLitrosCombustivel());
	}
	
	@Test
	public void naoLigarQuandoEstiverSemGasolina() throws Exception {
		System.out.println("------------Nao Ligar Quando Estiver Sem Gasolina------------------");
		aviao.Ligar();
		assertEquals(false, aviao.getisLigado());
	}
	
	@Test
	public void ligarApenasSeTiverAbastecido() throws Exception {
		System.out.println("------------Ligar apenas se tiver abastecido--------------------");
		aviao.Abastecer("200");
		aviao.Ligar();
		assertEquals(true, aviao.getisLigado());
	}
	
	
	@Test
	public void acelerar() throws Exception {
		System.out.println("--------------Acelerar----------------");
		aviao.Abastecer("100");
		aviao.Ligar();
		aviao.Acelerar();
		assertEquals(150, aviao.getVelocidade());
	}
	
	@Test
	public void naoAcelerarSemEstarLigadoESemGasolina() throws Exception {
		System.out.println("--------------Não acelerar se estiver desligado e sem gasolina------------");
		aviao.Acelerar();
		assertEquals(0, aviao.getVelocidade());
	}
	
	@Test
	public void naoAcelerarSeEstiverDesligado() throws Exception {
		System.out.println("----------------Não acelerar se estiver desligado----------------------");
		aviao.Abastecer("200");
		aviao.Acelerar();
		assertEquals(0, aviao.getVelocidade());
	}
	
	@Test
	public void frearSeAVelocidadeEstiverAcimaDeZero() throws Exception {
		System.out.println("-------------Frear se a velocidade estiver acima de zero -------------");
		aviao.Abastecer("200");
		aviao.Ligar();
		aviao.Acelerar();
		aviao.Frear();
		assertEquals(100, aviao.getVelocidade());
	}
	
	@Test
	public void naoFrearSeAVelocidadeEstiverZero() throws Exception {
		System.out.println("----------------Não frear se a velocidade estiver zero---------------");
		aviao.Abastecer("100");
		aviao.Ligar();
		aviao.Frear();
		assertEquals(0, aviao.getVelocidade());
	}
	
	@Test
	public void naoFrearSeEstiverDesligado() throws Exception {
		System.out.println("----------------Não frear se estiver desligado---------------------");
		aviao.Abastecer("200");
		aviao.Frear();
		assertEquals(0, aviao.getVelocidade());
	}
	
	@Test
	public void frearAteAVelocidadeChegarAZeroNaoSerNegativo() throws Exception {
		System.out.println("------------Frear até a velocidade chegar a zero, não ser negativo----------------");
		aviao.Abastecer("300");
		aviao.Ligar();
		aviao.Acelerar();
		aviao.Frear();
		aviao.Frear();
		aviao.Frear();
		aviao.Frear();
		assertEquals(0, aviao.getVelocidade());
	}
	
	
	@Test
	public void desligarQuandoOCarroEstiverParado() throws Exception {
		System.out.println("-----------------------Desligar corretamente o carro------------------------");
		aviao.Abastecer("100");
		aviao.Ligar();
		aviao.Acelerar();
		aviao.Frear();
		aviao.Frear();
		aviao.Frear();
		aviao.Desligar();
		assertEquals(false, aviao.getisLigado());
	}
	
	@Test
	public void naoDesligarSeEstiverOCarroEmMovimento() throws Exception {
		System.out.println("--------------------Desligar apenas se estiver o carro estiver com velocidade zero-------------------");
		aviao.Abastecer("100");
		aviao.Ligar();
		aviao.Acelerar();
		aviao.Frear();
		aviao.Frear();
		aviao.Desligar();
		assertEquals(true, aviao.getisLigado());
	}
	
	@Test
	public void pintar() throws Exception {
		System.out.println("----------------------Pintar--------------------");
		aviao.Pintar("Azul");
		assertEquals("azul", aviao.getCor());
	}
	
	@Test
	public void setarClasse() throws Exception {
		System.out.println("-----------------------Setar classe-------------------");
		aviao.setarClasseDoAviao("Particular");
		assertEquals("particular", aviao.getClasse());
	}
	
	@Test
	public void setarPaisDeOrigem() throws Exception {
		System.out.println("-------------------Setar país de origem----------------------");
		aviao.setarPaisDeOrigem("brasil");
		assertEquals("Brasil", aviao.getPaisOrigem());
	}

}
