import java.util.Scanner;

public class Ex2_6{//Calcula o produto de 3 inteiros
    public static void main(String[] args){
        int x, y, z, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro inteiro: ");
        x = input.nextInt();

        System.out.print("Digite o segundo inteiro: ");
        y = input.nextInt();

        System.out.print("Digite o terceiro inteiro: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("O produto é %d", result);
    }
}