package com.example.demo.dto;

import com.example.demo.model.Pedido;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class RequisicaoNovoPedido {
    @NotBlank
    private String nomeProduto;
    @NotBlank
    private String urlProduto;
    @NotBlank
    private String urlImagem;
    private String descricao;

    public Pedido toPedido() {

        Pedido pedido = new Pedido ();
        pedido.setDescricao(descricao);
        pedido.setNome(nomeProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setUrlProduto(urlProduto);
        return pedido;
    }
}
