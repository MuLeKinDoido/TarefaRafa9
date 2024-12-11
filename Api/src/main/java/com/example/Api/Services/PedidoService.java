package com.example.Api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Api.Pedido;
import com.example.Api.Repository.PedidoRepository;

@Service
public class PedidoService {
    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Pedido listarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}