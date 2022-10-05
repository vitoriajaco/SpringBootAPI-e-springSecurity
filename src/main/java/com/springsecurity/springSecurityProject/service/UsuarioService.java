package com.springsecurity.springSecurityProject.service;

import com.springsecurity.springSecurityProject.model.UsuarioModel;
import com.springsecurity.springSecurityProject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public List<UsuarioModel>mostrarTodosUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public UsuarioModel cadastrarUsuario(UsuarioModel usuarioModel){
        usuarioModel.setSenha(passwordEncoder().encode(usuarioModel.getSenha()));
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alterarUsuario (UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public void deletarUsuario (Long id){
        usuarioRepository.deleteById(id);
    }
}
