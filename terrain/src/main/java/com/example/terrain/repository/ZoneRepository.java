package com.example.terrain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.terrain.entities.Ville;
import com.example.terrain.entities.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer>  {
	Zone findById(int id);
	List<Zone> findByVille(Ville ville);
	
	Zone findByNomAndVilleNom(String zone, String ville);
}
