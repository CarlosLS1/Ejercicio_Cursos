package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.CursoAux;
import com.curso.model.Formacion;

@Service
public class FormacionesServiceImpl implements FormacionesService {

	@Autowired
	RestTemplate template;
	
	private String url="http://localhost:8080/";
	
	@Override
	public List<Formacion> formacion() {
		List<Formacion> formaciones = new ArrayList<Formacion>();
		List<CursoAux> cursos = Arrays.asList(template.getForObject(url + "curso", CursoAux[].class));
		for (CursoAux curso : cursos) {
			Formacion formacion;
				if(curso.getDuracionCurso() > 50) {
					formacion = new Formacion(curso.getNombreCurso(),10,curso.getPrecio());
				} else {
					formacion = new Formacion(curso.getNombreCurso(),5,curso.getPrecio());
				}
				formaciones.add(formacion);
			}
		return formaciones;
	}

	@Override
	public void formacion(Formacion formacion) {
		List<CursoAux> cursos = Arrays.asList(template.getForObject(url + "curso", CursoAux[].class));
		List<String> nombreCursos = new ArrayList<String>();
		for (CursoAux curso : cursos) {
			nombreCursos.add(curso.getNombreCurso());
			}
		if (!nombreCursos.contains(formacion.getCurso())) {
			CursoAux cursonuevo = new CursoAux(formacion.getCurso(),formacion.getAsignaturas()*10,formacion.getPrecio());
			template.postForLocation(url+"curso", cursonuevo);
			
		}
	}
	
	

}
