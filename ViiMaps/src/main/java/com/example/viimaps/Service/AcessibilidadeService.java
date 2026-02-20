package com.example.viimaps.Service;


import com.example.viimaps.repository.AcessibilidadeRepository;
import com.example.viimaps.repository.entity.Acessibilidade;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcessibilidadeService {
    private final AcessibilidadeRepository repository;

    public AcessibilidadeService(AcessibilidadeRepository repository) {this.repository = repository;}

    public List<Acessibilidade> findAll() {return repository.findAll();}
    public Optional<Acessibilidade> findById(Long id) {return repository.findById(id);}
    public Acessibilidade save(Acessibilidade usuario) {return repository.save(usuario); }
    public void delete(Acessibilidade usuario) {repository.delete(usuario);}
}
