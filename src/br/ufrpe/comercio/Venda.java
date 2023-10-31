package br.ufrpe.comercio;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private LocalDateTime data;
    private String atendente;
    private List<ItemVenda> itensDeVenda;
    private Cliente vendidoA;

    public Venda(LocalDateTime data, String atendente, Cliente vendidoA) {
        this.data = data;
        this.atendente = atendente;
        this.itensDeVenda = new ArrayList<>();
        this.vendidoA = vendidoA;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public List<ItemVenda> getItensDeVenda() {
        return itensDeVenda;
    }

    public void setItensDeVenda(List<ItemVenda> itensDeVenda) {
        this.itensDeVenda = itensDeVenda;
    }

    public Cliente getVendidoA() {
        return vendidoA;
    }

    public void setVendidoA(Cliente vendidoA) {
        this.vendidoA = vendidoA;
    }
    public void adicionarItemVenda(ItemVenda item){
        this.itensDeVenda.add(item);
    }
    public double calcularTotal(){
        double total = 0.0;
        for (ItemVenda item:itensDeVenda){
            total+=item.calcularTotal();
        }
        return total;
    }
    public void listarItensVendas(){
        System.out.printf("Data da Venda: %d/%d/%d%n",this.data.getDayOfMonth(),this.data.getMonthValue(),
                this.data.getYear());
        System.out.printf("Cliente: %s | CPF: %s | idade: %d%n",this.vendidoA.getNome(),this.vendidoA.getCpf(),
                this.vendidoA.calcularIdade());
        System.out.printf("Atendente: %s%n", this.atendente);
        System.out.println("Nome do produto | Preço      | Quantidade | Total");
        System.out.println("-----------------------------------------------------");
        for (ItemVenda atual : itensDeVenda){
            System.out.printf("%s      |   R$ %5.2f |%11d | R$ %.2f%n",atual.getProdutoVendido().getNome(),
                    atual.getProdutoVendido().getPreco(), atual.getQuantidade(), atual.calcularTotal());
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Total da Venda: \t\t\t               R$ %.2f", calcularTotal());
    }
}
