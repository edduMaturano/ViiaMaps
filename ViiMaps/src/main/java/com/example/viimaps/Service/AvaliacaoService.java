package com.example.viimaps.Service;

import com.example.viimaps.repository.AvaliacaoRepository;
import com.example.viimaps.repository.entity.Avaliacao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {
    private final AvaliacaoRepository repository;
    public AvaliacaoService(AvaliacaoRepository repository) {this.repository = repository;}


    public List<Avaliacao> findAll(){return repository.findAll();}
    public Optional<Avaliacao> findById(Long id) {return repository.findById(id);}
    public Avaliacao save(Avaliacao avaliacao) {return repository.save(avaliacao);}
    public void delete(Long id) {repository.deleteById(id);}
}
