//Resolvendo o problema de média da classe usando a repetição controlada por controlador
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        //Cria um Scanner para obter entrada a partir do usuário
        Scanner input = new Scanner(System.in);

        //Fase de inicialização
        int total = 0; //Soma dos valores inseridos
        int gradeCounter = 1; //Número de notas inseridas

        // fase de processamento utiliza repetição controlada por contador
        while (gradeCounter <= 10) {
            System.out.print("Enter grade: "); //Solicita ao usuário que insira uma nota
            int grade = input.nextInt(); //Lê a nota inserida pelo usuário
            total = total + grade; //Adiciona a nota ao total
            gradeCounter = gradeCounter + 1; //Incrementa o contador de notas
        }

        //Fase de término
        int average = total / 10; //Divisão de inteiros produz um resultado inteiro

        //Exibe o total e a média das notas
        System.out.println("Total of all 10 grades is " + total);
        System.out.println("Class average is " + average);

        input.close(); //Fecha o Scanner para liberar recursos
    }
}//Fim da classe ClassAverage