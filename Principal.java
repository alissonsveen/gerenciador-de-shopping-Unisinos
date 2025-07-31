import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        Data dataReferencia = new Data(20, 10, 2023);
        String opcao = "";

        while (!opcao.equals("3")) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Criar Loja");
            System.out.println("2 - Criar Produto");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = menu.nextLine();

            switch (opcao) {
                case "1":
                    loja = criarLoja(menu);
                    break;
                case "2":
                    produto = criarProduto(menu);
                    break;
                case "3":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (loja != null && produto != null) {
                System.out.println("\n--- RESULTADO ---");
                System.out.println(produto.estaVencido(dataReferencia)
                        ? "PRODUTO VENCIDO"
                        : "PRODUTO NÃO VENCIDO");
                System.out.println("\nInformações da loja:");
                System.out.println(loja);
                break;
            }
        }
    }

    public static Loja criarLoja(Scanner scanner) {
        System.out.println("\n--- Criando uma loja ---");

        System.out.print("Nome da loja: ");
        String nome = scanner.nextLine();

        int quantidadeFuncionarios = lerInt(scanner, "Quantidade de funcionários: ");
        double salarioBaseFuncionario = lerDouble(scanner, "Salário base dos funcionários (Digite -1 caso não tenha): ");

        System.out.println("\nEndereço da loja:");
        System.out.print("Nome da rua: ");
        String nomeDaRua = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        System.out.println("\nData de fundação:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Data dataFundacao = new Data(dia, mes, ano);

        System.out.print("Tamanho do estoque de produtos: ");
        int tamanhoEstoque = Integer.parseInt(scanner.nextLine());

        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
    }

    public static Produto criarProduto(Scanner scanner) {
        System.out.println("\n--- Criando um produto ---");

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("\nData de validade:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Data dataValidade = new Data(dia, mes, ano);

        return new Produto(nome, preco, dataValidade);
    }

    public static int lerInt(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            }
        }
    }


    public static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número decimal (use ponto para casas decimais).");
            }
        }
    }

}
