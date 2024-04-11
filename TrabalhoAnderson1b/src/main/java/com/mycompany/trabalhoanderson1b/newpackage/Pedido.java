package com.mycompany.trabalhoanderson1b.newpackage;

public class Pedido {
     private String clienteMostrar;
    private String formagaPagamento1;
    private String formagaPagamento2;
    private String livro1;
    private String livro2;
    private String livro3;
    private Double desconto1;
    private Double ValorUnitario1;
    private Double ValorUnitario2;
    private Double ValorUnitario3;
    private Double ValorSemDesconto;
    private Double Desconto2;
    private Double Desconto3;
    private Double DescontoTotal;

    @Override
    public String toString() {
        return "Pedido{" + "clienteMostrar=" + clienteMostrar + ", formagaPagamento1=" + formagaPagamento1 + ", formagaPagamento2=" + formagaPagamento2 + ", livro1=" + livro1 + ", livro2=" + livro2 + ", livro3=" + livro3 + ", desconto1=" + desconto1 + ", ValorUnitario1=" + ValorUnitario1 + ", ValorUnitario2=" + ValorUnitario2 + ", ValorUnitario3=" + ValorUnitario3 + ", ValorSemDesconto=" + ValorSemDesconto + ", Desconto2=" + Desconto2 + ", Desconto3=" + Desconto3 + ", DescontoTotal=" + DescontoTotal + ", valorAPagar=" + valorAPagar + '}';
    }
    private Double valorAPagar;

    public String getClienteMostrar() {
        return clienteMostrar;
    }

    public void setClienteMostrar(String clienteMostrar) {
        this.clienteMostrar = clienteMostrar;
    }

    public String getFormagaPagamento1() {
        return formagaPagamento1;
    }

    public void setFormagaPagamento1(String formagaPagamento1) {
        this.formagaPagamento1 = formagaPagamento1;
    }

    public String getFormagaPagamento2() {
        return formagaPagamento2;
    }

    public void setFormagaPagamento2(String formagaPagamento2) {
        this.formagaPagamento2 = formagaPagamento2;
    }

    public String getLivro1() {
        return livro1;
    }

    public void setLivro1(String livro1) {
        this.livro1 = livro1;
    }

    public String getLivro2() {
        return livro2;
    }

    public void setLivro2(String livro2) {
        this.livro2 = livro2;
    }

    public String getLivro3() {
        return livro3;
    }

    public void setLivro3(String livro3) {
        this.livro3 = livro3;
    }

    public Double getDesconto1() {
        return desconto1;
    }

    public void setDesconto1(Double desconto1) {
        this.desconto1 = desconto1;
    }

    public Double getValorUnitario1() {
        return ValorUnitario1;
    }

    public void setValorUnitario1(Double ValorUnitario1) {
        this.ValorUnitario1 = ValorUnitario1;
    }

    public Double getValorUnitario2() {
        return ValorUnitario2;
    }

    public void setValorUnitario2(Double ValorUnitario2) {
        this.ValorUnitario2 = ValorUnitario2;
    }

    public Double getValorUnitario3() {
        return ValorUnitario3;
    }

    public void setValorUnitario3(Double ValorUnitario3) {
        this.ValorUnitario3 = ValorUnitario3;
    }

    public Double getValorSemDesconto() {
        return ValorSemDesconto;
    }

    public void setValorSemDesconto(Double ValorSemDesconto) {
        this.ValorSemDesconto = ValorSemDesconto;
    }

    public Double getDesconto2() {
        return Desconto2;
    }

    public void setDesconto2(Double Desconto2) {
        this.Desconto2 = Desconto2;
    }

    public Double getDesconto3() {
        return Desconto3;
    }

    public void setDesconto3(Double Desconto3) {
        this.Desconto3 = Desconto3;
    }

    public Double getDescontoTotal() {
        return DescontoTotal;
    }

    public void setDescontoTotal(Double DescontoTotal) {
        this.DescontoTotal = DescontoTotal;
    }

    public Double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    
}
