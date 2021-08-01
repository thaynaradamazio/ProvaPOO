package classes;

public class Vendas{
    private String dataDaVenda;
    private String produtoVendido;
    private int quantidadeVendida;
    private int quantidadeEstoque;
    public double valorProdutoVendido;


    public String getDataDaVenda() {
        return dataDaVenda;
    }
    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
    public String getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public double valorTotal = (quantidadeVendida * valorProdutoVendido);
    public int vendasPorPeriodo = (quantidadeVendida / 2);
    }

    public double getValorProdutovendido() {
        return valorProdutoVendido;
    }

    public void setValorProdutovendido(double valorProdutovendido) {
        this.valorProdutoVendido = valorProdutovendido;
    }

    public double getValorProdutoVendido() {
        return valorProdutoVendido;
    }

    public void setValorProdutoVendido(double valorProdutoVendido) {
        this.valorProdutoVendido = valorProdutoVendido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}   

