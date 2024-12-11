package com.example.Api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Api.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByIdCliente(Long idCliente);

    List<Pedido> findByIdsProdutosContaining(Long idProduto);
}
