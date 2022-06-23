package com.example.handora.cadastro.dto;

import com.example.handora.cadastro.model.Livro;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.ISBN;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class LivroRequestDto {

    @Size(max = 200)
    @NotBlank
    private String titulo;

    @Size(max = 4000)
    @NotBlank
    private String descricao;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataDePublicacao;

    @ISBN
    @NotBlank
    private String isbn;

    public Livro paraLivro() {
        return new Livro(this.titulo, this.descricao, this.dataDePublicacao, this.isbn);
    }
}
