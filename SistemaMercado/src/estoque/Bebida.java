package estoque;

class Bebida extends ProdutosGerais {
    private double medidaML;

    public Bebida(String nomeProduto, double ml, double valorProduto, double quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.medidaML = ml;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getMedidaML() { return medidaML; }

    @Override
    public String toString() {
        return String.format("Bebida: Nome=%s, ML=%.2f, Valor=%.2f, Quantidade=%.2f",
                nomeProduto, medidaML, valorProduto, quantidadeProduto);
    }
}
