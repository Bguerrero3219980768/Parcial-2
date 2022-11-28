package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resultado")
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	
	
	private int partido_id;
	private int seleccion_id;
	private int goles;
	private int amarillar;
	private int rojas;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPartido_id() {
		return partido_id;
	}
	public void setPartido_id(int partido_id) {
		this.partido_id = partido_id;
	}
	public int getSeleccion_id() {
		return seleccion_id;
	}
	public void setSeleccion_id(int seleccion_id) {
		this.seleccion_id = seleccion_id;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getAmarillar() {
		return amarillar;
	}
	public void setAmarillar(int amarillar) {
		this.amarillar = amarillar;
	}
	public int getRojas() {
		return rojas;
	}
	public void setRojas(int rojas) {
		this.rojas = rojas;
	}
	
	
	
	
}
