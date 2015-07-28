package br.com.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Musica {
	
	private String id;
	private String nomeMusica;
	private String tipoMusica;
	private String autor;
	private String album;
	
	public Musica(){
		
	}
	
	
	public Musica (String id, String nomeMusica, String tipoMusica, String autor, String album){
		super();
		this.id = id;
		this.nomeMusica = nomeMusica;
		this.tipoMusica = tipoMusica;
		this.autor = autor;
		this.autor = album;
		
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNomeMusica() {
		return nomeMusica;
	}


	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}


	public String getTipoMusica() {
		return tipoMusica;
	}


	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}	

	
}
