package com.example.viiamaps.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "avaliacaos")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,  length = 50)
    private String autor;

    @Column(nullable = false,   length = 3)
    private String nota;

    @Column(nullable = false,   length = 11)
    private String data;

    @Column(nullable = false)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "usuario_id",nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_id", nullable = false)
    private Estabelecimento estabelecimento;

    public Avaliacao() {}

    public Avaliacao(String autor, String nota, String data, String comentario) {
        this.autor = autor;
        this.nota = nota;
        this.data = data;
        this.comentario = comentario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}