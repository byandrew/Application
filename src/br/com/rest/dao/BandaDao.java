package br.com.rest.dao;

import java.util.HashMap;
import java.util.Map;


import br.com.rest.model.Banda;

public enum BandaDao {
	instance;

	private Map<String, Banda> bandas = new HashMap<String, Banda>();

	private BandaDao() {

		Banda banda = new Banda("1", "System of a down", 1996);
		bandas.put("1", banda);
		banda = new Banda("2", "Slipknot", 2000);
		bandas.put("2", banda);
		banda = new Banda("3", "AC/DC", 1984);
		bandas.put("3", banda);

	}
	
	public Map<String, Banda> getBandas(){
		return bandas;
	}

}
