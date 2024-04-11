package com.mycompany.trabalhoanderson1b.newpackage;

public class dadosDaVenda {
    private String Cliente;
    private String formagaPagamento;
    private String livrosSelecionados;
    private Double valorUnitario;

    @Override
    public String toString() {
        return "dadosDaVenda{" + "Cliente=" + Cliente + ", formagaPagamento=" + formagaPagamento + ", livrosSelecionados=" + livrosSelecionados + ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + '}';
    }
    private Double valorTotal;

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getFormagaPagamento() {
        return formagaPagamento;
    }

    public void setFormagaPagamento(String formagaPagamento) {
        this.formagaPagamento = formagaPagamento;
    }

    public String getLivrosSelecionados() {
        return livrosSelecionados;
    }

    public void setLivrosSelecionados(String livrosSelecionados) {
        this.livrosSelecionados = livrosSelecionados;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
