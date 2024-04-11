package com.mycompany.trabalhoanderson1b.newpackage;

public class Pagamento {
    private String pix;
    private String boleto;
    private String aVista;
    
    @Override
    public String toString() {
        return "Pagamento{" + "pix=" + pix + ", boleto=" + boleto + ", aVista=" + aVista + ", cartao=" + cartao + '}';
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getaVista() {
        return aVista;
    }

    public void setaVista(String aVista) {
        this.aVista = aVista;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    private String cartao;
}
