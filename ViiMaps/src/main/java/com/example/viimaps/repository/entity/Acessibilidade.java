package com.example.viiamaps.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "acessibilidades")
public class Acessibilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean cadeiraDeRodas;

    @Column(nullable = false)
    private boolean banheiroComAcessibilidade;

    @Column(nullable = false)
    private boolean menuBraile;

    @Column(nullable = false)
    private boolean linguagemDeSinal;

    @Column(nullable = false)
    private boolean estacionamentoPreferencial;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_id", nullable = false)
    private Estabelecimento estabelecimento;

    public Acessibilidade() {}

    public Acessibilidade(boolean cadeiraDeRodas, boolean banheiroComAcessibilidade, boolean menuBraile, boolean linguagemDeSinal, boolean estacionamentoPreferencial) {
        this.cadeiraDeRodas = cadeiraDeRodas;
        this.banheiroComAcessibilidade = banheiroComAcessibilidade;
        this.menuBraile = menuBraile;
        this.linguagemDeSinal = linguagemDeSinal;
        this.estacionamentoPreferencial = estacionamentoPreferencial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCadeiraDeRodas() {
        return cadeiraDeRodas;
    }

    public void setCadeiraDeRodas(boolean cadeiraDeRodas) {
        this.cadeiraDeRodas = cadeiraDeRodas;
    }

    public boolean isBanheiroComAcessibilidade() {
        return banheiroComAcessibilidade;
    }

    public void setBanheiroComAcessibilidade(boolean banheiroComAcessibilidade) {
        this.banheiroComAcessibilidade = banheiroComAcessibilidade;
    }

    public boolean isMenuBraile() {
        return menuBraile;
    }

    public void setMenuBraile(boolean menuBraile) {
        this.menuBraile = menuBraile;
    }

    public boolean isLinguagemDeSinal() {
        return linguagemDeSinal;
    }

    public void setLinguagemDeSinal(boolean linguagemDeSinal) {
        this.linguagemDeSinal = linguagemDeSinal;
    }

    public boolean isEstacionamentoPreferencial() {
        return estacionamentoPreferencial;
    }

    public void setEstacionamentoPreferencial(boolean estacionamentoPreferencial) {
        this.estacionamentoPreferencial = estacionamentoPreferencial;
    }
}
