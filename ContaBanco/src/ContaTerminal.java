import java.util.Scanner;

public class ContaTerminal {
    private static final Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o número da conta: ");
        int accountNumber = Integer.parseInt(INPUT.nextLine());

        System.out.println("Número da agência: ");
        String agencyNumber = INPUT.nextLine();

        System.out.println("Nome e sobrenome do cliente: ");
        String clientName = INPUT.nextLine();

        System.out.println("Saldo da conta: ");
        double balance = Double.parseDouble(INPUT.nextLine());

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", clientName, agencyNumber, accountNumber, balance));
    }
}