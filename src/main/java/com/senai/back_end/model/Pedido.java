package com.senai.back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome não pode estar vazio")
    private String nome;

    @NotBlank(message = "Descrição não pode estar vazia")
    private String descrição;

    private Double preco;

    @NotBlank(message = "Categoria não pode estar vazia")
    private String categoria;

    @NotBlank(message = "Disponibilidade não pode estar vazia")
    private String disponibilidade;

    @NotBlank(message = "URL não pode estar vazia")
    private String url;

    public Pedido() {
    }
    public Pedido(Long id, String nome, String descrição, Double preco, String categoria, String disponibilidade, String url) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.preco = preco;
        this.categoria = categoria;
        this.disponibilidade = disponibilidade;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome não pode estar vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome não pode estar vazio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Descrição não pode estar vazia") String getDescrição() {
        return descrição;
    }

    public void setDescrição(@NotBlank(message = "Descrição não pode estar vazia") String descrição) {
        this.descrição = descrição;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public @NotBlank(message = "Categoria não pode estar vazia") String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank(message = "Categoria não pode estar vazia") String categoria) {
        this.categoria = categoria;
    }

    public @NotBlank(message = "Disponibilidade não pode estar vazia") String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(@NotBlank(message = "Disponibilidade não pode estar vazia") String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public @NotBlank(message = "URL não pode estar vazia") String getUrl() {
        return url;
    }

    public void setUrl(@NotBlank(message = "URL não pode estar vazia") String url) {
        this.url = url;
    }
}
