package com.example.viimaps.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Avaliacaos")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String autor;

    private String nota;

    private String data;

    private String comentario;
}
