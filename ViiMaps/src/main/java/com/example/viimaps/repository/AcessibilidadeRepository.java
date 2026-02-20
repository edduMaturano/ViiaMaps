package com.example.viimaps.repository;

import com.example.viimaps.repository.entity.Acessibilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessibilidadeRepository extends JpaRepository<Acessibilidade,Long> {
}
