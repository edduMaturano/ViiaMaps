package com.example.viiamaps.repository.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estabelecimentos")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 100)
    private String endereco;

    @Column(columnDefinition = "TEXT")
    private String imagem;

    @Column(nullable = false, length = 11)
    private String telefone;


    @Column(nullable = false, length = 16)
    private String longitude;

    @Column(nullable = false, length = 16)
    private String latitude;

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Avaliacao> avaliacoes;

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Acessibilidade> acessibilidades;

    public Estabelecimento() {}

    public Estabelecimento(String nome, String endereco, String imagem, String telefone, String longitude, String latitude) {
        this.nome = nome;
        this.endereco = endereco;
        this.imagem = imagem;
        this.telefone = telefone;
        this.longitude = longitude;
        this.latitude = latitude;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}