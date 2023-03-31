package com.example.terrain.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Proprietaire {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      private String nom;
      private String prenom;
      private String email;
      private String numeTel;
      
      
    @OneToMany(mappedBy="proprietaire")
    private List<Terrain> terrain; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public List<Terrain> getTerrain() {
		return terrain;
	}
	public void setTerrain(List<Terrain> terrain) {
		this.terrain = terrain;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeTel() {
		return numeTel;
	}
	public void setNumeTel(String numeTel) {
		this.numeTel = numeTel;
	}
      
      
}
