package veiculo.model;

public class Veiculo {
	
	private String Modelo;
	private double Velocidade;
	private int Passageiros;			
	private double Combustivel;
	
	public Veiculo(String Modelo, float Velocidade,int Passageiros, double Combustivel) {
		this.setModelo(Modelo);
		this.setVelocidade(Velocidade);
		this.setPassageiros(Passageiros);
		this.setCombustivel(Combustivel);
	}

	public void Modelo(String Modelo){
		this.setModelo(Modelo);
	}
	
	public void Velocidade(double Velocidade) {
		this.setVelocidade(Velocidade);
	}
	
	
	public void Passageiros(int Passageiros) {
		this.setPassageiros(Passageiros);
	}
	
	public void Combustivel(double Combustivel){
		this.setCombustivel(Combustivel);
	}
	
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public double getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(double Velocidade) {
		this.Velocidade = Velocidade;
	}

	public int getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(int Passageiros) {
		this.Passageiros = Passageiros;
	}

	public double getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(double Combustivel) {
		this.Combustivel = Combustivel;
	}
			
}