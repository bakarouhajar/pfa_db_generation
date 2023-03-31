package com.example.terrain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.terrain.Dao.IDao;
import com.example.terrain.entities.Ville;
import com.example.terrain.entities.Zone;
import com.example.terrain.repository.VilleRepository;
import com.example.terrain.repository.ZoneRepository;


@Service
public class ZoneService implements IDao<Zone>{
	@Autowired
	private ZoneRepository zonerepository;
	@Autowired 
	private VilleRepository villerepository;
    
	
	public List<Zone> findByVille(String ville){
		Ville villes = villerepository.findByNom(ville);
		return zonerepository.findByVille(villes);
	}
	@Override
	public Zone findById(int id){
		return zonerepository.findById(id);
	}

	@Override
	public List<Zone> findAll() {
		return zonerepository.findAll();
	}

	@Override
	public Zone update(int id,Zone o) {
		Zone zone = zonerepository.findById(id);
		zone.setNom(o.getNom());
		zone.setVille(o.getVille());
		return zonerepository.save(zone);
	}

	@Override
	public void delete(int id) {
		Zone zone = zonerepository.findById(id);
		zonerepository.delete(zone);
	}

	@Override
	public Zone save(Zone o) {
		return zonerepository.save(o);
	}
}
