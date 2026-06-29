import java.util.Scanner;

public class Ex4_19 {
    public static void main(String[] args) {
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        int unidades1, unidades2, unidades3, unidades4;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite o número de unidades vendidas do item 1: ");
        unidades1 = input.nextInt();

        System.out.printf("Digite o número de unidades vendidas do item 2: ");
        unidades2 = input.nextInt();

        System.out.printf("Digite o número de unidades vendidas do item 3: ");
        unidades3 = input.nextInt();

        System.out.printf("Digite o número de unidades vendidas do item 4: ");
        unidades4 = input.nextInt();

        double totalVendas = (item1 * unidades1) + (item2 * unidades2) + (item3 * unidades3) + (item4 * unidades4);
        double comissao = totalVendas * 0.09;
        double salarioBase = 200.00;
        double salarioTotal = salarioBase + comissao;

        System.out.printf("Salário total: %.2f%n", salarioTotal);
        input.close();
        
    }
}
