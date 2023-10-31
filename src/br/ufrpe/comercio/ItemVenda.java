package br.ufrpe.comercio;

public class ItemVenda {
    private int quantidade;
    private Produto produtoVendido;

    public ItemVenda(int quantidade, Produto produtoVendido) {
        this.quantidade = quantidade;
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public double calcularTotal(){
        return produtoVendido.getPreco()*quantidade;
    }
}
