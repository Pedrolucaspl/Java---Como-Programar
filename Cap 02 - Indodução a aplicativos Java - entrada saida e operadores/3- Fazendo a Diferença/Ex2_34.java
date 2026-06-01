public class Ex2_34 {
    public static void main(String[] args) {
        double populacao, populacaoAnual1, populacaoAnual2, populacaoAnual3, populacaoAnual4, populacaoAnual5, taxaCrescimento;

        populacao = 8.3; // População mundial atual
        taxaCrescimento = 0.0084; // Taxa de crescimento anual (0.84%)

        System.out.println("População mundial atual: " + populacao);
        System.out.println("População mundial projetada para o próximo ano: " + (populacao * (1 + taxaCrescimento)));
        System.out.println("População mundial projetada para daqui a 2 anos: " + (populacao * (1 + taxaCrescimento) * (1 + taxaCrescimento)));
        System.out.println("População mundial projetada para daqui a 3 anos: " + (populacao * (1 + taxaCrescimento) * (1 + taxaCrescimento) * (1 + taxaCrescimento)));
        System.out.println("População mundial projetada para daqui a 4 anos: " + (populacao * (1 + taxaCrescimento) * (1 + taxaCrescimento) * (1 + taxaCrescimento) * (1 + taxaCrescimento)));
        System.out.println("População mundial projetada para daqui a 5 anos: " + (populacao * (1 + taxaCrescimento) * (1 + taxaCrescimento) * (1 + taxaCrescimento) * (1 + taxaCrescimento) * (1 + taxaCrescimento)));

    }
}