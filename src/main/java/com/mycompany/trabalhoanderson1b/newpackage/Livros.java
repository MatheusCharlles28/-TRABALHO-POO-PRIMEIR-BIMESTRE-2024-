package com.mycompany.trabalhoanderson1b.newpackage;

public class Livros {

    @Override
    public String toString() {
        return "Livros{" + "nomeDosLivros=" + nomeDosLivros + ", editoras=" + editoras + ", autores=" + autores + ", anoLancamento=" + anoLancamento + ", numeroPaginas=" + numeroPaginas + ", genero=" + genero + ", precoVenda=" + precoVenda + ", qtdEstoque=" + qtdEstoque + '}';
    }

    private String nomeDosLivros;
    private String editoras;

    public String getNomeDosLivros() {
        return nomeDosLivros;
    }

    public void setNomeDosLivros(String nomeDosLivros) {
        this.nomeDosLivros = nomeDosLivros;
    }

    public String getEditoras() {
        return editoras;
    }

    public void setEditoras(String editoras) {
        this.editoras = editoras;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    private String autores;
    private int anoLancamento;

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    private int numeroPaginas;
    private String genero;
    private Double precoVenda;
    private int qtdEstoque;
    
   
}
