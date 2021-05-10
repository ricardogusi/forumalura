package com.gusi.forumalura.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gusi.forumalura.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

	//caso tenho problema de ambiguidade do nome da entidade + atributo com um atributo, pode-se usar Curso_Nome

	

	
}
