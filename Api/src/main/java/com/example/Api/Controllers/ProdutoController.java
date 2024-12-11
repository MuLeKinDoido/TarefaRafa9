package com.example.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api.Produto;
import com.example.Api.Services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Produto listarPorId(@PathVariable Long id) {
        return service.listarPorId(id);
    }
}
