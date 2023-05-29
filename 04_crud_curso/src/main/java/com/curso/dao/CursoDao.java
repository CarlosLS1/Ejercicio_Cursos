package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Curso;

public interface CursoDao extends JpaRepository<Curso, Integer> {
	
	
	@Query(value="SELECT * FROM cursos where precio BETWEEN  ?1 AND ?2", nativeQuery=true)
	List<Curso> cursoPrecios (int preciomin, int preciomax);	
	
	@Modifying
	@Query(value="UPDATE cursos set duracioncurso = ?1 where codigocurso = ?2", nativeQuery=true)
	void actualizacionHorasCurso (int duracionCurso, int codigoCurso);	
	
}
