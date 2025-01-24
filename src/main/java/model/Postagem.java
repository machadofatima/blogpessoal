package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity // define a entidade, será utilizada pra gerar a tabela
@Table(name = "tb_postagens") // define o nome da tabela
public class Postagem {

    @Id // define que o atributo será a PK (primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // A Anotação @GeneratedValue indica que a Chave Primária será gerada pelo Banco de dados. O parâmetro strategy indica de que forma esta Chave Primária será gerada. A Estratégia GenerationType.IDENTITY indica que a Chave Primária será gerada pelo Banco de dados através da opção auto-incremento (auto-increment) do SQL, que gera uma sequência numérica iniciando em 1.
    private Long id;

    @NotBlank(message = "O atributo título é obrigatório.") // Não permite que o Atributo seja Nulo ou contenha apenas espaços em branco
    @Size(min = 5, max = 100, message = "O atributo titulo deve conter no mínimo 5 e no máximo 100 caractéres.")
    private String titulo;

    @NotBlank(message = "O atributo texto é obrigatório.") // Não permite que o Atributo seja Nulo ou contenha apenas espaços em branco
    @Size(min = 5, max = 2000, message = "O atributo texto deve conter no mínimo 5 e no máximo 2000 caractéres.")
    private String texto;


    @DateTimeFormat
    @UpdateTimestamp // Obtém a data e a hora do Sistema Operacional e inserir no Atributo data toda vez que um Objeto da Classe Postagem for criado ou atualizado.
    private LocalDateTime data;

    @ManyToOne
    @JsonIgnoreProperties ("postagem")
    private Tema tema;

    @ManyToOne
    @JsonIgnoreProperties ("postagem")
    private Usuario usuario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}