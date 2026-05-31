import java.util.Scanner;

public class Ex2_30 {
    public static void main(String[] args) {
        int num1, unidade, dezena, centena, milhar, dezMilhar;
       Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 5 dígitos: ");
        int num = input.nextInt();

        unidade = num%10;
        dezena = (num/10)%10;
        centena = (num/100)%10;
        milhar = (num/1000)%10;
        dezMilhar = (num/10000)%10;
        if(num<10000 || num>99999) {
            System.out.println("Número inválido!");
        }if (num>=10000 && num<=99999) {
            System.out.printf("%d   %d   %d   %d   %d%n", dezMilhar, milhar, centena, dezena, unidade);
        }
        
    }
}
