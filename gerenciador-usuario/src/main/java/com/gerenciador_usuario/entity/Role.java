package com.gerenciador_usuario.entity;


import jakarta.persistence.*;
import java.util.List;
import java.io.Serializable;

@Entity
@Table(name= "roles")

public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;

        @Column(unique = true, length = 20)
        private String nome;


        @ManyToMany(mappedBy = "roles")
        private List<Usuario> usuarios;


}
