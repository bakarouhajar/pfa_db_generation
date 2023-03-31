package com.example.terrain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.terrain.Dao.IDao;
import com.example.terrain.entities.Ville;
import com.example.terrain.entities.Zone;
import com.example.terrain.repository.VilleRepository;


@Service
public class VilleService implements IDao<Ville>{
	
	@Autowired 
	private VilleRepository villerepository;
	
	@Override
	public List<Ville> findAll() {
		return villerepository.findAll();
	}
	
	@Override
	public Ville update(int id,Ville o) {
		Ville ville = villerepository.findById(id);
		ville.setNom(o.getNom());
		return villerepository.save(ville);
	}

	@Override
	public void delete(int id) {
		Ville ville = villerepository.findById(id);
		villerepository.delete(ville);
	}

	@Override
	public Ville save(Ville o) {
		return villerepository.save(o);
	}

	@Override
	public Ville findById(int id) {
		return villerepository.findById(id);
	}

	
}
