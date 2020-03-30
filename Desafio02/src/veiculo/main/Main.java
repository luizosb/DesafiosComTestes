package veiculo.main;

import veiculo.model.Aviao;
import veiculo.model.Carro;
import veiculo.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		    Veiculo v = new Veiculo(null, 0, 0, 0);		
			Carro c = new Carro(null, 0, 0, 0, null, 0, 0);
			Aviao a = new Aviao(null, 0, 0, 0, null, null);
			
			v.setCombustivel(0);
			v.setModelo(null);
			v.setPassageiros(0);
			v.setVelocidade(0);
			
			c.setPortas(0);
			c.setAno(0);
			c.setMarca(null);
			
			a.setUso("Particular");
			a.setTipo(null);
			
			
			System.out.println(a.getCombustivel());
			
			
			
			
		}
	

}
