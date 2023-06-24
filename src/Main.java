import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String tipoConta;
        float saldo = 0.0f;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        while (nome.isEmpty()) {
            System.out.println("Digite o seu nome!!");
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();
        }

        System.out.print("1 - Conta Corrente ou 2 - Conta Poupança\nEscolha seu tipo de conta: ");
        byte opcao = entrada.nextByte();

        while (opcao != 1 && opcao != 2) {
            System.out.println("Digite somente 1 ou 2!!");
            System.out.print("1 - Conta Corrente ou 2 - Conta Poupança\nEscolha seu tipo de conta: ");
            opcao = entrada.nextByte();
        }

        if (opcao == 1) {
            tipoConta = "Conta Corrente";
        } else {
            tipoConta = "Conta Poupança";
        }

        String informacoes = """
                --------------------|Safe|--------------------
                Suas informações
                Nome: %s
                Tipo de Conta: %s
                Saldo inicial: R$ %.2f
                ----------------------------------------------
                """.formatted(nome, tipoConta, saldo);
        System.out.println(informacoes);

        do {
            String menu = """
                    \n1 - Consultar saldo
                    2 - Receber transferência
                    3 - Transferir valor
                    4 - Sair
                    """;
            System.out.println(menu);

            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextByte();

            switch (opcao) {
                    case 1:
                        System.out.printf("Saldo Atual: R$ %.2f", saldo);
                    break;

                    case 2:
                        System.out.print("Digite o valor a receber: R$ ");
                        float valorReceber = entrada.nextFloat();

                        while (valorReceber <= 0.0) {
                            System.out.println("Valor inválido!!");
                            System.out.print("Digite o valor a receber: R$ ");
                            valorReceber = entrada.nextFloat();
                        }

                        saldo += valorReceber;
                        System.out.printf("Valor Recebido: R$ %.2f", valorReceber);
                    break;

                    case 3:
                        System.out.print("Digite o valor a ser transferido: R$ ");
                        float valorTransferir = entrada.nextFloat();

                        while (valorTransferir <= 0.0 || valorTransferir > saldo) {
                            System.out.println("Valor inválido ou saldo insuficiente");
                            System.out.print("\nDigite o valor a ser transferido: R$ ");
                            valorTransferir = entrada.nextFloat();
                        }

                        saldo -= valorTransferir;
                        System.out.printf("Valor Transferido: R$ %.2f", valorTransferir);
                    break;

                    case 4:
                        System.out.println("Programa finalizado.");
                    break;

                    default:
                        System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}