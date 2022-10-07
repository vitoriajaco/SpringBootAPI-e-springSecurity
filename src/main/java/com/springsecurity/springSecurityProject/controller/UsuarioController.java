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

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuarioResponse>> buscar() {
      List<UsuarioModel> listaDeUsuarioModel = usuarioService.mostrarTodosUsuarios();
      List<UsuarioResponse> listaDeUsuarioResponse = new ArrayList<>();
      for (UsuarioModel usuarioModel : listaDeUsuarioModel ) {
            UsuarioResponse usuarioResponse = UsuarioResponse.fromUsuarioModel(usuarioModel);
            listaDeUsuarioResponse.add(usuarioResponse);
        }

        return ResponseEntity.ok(listaDeUsuarioResponse);
    }
    @PostMapping(value = "/usuarios")
    public ResponseEntity<UsuarioResponse> cadastrar(@RequestBody UsuarioRequest usuarioRequest){
        UsuarioModel usuario = usuarioService.cadastrarUsuario (usuarioRequest.toUsuarioModel());
        UsuarioResponse usuarioResponse = UsuarioResponse.fromUsuarioModel(usuario);
        return new ResponseEntity<>(usuarioResponse, HttpStatus.CREATED);
    }

}
