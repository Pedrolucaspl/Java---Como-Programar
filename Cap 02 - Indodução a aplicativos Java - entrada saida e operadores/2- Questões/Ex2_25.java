import java.util.Scanner;

public class Ex2_25 {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        num = input.nextInt();

        if (num%2 == 0) {
            System.out.printf("%d é par%n", num);
        } 
        if (num%2 != 0){
            System.out.printf("%d é ímpar%n", num);
        }
    }
    
}
