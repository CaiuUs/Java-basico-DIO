import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt(); sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
