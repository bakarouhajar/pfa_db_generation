package com.example.terrain.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Terrain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String adresse;
	private double latitude;
	private double longtitude;
	private String description;
	private double tarif;
	private String date_ouverture;
	
	@ManyToMany(mappedBy="terraines")
	private List<Reservation> reservation;
	
	@OneToMany(mappedBy="terrains")
	private List<Match> matche;
	

	public List<Match> getMatch() {
		return matche;
	}



	public void setMatch(List<Match> match) {
		this.matche = match;
	}



	public Proprietaire getProprietaire() {
		return proprietaire;
	}



	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}



	
	
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}



	@JsonIgnore
	@ManyToOne
	private Proprietaire proprietaire;
	
	
	
	@JsonIgnore
	@ManyToOne
	private Zone zone;

	
	
	@OneToMany(mappedBy="terrain")
	private List<Photo> photo;



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



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongtitude() {
		return longtitude;
	}



	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getTarif() {
		return tarif;
	}



	public void setTarif(double tarif) {
		this.tarif = tarif;
	}



	public String getDate_ouverture() {
		return date_ouverture;
	}



	public void setDate_ouverture(String date_ouverture) {
		this.date_ouverture = date_ouverture;
	}



	public Zone getZone() {
		return zone;
	}



	public void setZone(Zone zone) {
		this.zone = zone;
	}



	public List<Photo> getPhoto() {
		return photo;
	}



	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	

	
	
	
	





	
}

	

