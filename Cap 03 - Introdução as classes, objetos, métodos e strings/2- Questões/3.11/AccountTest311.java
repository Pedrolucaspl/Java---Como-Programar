// Figura 3.9: AccountTest.Java
// Entrada e saída de números de ponto flutuante com objetos Account.
import java.util.Scanner;

public class AccountTest311
{
   public static void main(String[] args)
   {
    Account311 account1 = new Account311("Jane Green", 50.00);
    Account311 account2 = new Account311("John Blue", -7.53);

    // exibe saldo inicial de cada objeto
    System.out.printf("%s balance: $%.2f%n",
        account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f%n%n",
        account2.getName(), account2.getBalance());

    // cria um Scanner para obter entrada a partir da janela de comando
    Scanner input = new Scanner(System.in);
    System.out.print("Enter withdrawal amount for account1: "); // prompt   
    double withdrawAmount = input.nextDouble(); // obtém a entrada do usuário
    System.out.printf("%nWithdrawing %.2f from account1 balance%n%n",
        withdrawAmount);
    account1.withdraw(withdrawAmount); // subtrai do saldo de account1
    // exibe os saldos
    System.out.printf("%s balance: $%.2f%n",
        account1.getName(), account1.getBalance());
    input.close();
    
   } // fim de main
} // fim da classe AccountTest
