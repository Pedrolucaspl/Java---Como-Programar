import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        int c, thisIsAVariable, q76354, number; // resposta da letra a
        int value;

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um inteiro:"); // resposta da letra b
        value = input.nextInt();//resposta da letra c

        System.out.println("This is a Java Program."); // resposta da letra d

        System.out.printf("%s%n%s%n", "This is a Java", "Program"); // resposta da letra e

        if (value != 7) {
            System.out.println("The value is not 7");
        }

        input.close();
    }
    
}
