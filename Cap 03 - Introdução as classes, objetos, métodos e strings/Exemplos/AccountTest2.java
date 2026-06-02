//Usando o construtor Account para inicializar a instância name
//variavel no momento em que cada objeto Account é criado
public class AccountTest2 {
    public static void main(String[] args) {
        //Cria dois objetos Account2
        Account2 account1 = new Account2("Jane Green");
        Account2 account2 = new Account2("John Blue");

        //Exibe o nome de cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}//fim da classe AccountTest2
