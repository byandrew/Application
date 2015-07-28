package br.com.rest.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.rest.model.Banda;
import br.com.rest.model.Musica;

public enum MusicaDao {
	instance;

	private Map<String, Musica> musicas = new HashMap<String, Musica>();

	private MusicaDao() {

		Musica musica = new Musica("1", "T.N.T.", "Rock", "AC/DC", "Demo");
		musicas.put("1", musica);
		musica = new Musica("2", "Byob.", "Metal", "SOAD", "crazy");
		musicas.put("2", musica);
		musica = new Musica("3", "NUMB", "New metal", "Linkin park", "Peace");
		musicas.put("3", musica);

	}
	
	public Map<String, Musica> getMusicas(){
		return musicas;
	}

}
