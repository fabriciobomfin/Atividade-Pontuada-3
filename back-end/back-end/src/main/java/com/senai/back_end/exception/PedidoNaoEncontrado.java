package com.senai.back_end.exception;

public class PedidoNaoEncontrado extends RuntimeException {
    public PedidoNaoEncontrado(Long id) {
        super("Pedido não encontrado com o ID: " + id);
    }
}