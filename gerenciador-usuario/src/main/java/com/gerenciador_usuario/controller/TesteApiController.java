package com.gerenciador_usuario.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApiController {


  @GetMapping("testedaniel-api")
    private String teste() {
        return "Buenas notches";
    }


    @GetMapping("/teste-bem-vindo")
    public String testeBemVindo(@RequestParam(name = "nome") String nome) {
      return "Olá! "+nome+" Seja Bem vindo";
    }
}
