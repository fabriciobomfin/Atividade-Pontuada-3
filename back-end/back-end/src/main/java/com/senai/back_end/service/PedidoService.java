package com.senai.back_end.service;
import com.senai.back_end.model.Pedido;
import com.senai.back_end.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado com o ID: " + id));
    }

    public void deletarPedido(Long id) {
        if (!pedidoRepository.existsById(id)) {
            throw new RuntimeException("Pedido não encontrado com o ID: " + id);
        }
        pedidoRepository.deleteById(id);
    }

    public Pedido atualizarPedido(Long id, Pedido pedidoAtualizado) {
        Pedido pedidoExistente = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado com o ID: " + id));

        pedidoExistente.setNome(pedidoAtualizado.getNome());
        pedidoExistente.setDescrição(pedidoAtualizado.getDescrição());
        pedidoExistente.setPreco(pedidoAtualizado.getPreco());
        pedidoExistente.setCategoria(pedidoAtualizado.getCategoria());
        pedidoExistente.setDisponibilidade(pedidoAtualizado.getDisponibilidade());
        pedidoExistente.setUrl(pedidoAtualizado.getUrl());

        return pedidoRepository.save(pedidoExistente);
    }
}