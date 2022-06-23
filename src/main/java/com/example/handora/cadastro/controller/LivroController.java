package com.example.handora.cadastro.controller;

import com.example.handora.cadastro.dto.LivroRequestDto;
import com.example.handora.cadastro.model.Livro;
import com.example.handora.cadastro.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@AllArgsConstructor

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroRepository livroRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Livro> cadastrar (@RequestBody @Valid LivroRequestDto requestDto, UriComponentsBuilder uriComponentsBuilder) {
        Livro livro = livroRepository.save(requestDto.paraLivro());

        ;


        URI location = uriComponentsBuilder.path("/livros/{id}")
                .buildAndExpand(livro.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
