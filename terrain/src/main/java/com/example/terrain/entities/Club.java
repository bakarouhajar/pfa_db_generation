package com.example.terrain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Club {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String nom;
     private String password;
     
     @OneToMany(mappedBy = "club")
     private List<Joueur> joueur;
    
     @OneToMany(mappedBy = "club")
     private List<Reservation> reservation;
    
     @ManyToMany(mappedBy="club")
     private List<Match> matchData;
    
	public List<Joueur> getJoueur(){
		return joueur;
	}
	public void setJoueur(List<Joueur> joueur) {
		this.joueur = joueur;
	}
	public List<Reservation> getReservation() {
		return reservation;
	}
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	public List<Match> getMatch() {
		return matchData;
	}
	public void setMatch(List<Match> match) {
		this.matchData = match;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}