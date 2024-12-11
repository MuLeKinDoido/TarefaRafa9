package com.example.Api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;

    @Email(message = "E-mail inválido")
    private String email;

    private String contato;

    // Construtor sem argumentos (necessário para o JPA)
    public Cliente() {
    }

    // Construtor com os parâmetros necessários (sem o id, pois ele é gerado automaticamente pelo JPA)
    public Cliente(String nome, String email, String contato) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
    }
}
