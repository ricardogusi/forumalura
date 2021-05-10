package com.gusi.forumalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusi.forumalura.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

	
}
