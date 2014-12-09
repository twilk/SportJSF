package com.example.jsfdemo.domain;


import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Sport{
	
	private int id=0;
	private String nazwa = "";
	private String dataRejestracji="1992-10-19";
	private String ilosc = "";
	private String kategoria = "";
	private String wynik = "";
	private String opis = "";
	//moje chujstwa. ^
	//getset
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getDataRejestracji() {
		return dataRejestracji;
	}
	public void setDataRejestracji(String dataRejestracji) {
		this.dataRejestracji = dataRejestracji;
	}
	public String getIlosc() {
		return ilosc;
	}
	public void setIlosc(String ilosc) {
		this.ilosc = ilosc;
	}
	public String getKategoria() {
		return kategoria;
	}
	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}
	public String getWynik() {
		return wynik;
	}
	public void setWynik(String wynik) {
		this.wynik = wynik;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	
}
