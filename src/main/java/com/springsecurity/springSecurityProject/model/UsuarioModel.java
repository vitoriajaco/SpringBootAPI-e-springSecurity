package com.springsecurity.springSecurityProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column (nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String idade;
    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String telefone;
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String senha;





}
