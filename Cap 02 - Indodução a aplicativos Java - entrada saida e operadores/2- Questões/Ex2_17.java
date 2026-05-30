import java.util.Scanner;

public class Ex2_17 {
    public static void main(String[] args) {
        int num1, num2, num3, soma, media, produto, maior, menor;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o primeiro inteiro:");
        num1 = input.nextInt();

        System.out.println("Entre com o segundo inteiro:");
        num2 = input.nextInt();

        System.out.println("Entre com o terceiro inteiro:");
        num3 = input.nextInt();

        soma = num1 + num2 + num3;
        media = soma / 3;
        produto = num1 * num2 * num3;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.printf("A soma dos números é: %d%n", soma);
        System.out.printf("A média dos números é: %d%n", media);
        System.out.printf("O produto dos números é: %d%n", produto);
        System.out.printf("O maior número é: %d%n", maior);
        System.out.printf("O menor número é: %d%n", menor);
        input.close();
    }
}
