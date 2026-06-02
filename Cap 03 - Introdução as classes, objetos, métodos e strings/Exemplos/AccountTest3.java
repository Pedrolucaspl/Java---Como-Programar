//Entrada e saída de números de ponto flutuante com objetos Account

import java.util.Scanner;

public class AccountTest3 {
    public static void main(String[] args) {
        Account3 account1 = new Account3("Jane Green", 50.00);
        Account3 account2 = new Account3("John Blue", -7.53);

        //Exibe o saldo inicial de cada objeto Account
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        //Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); //Prompt
        double depositAmount = input.nextDouble(); //Obtém a entrada do usuário
        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); //Adiciona o saldo de account1

        //Exibe o saldo de cada objeto Account
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); //Prompt
        depositAmount = input.nextDouble(); //Obtém a entrada do usuário
        System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); //Adiciona o saldo de account2

        //Exibe o saldo de cada objeto Account
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
        input.close();
                
    }//fim do método main
}//fim da classe AccountTest3
