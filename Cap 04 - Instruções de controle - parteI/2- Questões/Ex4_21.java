import java.util.Scanner;

public class Ex4_21 {
    public static void main(String[] args) {
        int counter = 1;
        int number = 0;
        int largest = 0;
        Scanner input = new Scanner(System.in);

        while (counter<=10) {
            System.out.printf("Digite o %dº número: ",counter++);
            number=input.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        System.out.printf("O maior número digitado foi: %d%n", largest);
        input.close();
    }
}
