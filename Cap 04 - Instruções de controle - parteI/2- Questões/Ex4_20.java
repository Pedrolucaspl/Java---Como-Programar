import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int empregado = 1; empregado <= 3; empregado++) {
            System.out.printf("Empregado %d%n", empregado);
            System.out.print("Digite o nome do empregado: ");
            String nome = input.nextLine();

            System.out.print("Digite o número de horas trabalhadas: ");
            double horasTrabalhadas = input.nextDouble();

            System.out.print("Digite o salário por hora: ");
            double salarioHora = input.nextDouble();
            input.nextLine();

            double salarioBruto;

            if (horasTrabalhadas <= 40) {
                salarioBruto = horasTrabalhadas * salarioHora;
            } else {
                double horasExtras = horasTrabalhadas - 40;
                salarioBruto = (40 * salarioHora) + (horasExtras * salarioHora * 1.5);
            }

            System.out.printf("Salário bruto de %s: R$ %.2f%n%n", nome, salarioBruto);
        }

        input.close();
    }
}