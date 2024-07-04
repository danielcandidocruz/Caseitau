package com.gerenciador_usuario.service;

import com.gerenciador_usuario.entity.Usuario;
import com.gerenciador_usuario.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return this.iUsuarioRepository.save(usuario);
    }


    public Usuario atualizarUsuario(Usuario usuario) {
        return this.iUsuarioRepository.save(usuario);
    }

    public void excluirUsuario(Usuario usuario) {
        this.iUsuarioRepository.deleteById(usuario.getId());
    }

    public List<Usuario> obtemUsuario() {
        return this.iUsuarioRepository.findAll();
    }

}
