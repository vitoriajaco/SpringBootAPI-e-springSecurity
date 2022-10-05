package com.springsecurity.springSecurityProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column (nullable = false, length = 2)
    private int idade;
    @Column(nullable = false, length = 11)
    private String telefone;
    @Column(nullable = true, unique = true)
    private String login;
    @Column(nullable = true, length = 6)
    private String senha;

    public UsuarioModel(Long id, String nome, int idade, String telefone, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }
}
