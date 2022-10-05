package com.springsecurity.springSecurityProject.controller;

import com.springsecurity.springSecurityProject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
}
