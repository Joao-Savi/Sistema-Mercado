package estoque;

class ProdutoNaoPerecivel extends ProdutosGerais {
    private String categoria; // exemplo: limpeza, higiene, material escolar

    public ProdutoNaoPerecivel(String nomeProduto, double valorProduto, double quantidadeProduto, String categoria) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return String.format("Produto Não Perecível: Nome=%s, Categoria=%s, Valor=%.2f, Quantidade=%.2f",
                nomeProduto, categoria, valorProduto, quantidadeProduto);
    }
}
