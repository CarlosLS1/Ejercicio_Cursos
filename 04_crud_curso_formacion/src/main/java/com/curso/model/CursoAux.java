package com.curso.model;


public class CursoAux {
	
	private String nombreCurso;
	private int duracionCurso;
	private double precio;
	
	public CursoAux() {
	}
	public CursoAux(String nombreCurso, int duracionCurso, double precio) {
		super();
		this.nombreCurso = nombreCurso;
		this.duracionCurso = duracionCurso;
		this.precio = precio;
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
