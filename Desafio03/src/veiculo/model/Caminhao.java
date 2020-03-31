package veiculo.model;

public class Caminhao extends Veiculo {
	private String Carga;
	private double Comprimento;

	public Caminhao(String Marca, String Modelo, String Placa, String Cor, double Km, boolean isLigado,
			int litrosCombustivel, int Velocidade, Double Preco, double Comprimento, String Carga) {
		super(Marca, Modelo, Placa, Cor, Km, isLigado, litrosCombustivel, Velocidade, Preco);
		this.Comprimento = Comprimento;
		this.Carga = Carga;
	}

	@Override
	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 70) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 15);
			System.out.println("A velocidade agora � de " + this.getVelocidade() + " km/h e resta apenas "
			+ this.getLitrosCombustivel() + " litros de diesel.");
		} else if(this.getisLigado() == false) {
			System.out.println("N�o � possivel acelerar pois o caminh�o est� desligado.");
		} else {
			System.out.println("N�o h� diesel para acelerar.");
		}
	}
	
	@Override
	public void Abastecer (String gasosa) {
		int gas = Integer.parseInt(gasosa);
		if( (this.getLitrosCombustivel() + (gas)) > 200) {
			System.out.println("N�o � possivel abastecer essa quantidade, apenas � poss�vel abastecer " + (200 - this.getLitrosCombustivel()) + " de diesel.");
			this.setLitrosCombustivel(200);
	} else {
			this.setLitrosCombustivel(this.getLitrosCombustivel() + gas);
			System.out.println("Caminh�o abastecido com sucesso.");
	}
		System.out.println("O caminh�o possui agora " + this.getLitrosCombustivel() + " litros de diesel no tanque.");
	}
	
	@Override
	public void Frear() {
		if (this.getisLigado() == true && this.getLitrosCombustivel() > 0 && this.getVelocidade() > 0 ) {
			this.setVelocidade(this.getVelocidade() - 40);
			System.out.println("A velocidade foi diminu�da em 40 km/h, ou seja, � de " + this.getVelocidade() + " km/h.");
		} else if (this.getisLigado() == false) {
			System.out.println("N�o � poss�vel frear pois est� desligado o ve�culo."); 
		} else if(this.getVelocidade() - 40 < 0) {
			this.setVelocidade(0);
			System.out.println("A velocidade agora � de 0 km/h. O ve�culo est� parado.");	
		}
	}
	
	public void colocarACarga(String carga) {
		this.setCarga(carga.toLowerCase());
		System.out.println("A carga do caminhão é " + this.getCarga());
	}
	
	public void colocarComprimento(double comprimento) {
		this.setComprimento(comprimento);
		System.out.println("O comprimento do caminhão é de " + comprimento);
	}
	
	public String getCarga() {
		return Carga;
	}

	public void setCarga(String carga) {
		Carga = carga;
	}

	public double getComprimento() {
		return Comprimento;
	}

	public void setComprimento(double comprimento) {
		Comprimento = comprimento;
	}

}
