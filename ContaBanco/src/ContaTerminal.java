import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("***SIMULANDO UMA CONTA DE BANCO***\n\n");

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("\nDigite o dígito da conta: ");
        int dig = scanner.nextInt();

        System.out.println("\nDigite o numero da Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();
        System.out.println("\nDigite seu nome completo");
        String nomeCliente = scanner.nextLine();

        System.out.println("\nDigite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        
        
        System.out.println("\n\n\nOlá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", dig "+ dig +" e seu saldo R$" + saldo + " já está disponível para saque." );






    }
}
