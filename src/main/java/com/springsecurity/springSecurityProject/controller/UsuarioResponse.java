package com.springsecurity.springSecurityProject.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springsecurity.springSecurityProject.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {

    private Long id;
    private String nome;
    private String login;
    @JsonProperty("password")
    private String senha;

    public static UsuarioResponse fromUsuarioModel(UsuarioModel usuarioModel){
        return new UsuarioResponse(usuarioModel.getId(), usuarioModel.getNome(),
                usuarioModel.getLogin(), usuarioModel.getSenha());
    }

}
