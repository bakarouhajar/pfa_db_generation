package com.example.terrain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Joueur {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int NumeroMaillot;
   private String nom;
   private int age;
   
   @ManyToOne
   private Club club;

   public int getNumeroMaillot() {
	return NumeroMaillot;
   }
   public void setNumeroMaillot(int numeroMaillot) {
	NumeroMaillot = numeroMaillot;
}
public Club getClub() {
	return club;
}
public void setClub(Club club) {
	this.club = club;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
   
}
