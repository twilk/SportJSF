package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Sport;

@ApplicationScoped
public class AWF {
	private List<Sport> db = new ArrayList<Sport>();

	public void addSport(Sport sport) {
		Sport newSport = new Sport();

		newSport.setId(sport.getId());
		newSport.setNazwa(sport.getNazwa());
		newSport.setDataRejestracji(sport.getDataRejestracji());
		newSport.setIlosc(sport.getIlosc());
		newSport.setKategoria(sport.getKategoria());
		newSport.setWynik(sport.getWynik());
		newSport.setOpis(sport.getOpis());
		db.add(newSport);
	}

	// Removes the person with given name
	public void deleteSport(Sport sport) {
		Sport sportToRemove = null;
		for (Sport s : db) {
			if (sport.getNazwa().equals(s.getNazwa())) {
				sportToRemove = s;
				break;
			}
		}
		if (sportToRemove != null)
			db.remove(sportToRemove);
	}

	public List<Sport> getAllSports() {
		return db;
	}
}
