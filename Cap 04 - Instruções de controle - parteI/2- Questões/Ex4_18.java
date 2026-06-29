import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        int numeroConta, saldoInicioMes, saldoFinal, totalCreditosMes, totalDebitosMes, limiteCredito;
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (i !=1) {
            System.out.print("Digite o número da conta (-1 para encerrar): ");
            numeroConta = input.nextInt();
            if (numeroConta == -1) {
                break;
            }

            System.out.print("Digite o saldo no início do mês: ");
            saldoInicioMes = input.nextInt();

            System.out.print("Digite o total de créditos do mês: ");
            totalCreditosMes = input.nextInt();

            System.out.print("Digite o total de débitos do mês: ");
            totalDebitosMes = input.nextInt();

            System.out.print("Digite o limite de crédito da conta: ");
            limiteCredito = input.nextInt();

            saldoFinal = saldoInicioMes + totalCreditosMes - totalDebitosMes;

            System.out.printf("O saldo final da conta %d é: %d%n", numeroConta, saldoFinal);
            System.out.printf("O limite atual da conta %d é: %d%n", numeroConta, (limiteCredito+saldoFinal)

            );
            if ((saldoFinal * -1) > limiteCredito) {
                System.out.println("Limite de crédito excedido.");
            }
        }
        input.close();

    }
}
