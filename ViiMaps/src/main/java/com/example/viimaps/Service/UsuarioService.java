package com.example.viimaps.Service;

import com.example.viimaps.repository.UsuarioRepository;
import com.example.viimaps.repository.entity.Acessibilidade;
import com.example.viimaps.repository.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) { this.repository = repository;}

    public List<Usuario> findAll() {return repository.findAll(); }
    public Optional<Usuario> findById(Long id) {return repository.findById(id); }
    public Usuario save(Usuario usuario) { return repository.save(usuario); }
    public void delete(Usuario usuario) {repository.delete(usuario);
    }
}
