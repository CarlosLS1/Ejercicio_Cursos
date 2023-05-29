package com.curso.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;

@Service
public class CursoServicioImpl implements CursoServicio {
	
	@Autowired
	CursoDao dao;
	
	@Override
	public List<Curso> listaCursos() {
		return dao.findAll();
	}
	
	@Override
	public Curso buscarCurso(int codigoCurso) {
		return dao.findById(codigoCurso).orElse(null);
	}

	@Override
	public List<Curso> eliminarCurso(int codigoCurso) {
		dao.deleteById(codigoCurso);
		return dao.findAll();
	}

	@Override
	public List<Curso> crearCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll();
	}

	@Override
	public void actualizarCurso(int codigoCurso, int duracionCurso ) {
		dao.actualizacionHorasCurso(codigoCurso, duracionCurso);

	}

	@Override
	public List<Curso> cursoPrecios(int preciomin, int preciomax) {
		return dao.cursoPrecios(preciomin, preciomax);
	}
	
}
