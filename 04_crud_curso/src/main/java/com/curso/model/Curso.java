package com.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * 
 * @author sinensia
 *
 */

@Entity
@Table(name="cursos")
public class Curso {

	
	@Id
	private int codigoCurso;
	@Column(name="nombrecurso")
	private String nombreCurso;
	@Column(name="duracioncurso")
	private int duracionCurso;
	@Column(name="precio")
	private double precio;
	
	public Curso() {

	}

	public Curso(int codigoCurso, String nombreCurso, int duracionCurso, double precio) {
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.duracionCurso = duracionCurso;
		this.precio = precio;
	}
	
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public int getDuracionCurso() {
		return duracionCurso;
	}
	public void setDuracionCurso(int duracionCurso) {
		this.duracionCurso = duracionCurso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
