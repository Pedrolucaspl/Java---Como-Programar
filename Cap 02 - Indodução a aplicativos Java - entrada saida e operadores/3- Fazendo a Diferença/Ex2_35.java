import java.util.Scanner;

public class Ex2_35 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double kmDia;
		double precoGasolina;
		double kmPorLitro;
		double estacionamento;
		double pedagio;

		System.out.println("=== Calculadora de Economia da Faixa Solidária ===");

		System.out.print("Quilômetros dirigidos por dia: ");
		kmDia = input.nextDouble();

		System.out.print("Preço da gasolina por litro: ");
		precoGasolina = input.nextDouble();

		System.out.print("Quilômetros por litro do veículo: ");
		kmPorLitro = input.nextDouble();

		System.out.print("Gasto diário com estacionamento: ");
		estacionamento = input.nextDouble();

		System.out.print("Gasto diário com pedágio: ");
		pedagio = input.nextDouble();

		double custoCombustivel = (kmDia / kmPorLitro) * precoGasolina;
		double custoTotal = custoCombustivel + estacionamento + pedagio;

		System.out.printf("%nCusto do combustível: R$ %.2f%n", custoCombustivel);
		System.out.printf("Custo total diário: R$ %.2f%n", custoTotal);

		input.close();
	}
}
