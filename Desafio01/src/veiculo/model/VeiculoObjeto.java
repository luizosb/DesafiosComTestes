package veiculo.model;

public class  VeiculoObjeto {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private Float Km;
	private Boolean isLigado;
	private Integer litrosCombustivel;
	private Integer Velocidade;
	private Double Preco;
	
	//M�todos personalizados
	
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Kilometragem: " + this.getKm());
		System.out.println("Est� ligado: " + this.getIsLigado());
		System.out.println("Combustivel: " + this.getLitrosCombustivel());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Preço: " + this.getPreco());
		
		
	}
	
	public void Acelerar(int v) {
		if (this.getIsLigado()==true && this.litrosCombustivel > 0) {
			this.setVelocidade(this.getVelocidade()+ v);
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);
			System.out.println("O carro est� agora a " + this.getVelocidade() + ", com "+ this.getLitrosCombustivel() +" Litros de gasolina.");
		} else {
			System.out.println("O carro está desligado, não é possivel acelerar; ou está sem gasolina.");
		}
	}
	
	public void Abastecer(int gasosa) {
		if ( 100 < (this.getLitrosCombustivel() + gasosa)) {
			System.out.println("N�o � possivel abastecer esta quantidade, apenas � possivel abastecer " + (100 - this.getLitrosCombustivel()) + " litros.");
			this.setLitrosCombustivel(100);
		} else {
			setLitrosCombustivel(this.getLitrosCombustivel() + gasosa);
			System.out.println("Carro abastecido com sucesso.");
		}
	}
	
	public void Frear()
	{
		if (this.getIsLigado()==true && this.getVelocidade() > 0) 
		{
			if(this.getVelocidade() < 10)
				this.setVelocidade(0);
			else
				this.setVelocidade(this.getVelocidade() - 10);
			
			System.out.println("A velocidade do carro foi para " + this.getVelocidade());
		}
		else if(this.getIsLigado() == false)
		{
			System.out.println("O carro está desligado, não é possivel freiar.");
		}
		else
		{
			System.out.println("A velocidade ja esta em 0 km/H");
		}
		
		
	}
	
	public void Pintar(String cor) {
		this.setCor(cor);
		System.out.println("A cor agora do carro � " + this.getCor());
	}
	
	public void Ligar() {
		if (this.getVelocidade()>0) {
			this.setisLigado(true);
			System.out.println("O carro j� est� ligado.");
		} else {
			this.setisLigado(true);
			System.out.println("Agora o carro est� ligado.");
		} 
	}
	
	public void Desligar() {
		if (this.getIsLigado()==true && this.getVelocidade()==0 ) {
			this.setisLigado(false);
			System.out.println("Agora o carro est� desligado.");
		} else if(this.getIsLigado()==true && this.getVelocidade()>0){
			System.out.println("Não é possível desligar o carro pois ele está em movimento.");
		} else {
			System.out.println("O carro j� est� desligado.");
		}
	}
		
	//Metodos especiais
	
	public VeiculoObjeto(String Marca, String Modelo, String Placa, String Cor, Float Km, Boolean isLigado, Integer litrosCombustivel, Integer Velocidade, Double Preco) {

		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setPlaca(Placa);
		this.setCor(Cor);
		this.setKm(Km);
		this.setisLigado(isLigado);
		this.setLitrosCombustivel(litrosCombustivel);
		this.setVelocidade(Velocidade);
		this.setPreco(Preco);
					
	}
	
		
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
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
	
	public Float getKm() {
		return Km;
	}
	public void setKm(Float km) {
		Km = km;
	}
	
	public Boolean getIsLigado() {
		return isLigado;
	}
	public void setisLigado(Boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	public Integer getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(Integer litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	
	public Integer getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		Velocidade = velocidade;
	}
	
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	
	
}
	

 


		

	
