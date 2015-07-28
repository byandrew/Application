package br.com.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.rest.dao.MusicaDao;
import br.com.rest.model.Musica;

public class MusicaService {

	MusicaDao musicaDao;
	
	public MusicaService (){
		musicaDao = MusicaDao.instance;
	}
	
	public void createMusica(Musica musica) {
		musicaDao.getMusicas().put(musica.getId(), musica);
	}
	
	public Musica getMusica(String id) {
		return musicaDao.getMusicas().get(id);
	}
	
	public Map<String, Musica> getMusicas() {
		return musicaDao.getMusicas();
	}
	
	public List<Musica> getMusicaAsList() {
		List<Musica> musicaList = new ArrayList<Musica>();
		musicaList.addAll(musicaDao.getMusicas().values());
		return musicaList;
	}
	
	public int getMusicasCount() {
		return musicaDao.getMusicas().size();
	}
	
	public void deleteMusica(String id) {
		musicaDao.getMusicas().remove(id);
	}
	
}
