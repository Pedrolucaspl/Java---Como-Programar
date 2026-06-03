import java.util.Scanner;

public class HealthProfileTeste {
public static void main(String[] args) {
    int ano, mes, dia;
    String nome, sobrenome, sexo;
    double altura, peso;

    Scanner input = new Scanner(System.in);
    System.out.println("--Perfil de Saúde---");
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
    System.out.println("Digite seu sexo: ");
    sexo = input.next();
    System.out.println("Digite sua altura: ");
    altura = input.nextDouble();
    System.out.println("Digite seu peso: ");
    peso = input.nextDouble();
    
    HealthProfile hp = new HealthProfile(nome, sobrenome, dia, mes, ano, sexo, altura, peso);
    System.out.println("\n\n\n---Perfil de Saúde---");
    System.out.println("Nome: " + hp.getNome());
    System.out.println("Sobrenome: " + hp.getSobrenome());
    System.out.println("Data de Nascimento: " + hp.getDiaNascimento() + "/" + hp.getMesNascimento() + "/" + hp.getAnoNascimento());
    System.out.println("Sexo: " + hp.getSexo());
    System.out.println("Altura: " + hp.getAltura());
    System.out.println("Peso: " + hp.getPeso());
    System.out.println("Idade: " + hp.calcularIdade());
    System.out.println("Frequência cardíaca máxima: " + hp.fcMax());
    System.out.printf("Frequência cardíaca alvo: %.0f - %.0f\n", hp.calcularFCAlvoMin(), hp.calcularFCAlvoMax());

    hp.displayIMC();

    input.close();

}
}
