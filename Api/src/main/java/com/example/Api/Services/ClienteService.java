package com.example.Api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Api.Cliente;
import com.example.Api.Repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente listarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado."));
    }

    public List<Cliente> listarPorNome(String nome) {
        return repository.findByNomeContaining(nome);
    }
}
