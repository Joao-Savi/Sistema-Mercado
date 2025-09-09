package estoque;

import java.util.ArrayList;
import java.util.List;

public class RegistroEstoque {
    private List<ProdutosGerais> produtos = new ArrayList<>();

    // --- Cadastro genérico ---
    private void cadastrarProduto(ProdutosGerais produto) {
        produtos.add(produto);
        System.out.println("✅ Produto cadastrado: " + produto);
    }

    // --- Fábricas públicas ---
    public void cadastrarBebida(String nome, double ml, double valor, double quantidade) {
        cadastrarProduto(new Bebida(nome, ml, valor, quantidade));
    }

    public void cadastrarAlimentoPerecivel(String nome, double peso, double valor, double quantidade, String validade) {
        cadastrarProduto(new AlimentoPerecivel(nome, peso, valor, quantidade, validade));
    }

    public void cadastrarProdutoNaoPerecivel(String nome, double valor, double quantidade, String categoria) {
        cadastrarProduto(new ProdutoNaoPerecivel(nome, valor, quantidade, categoria));
    }

    // --- Busca ---
    public ProdutosGerais buscarProduto(String nomeProduto) {
        for (ProdutosGerais p : produtos) {
            if (p.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                return p;
            }
        }
        return null;
    }

    // --- Listagem ---
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("📦 Nenhum produto cadastrado no estoque.");
        } else {
            System.out.println("📋 Produtos no estoque:");
            for (ProdutosGerais p : produtos) {
                System.out.println(p);
            }
        }
    }
}
