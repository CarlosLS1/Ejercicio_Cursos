/**
 * 
 */
package com.curso.service;

import java.util.List;

import com.curso.model.Formacion;

/**
 * @author sinensia
 *
 */
public interface FormacionesService {

	List<Formacion> formacion();
	void formacion(Formacion formacion);
}
