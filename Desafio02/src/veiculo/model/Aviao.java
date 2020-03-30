package veiculo.model;

public class Aviao extends Veiculo {
	
	private String Tipo;
	private String Uso;
	
	public Aviao(String Modelo, float Velocidade, int Passageiros, double Combustivel, String Uso, String Tipo) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Tipo = Tipo;
		this.Uso = Uso;
	}
	
	public void Uso(String Uso) {
		this.setUso(Uso);
	}
	
	public void Tipo(String Tipo) {
		this.setTipo(Tipo);
	}
			
	public String getUso() {
		return Uso;
	}


	public void setUso(String Uso) {
		this.Uso = Uso;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}
}
	
	
	
	

