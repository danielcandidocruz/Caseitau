package com.gerenciador_usuario.controller;


import com.gerenciador_usuario.entity.Usuario;
import com.gerenciador_usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.salvarUsuario(usuario), HttpStatus.CREATED);


    }

    @PutMapping
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.atualizarUsuario(usuario), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obtemUsuarios() {
        return new ResponseEntity<>(usuarioService.obtemUsuario(),HttpStatus.OK);
    }

    @DeleteMapping
    public void escluirUsuario(@RequestBody Usuario usuario) {
        usuarioService.excluirUsuario(usuario);
    }


}