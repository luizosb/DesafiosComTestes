package veiculo.model;

public class Carro extends Veiculo {

	private int Portas;
	private int Ano;	
	
	public Carro(String Marca, String Modelo, String Placa, String Cor, double Km, boolean isLigado,
			int litrosCombustivel, int Velocidade, Double Preco, int Portas, int Ano) {
		super(Marca, Modelo, Placa, Cor, Km, isLigado, litrosCombustivel, Velocidade, Preco);
		this.Portas = Portas;
		this.Ano = Ano;		
	}
	
	@Override
	public void Acelerar() {
		if (this.getisLigado()==true && this.getLitrosCombustivel() >= 0) {
			this.setVelocidade(this.getVelocidade() + 20) ;
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 10);
			System.out.println("A velocidade agora � de " + this.getVelocidade() + " km/h e resta apenas " + this.getLitrosCombustivel() + " litros de gasolina.");
		} else if(this.getisLigado() == false) {
			System.out.println("N�o � possivel acelerar pois o carro est� desligado.");
		} else {
			System.out.println("N�o h� gasolina para acelerar.");
		}
	}
	
	@Override
	public void Abastecer(String gasosa) {
		if( (this.getLitrosCombustivel() + Integer.parseInt(gasosa)) > 45) {
			System.out.println("N�o � possivel abastecer essa quantidade, apenas � poss�vel abastecer " + (45 - this.getLitrosCombustivel()) + " de gasolina.");	
			this.setLitrosCombustivel(45);
	} else {
			setLitrosCombustivel(this.getLitrosCombustivel() + Integer.parseInt(gasosa));
			System.out.println("Carro abastecido com sucesso.");
	}
		System.out.println("O carro possui agora " + this.getLitrosCombustivel() + " litros de gasolina no tanque.");
	}
	
	@Override
	public void Frear() {
		if (this.getisLigado() == true && this.getLitrosCombustivel() > 0 && this.getVelocidade() > 0 ) {
			this.setVelocidade(this.getVelocidade() - 10);
			System.out.println("A velocidade foi diminu�da em 10 km/h, ou seja, � de " + this.getVelocidade() + " km/h.");
		} else if (this.getisLigado() == false) {
			System.out.println("N�o � poss�vel frear pois est� desligado o ve�culo."); 
		} else if(this.getVelocidade() - 10 < 0) {
			this.setVelocidade(0);
			System.out.println("A velocidade agora � de 0 km/h. O ve�culo est� parado.");	
		}
	}
	
	public void setarPortas(int portas) {
		this.setPortas(portas);
		System.out.println("O carro possui " + portas + " portas.");
	}
	
	public void setarAnoDeFabricacao(int ano) {
		this.setAno(ano);
		System.out.println("O carro é do ano " + ano + ".");
	}
		
	public int getPortas() {
		return Portas;
	}

	public void setPortas(int portas) {
		Portas = portas;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

}
