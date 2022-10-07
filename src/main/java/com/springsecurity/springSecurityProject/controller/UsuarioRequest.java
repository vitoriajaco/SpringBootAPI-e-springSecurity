package com.springsecurity.springSecurityProject.controller;


import com.springsecurity.springSecurityProject.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {

    private String nome;
    private String idade;
    private String telefone;
    private String login;
    @NotBlank
    private String senha;

    public UsuarioModel toUsuarioModel(){
        return new UsuarioModel(null, nome, idade, telefone, login, senha);
    }

}
