import java.util.Scanner;
public class Ex4_17 {
    public static void main(String[] args) {
        int km, totalKm = 0;
        int litros, totalLitros = 0;
        double consumo;

        Scanner input = new Scanner(System.in);
        for(int i=0; i!= -1; ) {
            System.out.print("Digite a quantidade de quilômetros percorridos: ");
            km = input.nextInt();

            System.out.print("Digite a quantidade de litros consumidos: ");
            litros = input.nextInt();

            totalKm += km;
            totalLitros += litros;

            consumo = (double) km / litros;
            System.out.printf("O consumo do veículo foi de %.2f km/l%n", consumo);

            System.out.printf("\nO total de quilômetros percorridos foi: %d km%n", totalKm);
            System.out.printf("O total de litros consumidos foi: %d l%n", totalLitros);
            
            System.out.print("\nDigite -1 para encerrar ou qualquer outro número para continuar: \n");
            i = input.nextInt();

            
        }
       
        input.close();
    }

    
}
