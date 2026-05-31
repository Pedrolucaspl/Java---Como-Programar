import java.util.Scanner;

public class Ex2_28 {
    public static void main(String[] args) {
        int raio;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = input.nextInt();

        System.out.printf("Diâmetro: %d%n", 2*raio);
        System.out.printf("Circunferência: %.2f%n", 2*Math.PI*raio);
        System.out.printf("Área: %.2f%n", Math.PI*raio*raio);
    }
}
