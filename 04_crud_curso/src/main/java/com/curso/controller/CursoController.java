package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.servicio.CursoServicio;


@RestController
public class CursoController {

	@Autowired
	CursoServicio service;
	
	//http://localhost:8080/curso/4
	@GetMapping(value="curso/{codigocurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable("codigocurso") int codigoCurso){
		return service.buscarCurso(codigoCurso);
		
	}
	//http://localhost:8080/curso
	@PostMapping(value="curso", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> crearCurso(@RequestBody Curso curso){
		service.crearCurso(curso);
		return service.listaCursos();
		
	}
	//http://localhost:8080/curso
	@PutMapping(value="curso", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCurso(@RequestBody Curso curso){
		service.actualizarCurso(curso.getDuracionCurso(), curso.getCodigoCurso());
	}
	
	//http://localhost:8080/curso/4
	@DeleteMapping(value="curso/{codigocurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable("codigocurso") int codigoCurso){
		service.eliminarCurso(codigoCurso);
		return service.listaCursos();
		
	}
	
	
	@GetMapping(value="curso/{preciomin}/{preciomax}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursoPrecios(@PathVariable("preciomin") int preciomin, @PathVariable("preciomax") int preciomax){
		return service.cursoPrecios(preciomin, preciomax);
		
	}
}
