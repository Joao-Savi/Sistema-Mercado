package estoque;

public abstract class ProdutosGerais {
    protected String nomeProduto;
    protected double valorProduto;
    protected double quantidadeProduto;

    public String getNomeProduto() { return nomeProduto; }
    public double getValorProduto() { return valorProduto; }
    public double getQuantidadeProduto() { return quantidadeProduto; }

    @Override
    public abstract String toString();
}

