import java.util.Scanner;

public class Ex2_24 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, maior = 0, menor = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros: ");
        num1 = input.nextInt(); 
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
            maior = num1;
        } else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
            maior = num2;
        } else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
            maior = num3;
        } else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
            maior = num4;
        } else if (num5>num1 && num5>num2 && num5>num3 && num5>num4) {
            maior = num5;   
        }
        if (num1<num2 && num1<num3 && num1<num4 && num1<num5) {
            menor = num1;
        } else if (num2<num1 && num2<num3 && num2<num4 && num2<num5) {
            menor = num2;
        } else if (num3<num1 && num3<num2 && num3<num4 && num3<num5) {
            menor = num3;
        } else if (num4<num1 && num4<num2 && num4<num3 && num4<num5) {
            menor = num4;
        } else if (num5<num1 && num5<num2 && num5<num3 && num5<num4) {
            menor = num5;   
        }
        System.out.printf("Maior: %d%n",  maior);
        System.out.printf("Menor: %d%n", menor);
    }
}