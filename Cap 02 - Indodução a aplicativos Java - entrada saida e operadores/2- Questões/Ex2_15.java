import java.util.Scanner;

public class Ex2_15 {
    public static void main(String[] args) {
    int num1, num2, soma, subtracao, multiplicacao, divisao;

    Scanner input = new Scanner(System.in);

    System.out.println("Entre com o primeiro inteiro:");
    num1 = input.nextInt();

    System.out.println("Entre com o segundo inteiro:");
    num2 = input.nextInt();

    soma = num1 + num2;
    subtracao = num1 - num2;
    multiplicacao = num1 * num2;
    divisao = num1 / num2;

    System.out.printf("A soma de %d e %d é: %d%n", num1, num2, soma);
    System.out.printf("A subtração de %d e %d é: %d%n", num1, num2, subtracao);
    System.out.printf("A multiplicação de %d e %d é: %d%n", num1, num2, multiplicacao);
    System.out.printf("A divisão de %d e %d é: %d%n", num1, num2, divisao);
    input.close();
    }
}
