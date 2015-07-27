package br.com.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Banda {
	
	private String id;
	private String nomeBanda;
	private int anoFormacao;
	
	public Banda(){
		
	}
	
	
	public Banda (String id, String nomeBanda, int anoFormacao){
		super();
		this.id = id;
		this.nomeBanda = nomeBanda;
		this.anoFormacao = anoFormacao;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public int getAnoDeFormacao() {
		return anoFormacao;
	}

	public void setAnoDeFormacao(int anoFormacao) {
		this.anoFormacao = anoFormacao;
	}
}
