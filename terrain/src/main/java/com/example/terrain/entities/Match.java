package com.example.terrain.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name ="match_data")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String niveauJoueur;
    private int Score;
    private int dureMatch;
    private String Commentaire;
    @Temporal(TemporalType.DATE)
    private LocalDate dateDebut;
    private LocalDate dateFin;
    
   
    @ManyToOne 
    private Terrain terrains;
    
    @ManyToMany
    private List<Club> club;
    
	public int getId(){
		return id;
	}
	public Terrain getTerrains() {
		return terrains;
	}
	public void setTerrains(Terrain terrains) {
		this.terrains = terrains;
	}
	public List<Club> getClub() {
		return club;
	}
	public void setClub(List<Club> club) {
		this.club = club;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNiveauJoueur() {
		return niveauJoueur;
	}
	public void setNiveauJoueur(String niveauJoueur) {
		this.niveauJoueur = niveauJoueur;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public int getDureMatch() {
		return dureMatch;
	}
	public void setDureMatch(int dureMatch) {
		this.dureMatch = dureMatch;
	}
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
      
      
}