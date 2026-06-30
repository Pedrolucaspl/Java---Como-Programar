import java.util.Scanner;

public class Ex4_23 {
    public static void main(String[] args) {
        int num;
        int maior=0;
        int segundoMaior=0;

        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = input.nextInt();

            if(num>maior) {
                segundoMaior = maior;
                maior = num;
            } else if(num>segundoMaior) {
                segundoMaior = num;
            }
        }
        System.out.printf("O maior número digitado foi: %d%n", maior);
        System.out.printf("O segundo maior número digitado foi: %d%n", segundoMaior);
        input.close();
    }

    
}
