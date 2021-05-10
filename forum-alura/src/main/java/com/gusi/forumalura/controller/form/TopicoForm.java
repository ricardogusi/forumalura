package com.gusi.forumalura.controller.form;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import com.gusi.forumalura.modelo.Curso;
import com.gusi.forumalura.modelo.Topico;
import com.gusi.forumalura.repository.CursoRepository;




public class TopicoForm {


	@NotNull @NotEmpty 
	private String titulo;
	
	@NotNull @NotEmpty 
	private String mensagem;
	
	@NotNull @NotEmpty 
	private String nomeCurso;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Topico converter(CursoRepository cursoRepository) {
		
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
		
	}
	
	
}
