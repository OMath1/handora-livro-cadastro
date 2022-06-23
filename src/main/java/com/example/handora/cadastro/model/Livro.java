package com.example.handora.cadastro.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@RequiredArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(length = 200, nullable = false)
    private String titulo;

    @NonNull
    @Column(length = 4000, nullable = false)
    private String descricao;

    @NonNull
    @Column(nullable = false)
    private LocalDate dataDePublicacao;

    @NonNull
    @Column(nullable = false)
    private String isbn;

    @Deprecated
    public Livro() {
    }

    public Long getId() {
        return id;
    }
}
