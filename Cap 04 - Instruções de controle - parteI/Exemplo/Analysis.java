//Analise de redultados do exame utilizando instruções de controle

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Inicialização de variáveis
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        //Processamento de 10 alunos utilizando um loop controlado por contador
        while(studentCounter <= 10) {
            System.out.print("Digite o resultado do exame (1 = aprovado, 2 = reprovado): ");
            int result = input.nextInt();

            //Verificação do resultado do exame utilizando uma estrutura de controle if-else
            if (result == 1) {
                passes++;
            } else if (result == 2) {
                failures++;
            } else {
                System.out.println("Entrada inválida. Por favor, digite 1 ou 2.");
                continue; // Pula para a próxima iteração do loop
            }

            studentCounter++; // Incrementa o contador de alunos
        }

        //Fase de terminno: prepaara e exibe os resultados
        System.out.println("Número de alunos aprovados: " + passes);
        System.out.println("Número de alunos reprovados: " + failures);

        //determina se mais de 8 alunos foram aprovados
        if (passes > 8) {
            System.out.println("Bonus para o instrutor!");
        }
        input.close();

    }
}
