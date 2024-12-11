package com.example.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api.Pedido;
import com.example.Api.Services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }

    @GetMapping
    public List<Pedido> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pedido listarPorId(@PathVariable Long id) {
        return service.listarPorId(id);
    }
}

