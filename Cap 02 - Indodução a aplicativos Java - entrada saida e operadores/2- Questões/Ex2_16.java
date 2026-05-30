import java.util.Scanner;

public class Ex2_16 {
    public static void main(String[] args) {
        
        int num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o primeiro inteiro:");
        num1 = input.nextInt();

        System.out.println("Entre com o segundo inteiro:");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d é maior que %d%n", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%d é maior que %d%n", num2, num1);
        } else {
            System.out.println("Os números são iguais.");
        }
        input.close();
    }
}
