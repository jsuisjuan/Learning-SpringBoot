package com.br.juan.console.models;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    // revisar este método em algum outro momento
    public float valorTotal() {
        float valor = 0;
        if (this.produtos != null) {
            for (Produto produto : this.produtos) {
                valor += produto.getValor();
            }
        }
        return valor;
    }
}
