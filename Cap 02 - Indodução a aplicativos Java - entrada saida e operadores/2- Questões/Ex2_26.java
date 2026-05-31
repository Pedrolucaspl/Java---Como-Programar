import java.util.Scanner;

public class Ex2_26 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = input.nextInt();

        if (num1%num2 == 0) {
            System.out.printf("%d é múltiplo de %d%n", num1, num2);
        }
        if (num1%num2 != 0) {
            System.out.printf("%d não é múltiplo de %d%n", num1, num2);
        }
    }
}
