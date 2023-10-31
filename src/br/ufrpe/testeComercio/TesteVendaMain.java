package br.ufrpe.testeComercio;

import br.ufrpe.comercio.Cliente;
import br.ufrpe.comercio.ItemVenda;
import br.ufrpe.comercio.Produto;
import br.ufrpe.comercio.Venda;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteVendaMain {
    public static void main(String[] args){
        Produto produto1 = new Produto(1,"Produto 01", "Óleo", 10.00),
                produto2 = new Produto(2,"Produto 02", "Cuscuz", 5.00),
                produto3 = new Produto(3,"Produto 03", "Carne", 20.00),
                produto4 = new Produto(4,"Produto 04", "Queijo", 15.00);
        ItemVenda item1 = new ItemVenda(10, null),
                item2 = new ItemVenda(5, null),
                item3 = new ItemVenda(10, null),
                item4 = new ItemVenda(2, null);

        item1.setProdutoVendido(produto1);
        item2.setProdutoVendido(produto2);
        item3.setProdutoVendido(produto3);
        item4.setProdutoVendido(produto4);

        LocalDate dataNascimento = LocalDate.of(1994,12,23);
        LocalDateTime dataAtual = LocalDateTime.now();
        Cliente cliente = new Cliente("123456", "José Maria Marques", dataNascimento);

        Venda venda1 = new Venda(dataAtual,"Maria Dolores Sampaio",null);
        venda1.setVendidoA(cliente);
        venda1.adicionarItemVenda(item1);
        venda1.adicionarItemVenda(item2);
        venda1.adicionarItemVenda(item3);
        venda1.adicionarItemVenda(item4);

        venda1.listarItensVendas();
    }
}
