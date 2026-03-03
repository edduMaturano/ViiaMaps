package com.example.viiamaps.controller;

import com.example.viiamaps.Service.EstabelecimentoService;
import com.example.viiamaps.repository.entity.Estabelecimento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

    private final EstabelecimentoService service;

    public EstabelecimentoController(EstabelecimentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estabelecimento> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estabelecimento> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estabelecimento create(@RequestBody Estabelecimento estabelecimento) {
        return service.save(estabelecimento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estabelecimento> update(@PathVariable Long id, @RequestBody Estabelecimento avaliacao) {
        return service.findById(id).map(existing -> {
            existing.setNome(avaliacao.getNome());
            existing.setEndereco(avaliacao.getEndereco());
            existing.setImagem(avaliacao.getImagem());
            existing.setTelefone(avaliacao.getTelefone());
            existing.setLongitude(avaliacao.getLongitude());
            existing.setLatitude(avaliacao.getLatitude());
            return ResponseEntity.ok(service.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.findById(id).map(existing -> {
            service.delete(id);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
