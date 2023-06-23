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

        System.out.println("--------------------|Safe|--------------------");
        System.out.println("\t\t\t\tSuas informações");
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nTipo de Conta: %s", tipoConta);
        System.out.printf("\nSaldo inicial: R$ %.2f", saldo);
        System.out.println("\n----------------------------------------------");

        do {
            System.out.println("\n\n1 - Consultar saldo");
            System.out.println("2 - Receber transferência");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextByte();

            switch (opcao) {
                    case 1:
                        System.out.printf("\nSaldo Atual: R$ %.2f", saldo);
                    break;

                    case 2:
                        System.out.print("\nDigite o valor a receber: R$ ");
                        float valorReceber = entrada.nextFloat();
                        saldo += valorReceber;
                        System.out.printf("Valor Recebido: R$ %.2f", valorReceber);
                    break;

                    case 3:
                        System.out.print("\nDigite o valor a ser transferido: R$ ");
                        float valorTransferir = entrada.nextFloat();
                        saldo -= valorTransferir;
                        System.out.printf("Valor Transferido: R$ %.2f", valorTransferir);
                    break;

                    case 4:
                        System.out.println("\nPrograma finalizado.");
                    break;

                    default:
                        System.out.print("Opção inválida!");
            }
        } while (opcao != 4);
    }
}