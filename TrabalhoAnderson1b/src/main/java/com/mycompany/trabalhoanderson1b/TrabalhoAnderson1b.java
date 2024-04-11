package com.mycompany.trabalhoanderson1b;

import com.mycompany.trabalhoanderson1b.newpackage.Cliente;
import com.mycompany.trabalhoanderson1b.newpackage.Endereco;
import com.mycompany.trabalhoanderson1b.newpackage.Livros;
import com.mycompany.trabalhoanderson1b.newpackage.Pagamento;
import com.mycompany.trabalhoanderson1b.newpackage.dadosDaVenda;
import com.mycompany.trabalhoanderson1b.newpackage.Pedido;

public class TrabalhoAnderson1b {

    public static void main(String[] args) {
        
        Livros livro1 = new Livros();
        
            livro1.setNomeDosLivros("Gasparzinho");
            livro1.setAnoLancamento(2000);
            livro1.setAutores("Desconhecido");
            livro1.setEditoras("Misterio");
            livro1.setGenero("Terror");
            livro1.setNumeroPaginas(100);
            livro1.setPrecoVenda(105.90);
            livro1.setQtdEstoque(10);
        
        Livros livro2 = new Livros();
        
            livro2.setNomeDosLivros("Fantasminha Camarada");
            livro2.setAnoLancamento(2001);
            livro2.setAutores("Invisivel");
            livro2.setEditoras("Desconhecida");
            livro2.setGenero("Suspense");
            livro2.setNumeroPaginas(200);
            livro2.setPrecoVenda(110.90);
            livro2.setQtdEstoque(5);
            
        Livros livro3 = new Livros();
        
            livro3.setNomeDosLivros("Enderman");
            livro3.setAnoLancamento(2002);
            livro3.setAutores("Ender Dragon");
            livro3.setEditoras("Mojang");
            livro3.setGenero("Aventura");
            livro3.setNumeroPaginas(300);
            livro3.setPrecoVenda(200.10);
            livro3.setQtdEstoque(30);
        
        Endereco endereco1 = new Endereco();
        
            endereco1.setPais("Brasil");
            endereco1.setEstado("Parana");
            endereco1.setCidade("Toledo");
            endereco1.setBairro("Panorama");
            endereco1.setNumero(2368);           
        
        Cliente cliente1 = new Cliente();
        
            cliente1.setNomeCliente("Matheus");
            cliente1.setSexoCliente("Masculino");
            cliente1.setIdadeCliente(22);
            cliente1.setDocumento("105.341.129-43");
            cliente1.setEndereco(endereco1);
               
            System.out.println(cliente1.toString());  
        
            System.out.println(livro1.toString());
            System.out.println(livro2.toString());
            System.out.println(livro3.toString());
        
        dadosDaVenda vender = new dadosDaVenda();
        dadosDaVenda vender2 = new dadosDaVenda();
        dadosDaVenda vender3 = new dadosDaVenda();
        
        Pagamento pagar = new Pagamento();
        Pagamento pagar2 = new Pagamento();
        
            pagar.setCartao("Debito");
            pagar2.setBoleto("Boleto");
        
        vender.setCliente(cliente1.getNomeCliente());
        vender.setFormagaPagamento(pagar.getCartao());
        vender.setLivrosSelecionados(livro1.getNomeDosLivros());
        vender.setValorUnitario(105.90);
        
        vender2.setCliente(cliente1.getNomeCliente());
        vender2.setFormagaPagamento(pagar2.getBoleto());
        vender2.setLivrosSelecionados(livro2.getNomeDosLivros());
        vender2.setValorUnitario(110.90);
        
        vender3.setCliente(cliente1.getNomeCliente());
        vender3.setFormagaPagamento(pagar.getCartao());
        vender3.setLivrosSelecionados(livro3.getNomeDosLivros());
        vender3.setValorUnitario(200.10);
                   
            Double calcularTotal = vender.getValorUnitario() + 
                    vender2.getValorUnitario() + vender3.getValorUnitario();
                 
        Pedido mostrarPedido = new Pedido();                        
        
        mostrarPedido.setValorSemDesconto(calcularTotal);
        mostrarPedido.setClienteMostrar(cliente1.getNomeCliente());
        mostrarPedido.setLivro1(livro1.getNomeDosLivros());
        mostrarPedido.setLivro2(livro2.getNomeDosLivros());
        mostrarPedido.setLivro3(livro3.getNomeDosLivros());
        mostrarPedido.setValorUnitario1(vender.getValorUnitario());
        mostrarPedido.setValorUnitario2(vender2.getValorUnitario());
        mostrarPedido.setValorUnitario3(vender3.getValorUnitario());
        mostrarPedido.setFormagaPagamento1(vender.getFormagaPagamento());
        mostrarPedido.setFormagaPagamento2(vender2.getFormagaPagamento());
        mostrarPedido.setDesconto1(10.50);
        mostrarPedido.setDesconto2(10.50);
        mostrarPedido.setDesconto3(10.50);
        
        Double calcularDescontoTotal = mostrarPedido.getDesconto1() + mostrarPedido.getDesconto2() + mostrarPedido.getDesconto3();
            mostrarPedido.setDescontoTotal(calcularDescontoTotal);
            
        Double pagamentoTotal = calcularTotal - calcularDescontoTotal;
            mostrarPedido.setValorAPagar(pagamentoTotal);
        
        System.out.println(mostrarPedido.toString());      
   }
}
