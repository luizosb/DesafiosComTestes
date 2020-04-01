package br.com.gft.model;

import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livros> livros;
	private List<VideoGame> videogames;
	
	public Loja() {
		
	}
	
	public Loja(String nome, String cnpj, List<Livros> Livros, List<VideoGame> VideoGame) {
		this.cnpj = cnpj;
		this.livros = Livros;
		this.nome = nome;
		this.videogames = VideoGame;
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livros> getLivros() {
		return livros;
	}

	public void setLivros(List<Livros> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videogames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videogames = videoGames;
	}
	
	public void listaLivros() {
		if (livros.size()==0) {
			System.out.println("A loja n�o tem livros");
		} else {
			System.out.println("A loja Americanas possui estes livros para a venda: ");
		for ( int i = 0; i < livros.size(); ++i) {
			System.out.println("Titulo: " + livros.get(i).getNome() + ", pre�o: " + livros.get(i).getPreco() + ", quantidade: " + livros.get(i).getQtd()+" em estoque."); 
		}  
		}
	}
		
	public void listaVideoGame() {
		if (videogames.size()==0) {
			System.out.println("A loja n�o tem videogames.");
		} else {
			System.out.println("A loja Americanas possui estes video-games para a venda: ");
		for ( int i = 0; i < videogames.size(); ++i) {
			System.out.println("Video-game: " + videogames.get(i).getNome() + ", pre�o: " + videogames.get(i).getPreco() + ", quantidade: " + videogames.get(i).getQtd()+" em estoque."); 
		}
		}
	}
	
	public void calculaPatrimonio() {
		double x = 0;
		double y = 0;
		for ( int i = 0; i < videogames.size(); ++i) {
			x += (videogames.get(i).getPreco()*videogames.get(i).getQtd());
		}
		for ( int i = 0; i < livros.size(); ++i) {
			y += (livros.get(i).getPreco()*livros.get(i).getQtd());
		}
		System.out.println("O patrimônio da loja Americanas � de " + (x + y));
	}
	
	public double calculaPatrimonioTeste() {
		double x = 0;
		double y = 0;
		for ( int i = 0; i < videogames.size(); ++i) {
			x += (videogames.get(i).getPreco()*videogames.get(i).getQtd());
		}
		for ( int i = 0; i < livros.size(); ++i) {
			y += (livros.get(i).getPreco()*livros.get(i).getQtd());
		}
		double w = (x+y);
		return w;
	}
	
	
	
	
}
