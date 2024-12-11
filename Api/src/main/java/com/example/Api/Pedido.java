package com.example.Api;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    private Long id;
    private Cliente cliente;
    private List<Produto> produtos;
    private Double total;

    // Construtor sem argumentos
    public Pedido() {
    }

    // Construtor com todos os parâmetros
    public Pedido(Long id, Cliente cliente, List<Produto> produtos, Double total) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
