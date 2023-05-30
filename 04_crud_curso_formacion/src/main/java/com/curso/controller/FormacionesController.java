/**
 * 
 */
package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionesService;

/**
 * @author sinensia
 *
 */
@RestController
public class FormacionesController {

	@Autowired
	FormacionesService service;
	
	@GetMapping(value="formacion")
	public List<Formacion> listaFormacion(){
		return service.formacion();
	}
	
	@PostMapping(value="formacion")
	public List<Formacion> listaFormacion(@RequestBody Formacion formacion){
		service.formacion(formacion);
		return service.formacion();
	}
	
}
