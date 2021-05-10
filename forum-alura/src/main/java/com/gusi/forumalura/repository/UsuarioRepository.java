package com.gusi.forumalura.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusi.forumalura.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
}
