package programa;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import classes.Produto;
import classes.Vendas;

public class Menu {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        int MAX_ELEMENTOS = 5;
        int opcao, quantidadeEstoque = 0;
        Produto [] produtos = new Produto[MAX_ELEMENTOS];
        Vendas vendas = new Vendas();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Listagem de produtos");
            System.out.println("3 - Consultar produto pelo código");
            System.out.println("4 - Vendas por período");
            System.out.println("5 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {
            {
                Vendas ven = new Vendas ();
                Produto pro = new Produto();
                System.out.print("Nome: ");
                pro.setNome(in.nextLine());

                System.out.print("Código: ");
                pro.setCodigo(in.nextLine());

                System.out.print("Valor: ");
                pro.setValor(in.nextInt());

                System.out.print("Informe a quantidade em estoque: ");
                ven.setQuantidadeEstoque(in.nextInt());
            } 
                produtos[quantidadeEstoque] = pro;
                quantidadeEstoque = quantidadeEstoque + 1;

                System.out.println("\nProduto incluído com sucesso.");
                voltarMenu(in);

            } else if (opcao == 2) {
                if (quantidadeEstoque == 0) {
                    System.out.println("\nNão há produtos listados para exibir.");
                    voltarMenu(in);
                    continue;
                }
                System.out.println("\nMOTORISTAS CADASTRADOS:");
                System.out.println("***********************");

                for (int i = 0; i < quantidadeEstoque; i++) {
                    exibirProduto(produtos[i]);
                }

                voltarMenu(in);
            } else if (opcao == 3) {
                if (quantidadeEstoque == 0) {
                    System.out.println("\nNão há produtos listados para exibir.");
                    voltarMenu(in);
                    continue;
                }
                System.out.print("\nInsira o código para consultar o produto: ");
                String codigo = in.nextLine();
            }
            Produto buscarProduto = null;
                for (int i = 0; buscarProduto == null && i < quantidadeEstoque; i++) {
                    if (codigo.equals(produtos[i].getCodigo())) {
                        buscarProduto = produtos[i];
                    }
                }

                if (buscarProduto == null) {
                    System.out.println("Produto não localizado!");
                } else {
                    System.out.println("Produto localizado:");
                    exibirProduto(buscarProduto);
                }

                voltarMenu(in);
                else if (opcao == 4) {
                    
                    System.out.print("Insira o horário de consulta ao relatório de vendas: ");
                    public int emissao (in.nextInt());

                    System.out.println("RELATÓRIO DE VENDAS\n");
                    System.out.printf("Data de emissão: %s\n", emissao);
                    System.out.printf("Data da venda: %s\n", vendas.getDataDaVenda());
                    System.out.printf("Nome do produto: %s\n", vendas.getProdutoVendido());
                    System.out.printf("Quantidade: %s\n", vendas.getQuantidadeVendida());
                    System.out.printf("Valor do produto: %s\n", vendas.getValorProdutovendido());
                    System.out.printf("Valor total: %s\n", vendas.getValorTotal ());
                    System.out.printf("Valor médio de vendas por período: %s\n", vendas.getVendasPorPeriodo ());
                } 
                else if (opcao == 5){
                    System.out.println("Nome do produto comprado: ");
                    vendas.setProdutoVendido(in.nextLine());

                    System.out.println("Data da venda: ");
                    vendas.setDataDaVenda(in.nextLine());

                    System.out.println("Quantidade do produto comprado: ");
                    vendas.setQuantidadeVendida(in.nextInt());

                    System.out.println("Valor do produto: ");
                    vendas.setValorProdutoVendido(in.nextInt());
                }
        
    private static void voltarMenu(Scanner in) throws InterruptedException, IOException; {
    System.out.println("\nPressione ENTER para voltar ao menu.");
    in.nextLine();
            
    if (System.getProperty("os.name").contains("Windows"))
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
    System.out.print("\033[H\033[2J");
            
    System.out.flush();
    }

    private static void exibirProduto(Produto produto) {

        System.out.printf("\nLISTAGEM DE PRODUTOS\n");
        System.out.printf("Nome do produto: %s\n", produto.getNome());
        System.out.printf("Código: %s\n", produto.getCodigo());
        System.out.printf("Valor: %s\n", produto.getValor());
        System.out.printf("Estoque: %s\n", vendas.getQuantidadeEstoque());
    }
       

         } while (opcao != 0);

System.out.println("Fim do programa!");

in.close();
   }
}
