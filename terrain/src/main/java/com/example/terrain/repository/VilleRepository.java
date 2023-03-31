package com.example.terrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.terrain.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
	
    Ville findById(int id);
    
	Ville findByNom(String nom);
}
