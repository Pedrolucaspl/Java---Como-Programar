//Entrada e saída de números de ponto flutuante com objetos Account

import java.util.Scanner;
public class AccountTest315 {
    public static void main(String[] args) {
        Account315 account1 = new Account315("Jane Green", 50.00);
        Account315 account2 = new Account315("John Blue", -7.53);

        //Exibe o saldo inicial de cada objeto Account
       displayAccount(account1);
       displayAccount(account2);

        //Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); //Prompt
        double depositAmount = input.nextDouble(); //Obtém a entrada do usuário
        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); //Adiciona o saldo de account1

        //Exibe o saldo de cada objeto Account
       displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: "); //Prompt
        depositAmount = input.nextDouble(); //Obtém a entrada do usuário
        System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); //Adiciona o saldo de account2

        //Exibe o saldo de cada objeto Account
        displayAccount(account1);
        displayAccount(account2);
        input.close();
                
    }//fim do método main
    public static void displayAccount(Account315 accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}//fim da classe AccountTest
