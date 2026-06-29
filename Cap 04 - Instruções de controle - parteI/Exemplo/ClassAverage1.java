//Resolvendo o problema de média da classe usando a repetição controlada por sentinela
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ClassAverage1 {
    public static void main(String[] args) {
        //Cria um Scanner para obter entrada a partir do usuário
        Scanner input = new Scanner(System.in);

        //Fase de inicialização
        int total = 0; //Soma dos valores inseridos
        int gradeCounter = 0; //Número de notas inseridas

        // fase de processamento utiliza repetição controlada por sentinela
        System.out.print("Enter grade or -1 to quit: "); //Solicita ao usuário que insira uma nota ou -1 para sair
        int grade = input.nextInt(); //Lê a nota inserida pelo usuário

        while (grade != -1) {
            total = total + grade; //Adiciona a nota ao total
            gradeCounter = gradeCounter + 1; //Incrementa o contador de notas

            System.out.print("Enter grade or -1 to quit: "); //Solicita ao usuário que insira uma nota ou -1 para sair
            grade = input.nextInt(); //Lê a nota inserida pelo usuário
        }

        //Fase de término
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter; //Usa numero com ponto flutuante para calcular a média das notas
            System.out.println("Total of all " + gradeCounter + " grades is " + total);
            System.out.println("Class average is " + average);
        } else {
            System.out.println("No grades were entered");
        }

        input.close(); //Fecha o Scanner para liberar recursos
    }
}//Fim da classe ClassAverage1
