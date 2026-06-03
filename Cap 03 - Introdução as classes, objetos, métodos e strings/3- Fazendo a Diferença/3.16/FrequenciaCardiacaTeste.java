import java.util.Scanner;

public class FrequenciaCardiacaTeste {
    public static void main(String[] args){
        int ano, mes, dia;
        String nome, sobrenome;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = input.nextLine();
        System.out.println("Digite seu dia de nascimento: ");
        dia = input.nextInt();
        System.out.println("Digite seu mês de nascimento: ");
        mes = input.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        ano = input.nextInt();

        FrequenciaCardiaca fc = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);
        System.out.println("Nome: " + fc.getNome());
        System.out.println("Sobrenome: " + fc.getSobrenome());
        System.out.println("Data de nascimento: " + fc.getDiaNascimento() + "/" + fc.getMesNascimento() + "/" + fc.getAnoNascimento());
        System.out.println("Idade: " + fc.calcularIdade());
        System.out.println("Frequência cardíaca máxima: " + fc.fcMax());
        System.out.printf("Frequência cardíaca alvo: %.0f - %.0f\n", fc.calcularFCAlvoMin(), fc.calcularFCAlvoMax());
    
        input.close();


    }
}
