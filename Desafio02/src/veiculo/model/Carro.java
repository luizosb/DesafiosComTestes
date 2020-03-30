package veiculo.model;

public class Carro extends Veiculo {
	
	private String Marca;
	private int Portas;
	private int Ano;
	
		
	
	public Carro(String Modelo, float Velocidade, int Passageiros, double Combustivel, String Marca, int Portas, int Ano) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Marca = Marca;
		this.Portas = Portas;
		this.Ano = Ano;
		
	}

	public void Marca(String Marca) {
		this.setMarca(Marca);
	}
	
	public void Portas(int Portas) {
		this.setPortas(Portas);
	}
	
	public void Ano(int Ano) {
		this.setAno(Ano);
	}

	public String getMarca() {
		return Marca;
	}


	public void setMarca(String Marca) {
		this.Marca = Marca;
	}


	public int getPortas() {
		return Portas;
	}


	public void setPortas(int Portas) {
		this.Portas = Portas;
	}


	public int getAno() {
		return Ano;
	}


	public void setAno(int Ano) {
		this.Ano = Ano;
	}

	
	
	}


