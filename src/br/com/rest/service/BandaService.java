package br.com.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.rest.dao.BandaDao;
import br.com.rest.model.Banda;

public class BandaService {

	BandaDao bandaDao;
	
	public BandaService (){
		bandaDao = BandaDao.instance;
	}
	
	public void createBanda(Banda banda) {
		bandaDao.getBandas().put(banda.getId(), banda);
	}
	
	public Banda getBanda(String id) {
		return bandaDao.getBandas().get(id);
	}
	
	public Map<String, Banda> getBandas() {
		return bandaDao.getBandas();
	}
	
	public List<Banda> getBandaAsList() {
		List<Banda> bandaList = new ArrayList<Banda>();
		bandaList.addAll(bandaDao.getBandas().values());
		return bandaList;
	}
	
	public int getBandasCount() {
		return bandaDao.getBandas().size();
	}
	
	public void deleteBanda(String id) {
		bandaDao.getBandas().remove(id);
	}
	
}
