package com.curso.servicio;

import java.util.List;

import com.curso.model.Curso;

public interface CursoServicio {

	List<Curso> listaCursos();
	Curso buscarCurso(int codigoCurso);
	List<Curso> eliminarCurso(int codigoCurso);
	List<Curso> crearCurso(Curso curso);
	void actualizarCurso(int codigoCurso, int duracionCurso);
	List<Curso> cursoPrecios(int precio1,  int precio2);
	
}
