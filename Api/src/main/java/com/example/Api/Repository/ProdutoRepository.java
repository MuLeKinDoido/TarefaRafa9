package com.example.Api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Api.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContaining(String nome);
}
