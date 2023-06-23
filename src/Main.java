import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String tipoConta;
        float saldo;

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

        System.out.println("--------------------|Safe|--------------------");
        System.out.println("\t\t\t\tSuas informações");
        System.out.println("Nome: ");
        System.out.println("Tipo de Conta: ");
        System.out.println("Saldo inicial: ");
        System.out.println("----------------------------------------------");
    }
}
