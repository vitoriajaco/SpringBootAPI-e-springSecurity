package com.springsecurity.springSecurityProject.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {

    private String nome;
    private String idade;
    private String telefone;
    private String login;
    private String senha;

}
