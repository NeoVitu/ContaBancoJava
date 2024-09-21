import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Entrada de dados
        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        // Saída de dados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque.");

        scanner.close();
    }
}