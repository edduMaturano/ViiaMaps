package com.example.viimaps.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estabelecimentos")
public class Estabelecimento {

    @Id
    private Long id;

    private String nome;

    private String endereço;

    private String imagem;

    private String telefone;

    /*
    nao sei como seria colocado

    private String longitude;

    private String latitude;


     */
}
