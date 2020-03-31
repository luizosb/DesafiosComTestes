package veiculo.model;

public class Veiculo {
	
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private double Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private Double Preco;

	public Veiculo (String Marca,String Modelo,String Placa, String Cor,double Km,boolean isLigado,int litrosCombustivel, int Velocidade,Double Preco) {
		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setPlaca(Placa);
		this.setCor(Cor);
		this.setKm(Km);
		this.setLigado(isLigado);
		this.setLitrosCombustivel(litrosCombustivel);
		this.setVelocidade(Velocidade);
		this.setPreco(Preco);
	}


	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 20) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);
			System.out.println("A velocidade agora � de " + this.getVelocidade() + " km/h e resta apenas " + this.getLitrosCombustivel() + " litros de combust�vel.");
		} else if(this.getisLigado() == false) {
			System.out.println("N�o � possivel acelerar pois o ve�culo est� desligado.");
		} else {
			System.out.println("N�o h� combust�vel para acelerar.");
		}
	}
	
	public void Abastecer(String gasosa) {
		if( (this.getLitrosCombustivel() + Integer.parseInt(gasosa)) > 100) {
			System.out.println("N�o � possivel abastecer essa quantidade, apenas � poss�vel abastecer " + (100 - this.getLitrosCombustivel()) + " de combust�vel.");
			this.setLitrosCombustivel(100);
	} else {
			setLitrosCombustivel(this.getLitrosCombustivel() + Integer.parseInt(gasosa));
			System.out.println("Ve�culo abastecido com sucesso.");
	}
		System.out.println("O ve�culo possui agora " + this.getLitrosCombustivel() + " no tanque.");
	}
	
	public void Frear() {
		if (this.getisLigado() == true && this.getLitrosCombustivel() > 0 && this.getVelocidade() > 0 ) {
			this.setVelocidade(this.getVelocidade() - 30);
			System.out.println("A velocidade foi diminu�da em 30 km/h, ou seja, � de " + this.getVelocidade() + " km/h.");
		} else if (this.getisLigado() == false) {
			System.out.println("N�o � poss�vel frear pois est� desligado o ve�culo."); 
		} else if(this.getVelocidade() - 30 < 0) {
			this.setVelocidade(0);
			System.out.println("A velocidade agora � de 0 km/h. O ve�culo est� parado.");	
		}
	}
	
	public void Pintar(String Cor) {
			this.setCor(Cor.toLowerCase());
			System.out.println("Agora a cor do ve�culo é "+ this.getCor() +".");
	} 
	
	public void Ligar() {
		if(this.getisLigado() == false && this.getVelocidade() == 0 && this.getLitrosCombustivel() > 0) {
			this.setLigado(true);
			System.out.println("Agora o ve�culo est� ligado.");
		} else if(this.getLitrosCombustivel() == 0 && this.getisLigado() == false && this.getVelocidade() == 0) {
			System.out.println("Para ligar o ve�culo, necessita abastece-lo primeiro.");
		} else if(this.getisLigado() == true && this.getVelocidade() > 0 && this.getLitrosCombustivel() > 0) {
			System.out.println("O ve�culo j� esta ligado.");
		} 
	}
	
	public void Desligar() {
		if(this.getisLigado() == true && this.getVelocidade() == 0) {
			this.setLigado(false);
			System.out.println("O ve�culo foi desligado.");
		} else if(this.getisLigado() == false) {
			System.out.println("O ve�culo j� est� desligado.");
		} else {
			System.out.println("Para desligar, pare o ve�culo primeiro.");
		}
	}
		


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public String getCor() {
		return Cor;
	}


	public void setCor(String cor) {
		Cor = cor;
	}


	public double getKm() {
		return Km;
	}


	public void setKm(double km) {
		Km = km;
	}


	public boolean getisLigado() {
		return isLigado;
	}


	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}


	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}


	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}


	public int getVelocidade() {
		return Velocidade;
	}


	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}


	public Double getPreco() {
		return Preco;
	}


	public void setPreco(Double preco) {
		Preco = preco;
	}

	
}
	