import java.util.Scanner;

public class Ex2_33{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura=1, imc=1;

        System.out.println("=== Calculadora de IMC ===");
        System.out.print("Digite seu peso em kg: ");
        peso = input.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        altura = input.nextDouble();

        imc = peso/(altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } 
        if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } 
        if (imc >= 30) {
            System.out.println("Obesidade");
        }

        input.close();
    }
}
