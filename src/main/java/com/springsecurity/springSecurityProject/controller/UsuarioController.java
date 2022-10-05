package com.springsecurity.springSecurityProject.controller;

import com.springsecurity.springSecurityProject.model.UsuarioModel;
import com.springsecurity.springSecurityProject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuarioModel>> buscar() {


        return ResponseEntity.ok(usuarioService.mostrarTodosUsuarios());
    }
    @PostMapping(value = "/usuarios/create")
    public ResponseEntity<UsuarioModel> cadastrar(@RequestBody UsuarioModel usuarioModel){
        UsuarioModel usuario = usuarioService.cadastrarUsuario (usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

}
