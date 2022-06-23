package com.example.handora.cadastro.repository;

import com.example.handora.cadastro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface LivroRepository extends JpaRepository<Livro, Long>{
}
