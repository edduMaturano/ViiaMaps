package com.example.viimaps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.viimaps.repository.entity.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{}