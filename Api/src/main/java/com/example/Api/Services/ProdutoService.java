package com.example.Api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Api.Produto;
import com.example.Api.Repository.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto listarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
}
