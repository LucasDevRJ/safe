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

        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber transferência");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.print("Digite a opção desejada: ");
        opcao = entrada.nextByte();

        switch (opcao) {
                case 1:
                    consultaSaldo(saldo);
                    System.out.printf("\nSaldo: R$ %.2f", consultaSaldo(saldo));
                break;

                case 2:
                    System.out.print("\nDigite o valor a receber: R$ ");
                    float valorReceber = entrada.nextFloat();

                    System.out.printf("Saldo Atual: R$ %.2f", recebeTransferencia(saldo, valorReceber));
                break;
        }
    }

    public static float consultaSaldo(float saldo) {
        return saldo;
    }

    public static float recebeTransferencia(float saldo, float valorReceber) {
        System.out.println("\nValor transferido com sucesso!");
        return saldo += valorReceber;
    }
}
