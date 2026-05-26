//Programa de adição que insere dois numeros e exibe a soma
import java.util.Scanner; //importa a classe Scanner

public class Addition {
    //metodo main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        //criar um scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int number1; //primeiro numero a ser adicionado
        int number2; //segundo numero a ser adicionado
        int sum; //variavel para armazenar a soma dos numeros

        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt(); //le o primeiro numero do usuario

        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //le o segundo numero do usuario

        sum = number1 + number2; //soma os numeros, depois armazena o resultado em sum

        System.out.printf("Sum is %d%n", sum); //exibe a soma
    }//fim do metodo main
}// fim da classe Addition
