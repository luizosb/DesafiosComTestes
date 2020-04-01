package br.com.gft.interfaces;

import br.com.gft.model.Loja;

public interface Imposto {
	
	public abstract double calculaPatrimonio();
	
	public void executar(Loja loja);
}	
