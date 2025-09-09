package estoque;

class AlimentoPerecivel extends ProdutosGerais {
    private String validade;
    private double peso;

    public AlimentoPerecivel(String nomeProduto, double peso, double valorProduto, double quantidadeProduto, String validade) {
        this.nomeProduto = nomeProduto;
        this.peso = peso;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.validade = validade;
    }

    public String getValidade() { return validade; }
    public double getPeso() { return peso; }

    @Override
    public String toString() {
        return String.format("Alimento Perecível: Nome=%s, Peso=%.2fkg, Valor=%.2f, Quantidade=%.2f, Validade=%s",
                nomeProduto, peso, valorProduto, quantidadeProduto, validade);
    }
}
