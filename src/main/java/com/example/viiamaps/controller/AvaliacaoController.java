package com.example.viiamaps.controller;

import com.example.viiamaps.Service.AvaliacaoService;
import com.example.viiamaps.repository.entity.Avaliacao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {


        private final AvaliacaoService service;

        public AvaliacaoController(AvaliacaoService service) {
            this.service = service;
        }

        @GetMapping
        public List<Avaliacao> getAll(){
            return service.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Avaliacao> getById(@PathVariable Long id) {
            return service.findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping
        public Avaliacao create(@RequestBody Avaliacao avaliacao) {
            return service.save(avaliacao);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Avaliacao> update(@PathVariable Long id, @RequestBody Avaliacao avaliacao) {
            return service.findById(id).map(existing -> {
                existing.setAutor(avaliacao.getAutor());
                existing.setNota(avaliacao.getNota());
                existing.setData(avaliacao.getData());
                existing.setComentario(avaliacao.getComentario());
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
