//Operadores de pré-incremento e pós-decremento
public class Incremento {
    
    public static void main(String[] args) {
        //Demonstra o operador de pós-incremento
        int c = 5;
        System.out.printf("c antes do pós-incremento: %d%n", c);//imprime 5
        System.out.printf("c durante o pós-incremento: %d%n", c++);//imprime 5 
        System.out.printf("c após o pós-incremento: %d%n", c);//imprime 6    

        System.out.println(); //imprime uma linha em branco

        //Demonstra o operador de pré-incremento
        c = 5;
        System.out.printf("c antes do pré-incremento: %d%n", c);//imprime 5
        System.out.printf("c durante o pré-incremento: %d%n", ++c);//imprime 6
        System.out.printf("c após o pré-incremento: %d%n", c);//imprime 6
    }
}
