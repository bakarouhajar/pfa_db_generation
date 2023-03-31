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
import com.example.terrain.entities.Zone;
import com.example.terrain.service.VilleService;
import com.example.terrain.service.ZoneService;




@RestController
@RequestMapping("/api/zones")
public class ZoneController {
	@Autowired
	private ZoneService zoneservice;
	@Autowired 
	private VilleService villeservice;
	
	
	//Récupération de toutes les zones pour une ville donnée
	@GetMapping("/zones/{ville}")
	public List<Zone> findByVilles(@PathVariable String ville){
		return zoneservice.findByVille(ville);
	}
	/*@GetMapping("/ville/{id}")
	public List<Zone> findByVilles(@PathVariable int id){
		return zoneservice.findByvilleId(id);
	}*/
	
	@PostMapping("/save/{id}")
	public Zone save(@RequestBody Zone zone,@PathVariable int id){
		Ville ville = new Ville();
		ville.setId(id);
		zone.setVille(ville);
	    return zoneservice.save(zone);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
		//Zone zone = zoneservice.findById(Integer.parseInt(id));
		zoneservice.delete(id);
	}
	
	@GetMapping("/findById/{id}")
	public Zone findById(@PathVariable int id) {
		return zoneservice.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public Zone update(@PathVariable int id,@RequestBody Zone zone) {
		Zone zones = zoneservice.findById(id);
		if(zones != null) {
			zones.setNom(zone.getNom());
			zones.setVille(zone.getVille());
			return zoneservice.save(zones);
		}
		return null;
	}
	
}
