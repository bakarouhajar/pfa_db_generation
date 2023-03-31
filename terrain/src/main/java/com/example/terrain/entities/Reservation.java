package com.example.terrain.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date datereservation;
      
    @ManyToOne
    private Club club;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Terrain> terraines;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatereservation() {
		return datereservation;
	}
	public void setDatereservation(Date datereservation) {
		this.datereservation = datereservation;
	}
      
}
