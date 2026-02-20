package com.example.viimaps.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Acessibilidades")
public class Acessibilidade {

    @Id
    private Long id;

    private boolean cadeiraDeRodas;

    private boolean banheiroComAcessibilidade;

    private boolean menuBraile;

    private boolean linguagemDeSinal;

    private boolean estacionamentoPreferencial;




}
