package com.example.viimaps.Service;


import com.example.viimaps.repository.EstabelecimentoRepository;
import com.example.viimaps.repository.entity.Estabelecimento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstabelecimentoService {
    private final EstabelecimentoRepository repository;

    public EstabelecimentoService(EstabelecimentoRepository repository) {this.repository = repository;}

    public List<Estabelecimento> findAll() {return repository.findAll();}
    public Optional<Estabelecimento> findById(Long id) {return repository.findById(id);}
    public Estabelecimento save(Estabelecimento estabelecimento) {return repository.save(estabelecimento);}
    public void delete(long id) {repository.deleteById(id);}
}
