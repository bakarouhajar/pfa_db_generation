package com.example.terrain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.terrain.entities.Ville;
import com.example.terrain.service.VilleService;




@RestController
@RequestMapping("villes")
public class VilleController{
	@Autowired
	VilleService villeservice;
	
	// Récupération de toutes les villes
	@GetMapping("/api/villes")
	public List<Ville> findAll(){
		return villeservice.findAll();
	}
	
	@PostMapping("/save")
	public Ville save(@RequestBody Ville ville){
		return villeservice.save(ville);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
	//Ville ville = villeservice.findById(Integer.parseInt(id));
	villeservice.delete(id);
	}
	
	@GetMapping("/findById/{id}")
	public Ville findById(@PathVariable int id) {
		return villeservice.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public Ville update(@PathVariable int id,@RequestBody Ville ville) {
		Ville villes = villeservice.findById(id);
		if(villes != null) {
			villes.setNom(ville.getNom());
			return villeservice.save(villes);
		}
		return null;
	}
	

}
