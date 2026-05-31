import java.util.Scanner;

public class Ex2_32 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, negativo=0, positivo=0, zero=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();     
        num4 = input.nextInt();
        num5 = input.nextInt();

        if (num1>0) {
            positivo=positivo+1;
        }
        if (num1<0) {
            negativo=negativo+1;
        }
        if (num1==0) {
            zero=zero+1;
        }
        if (num2>0) {
            positivo=positivo+1;
        }
        if (num2<0) {
            negativo=negativo+1;
        }
        if (num2==0) {
            zero=zero+1;
        }
        if (num3>0) {
            positivo=positivo+1;
        }
        if (num3<0) {
            negativo=negativo+1;
        }
        if (num3==0) {
            zero=zero+1;
        }
        if (num4>0) {
            positivo=positivo+1;
        }
        if (num4<0) {
            negativo=negativo+1;
        }
        if (num4==0) {
            zero=zero+1;
        }
        if (num5>0) {
            positivo=positivo+1;
        }
        if (num5<0) {
            negativo=negativo+1;
        }
        if (num5==0) {
            zero=zero+1;
        }
        System.out.printf("Positivos: %d%n", positivo);
        System.out.printf("Negativos: %d%n", negativo);
        System.out.printf("Zeros: %d%n", zero);
    }
}