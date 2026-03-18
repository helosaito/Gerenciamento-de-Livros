package com.lachimia.saito.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_TABELA")
public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Titulo do livro")
    private  String Titulo;

    @Column(name = "Nome do Autor")
    private  String Autor;

    @Column(name = "Data de Publicacao")
    private Integer anoPublicacao;

    public LivroModel(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
