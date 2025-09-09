package application;

import estoque.*;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

    public static void executar() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        RegistroEstoque estoque = new RegistroEstoque();

        int numero;

        do {
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1 - Registrar bebida");
            System.out.println("2 - Registrar alimento perecível");
            System.out.println("3 - Registrar produto não perecível");
            System.out.println("4 - Buscar produto por nome");
            System.out.println("5 - Listar todos os produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            numero = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (numero) {
                case 1:
                    System.out.println("Digite o nome da bebida: ");
                    String nomeB = sc.nextLine();
                    System.out.println("Digite a medida em ML: ");
                    double ml = sc.nextDouble();
                    System.out.println("Digite o valor da bebida: ");
                    double valorB = sc.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    double qtdB = sc.nextDouble();
                    estoque.cadastrarBebida(nomeB, ml, valorB, qtdB);
                    break;

                case 2:
                    System.out.println("Digite o nome do alimento perecível: ");
                    String nomeA = sc.nextLine();
                    System.out.println("Digite o peso (kg): ");
                    double peso = sc.nextDouble();
                    System.out.println("Digite o valor do alimento: ");
                    double valorA = sc.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    double qtdA = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a validade (ex: 12/09/2025): ");
                    String validade = sc.nextLine();
                    estoque.cadastrarAlimentoPerecivel(nomeA, peso, valorA, qtdA, validade);
                    break;

                case 3:
                    System.out.println("Digite o nome do produto não perecível: ");
                    String nomeNP = sc.nextLine();
                    System.out.println("Digite o valor: ");
                    double valorNP = sc.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    double qtdNP = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a categoria (ex: limpeza, higiene, utensílios): ");
                    String categoria = sc.nextLine();
                    estoque.cadastrarProdutoNaoPerecivel(nomeNP, valorNP, qtdNP, categoria);
                    break;

                case 4:
                    System.out.println("Digite o nome do produto para buscar: ");
                    String nomeBusca = sc.nextLine();
                    ProdutosGerais encontrado = estoque.buscarProduto(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("🔎 Encontrado: " + encontrado);
                    } else {
                        System.out.println("❌ Produto não encontrado.");
                    }
                    break;

                case 5:
                    estoque.listarProdutos();
                    break;

                case 0:
                    System.out.println("👋 Saindo...");
                    break;

                default:
                    System.out.println("⚠ Opção inválida!");
            }
        } while (numero != 0);

        sc.close();
    }
}
