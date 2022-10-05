package com.springsecurity.springSecurityProject.repository;

import com.springsecurity.springSecurityProject.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
