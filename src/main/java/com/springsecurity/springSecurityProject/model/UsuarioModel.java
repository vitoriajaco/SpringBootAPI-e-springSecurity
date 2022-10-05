package com.springsecurity.springSecurityProject.model;

import javax.persistence.*;

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private int idade;
    @Column
    private String telefone;
    @Column(unique = true)
    private String login;
    @Column
    private String senha;
}
