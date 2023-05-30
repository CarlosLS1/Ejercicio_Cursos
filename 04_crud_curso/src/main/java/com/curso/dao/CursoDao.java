package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Curso;

public interface CursoDao extends JpaRepository<Curso, Integer> {
	
	
	@Query(value="SELECT * FROM cursos where precio BETWEEN  ?1 AND ?2", nativeQuery=true)
	List<Curso> cursoPrecios (int preciomin, int preciomax);	
		
	@Transactional
	@Modifying
	@Query("update Curso curso set curso.duracionCurso =:duracionCurso where curso.codigoCurso =:codigoCurso")
	void actualizacionHorasCurso (@Param(value="codigoCurso")int codigoCurso, @Param(value="duracionCurso") int duracionCurso);	
	
	
	
}
