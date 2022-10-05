package com.springsecurity.springSecurityProject.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    //Permite que tudo que esteja dentro desse path não necessite que passe senha, no fim determina o tipo da transação que é a basic

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //            |-> desabilita o csrf |-> vai autorizar os proximos parametros
        http.csrf().disable().authorizeHttpRequests().antMatchers("/usuarios/create")
                .permitAll().and().httpBasic();
    }
}