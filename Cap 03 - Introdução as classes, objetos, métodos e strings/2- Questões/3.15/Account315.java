public class Account315 {
    private String name; //variável de instância
    private double balance; //variável de instância

    //Construtor de Account que recebe dois parâmetros
    public Account315(String name, double balance) {
        this.name = name; //armazena o nome
        //Valida que o saldo é maior que 0.0; se não for, saldo permanece com seu valor inicial padrão de 0.0
        if (balance > 0.0) { //se o saldo for válido
            this.balance = balance; //armazena o saldo
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { //se o valor do depósito for válido
            balance = balance + depositAmount; //adiciona ao saldo
        }
    }
    
    //método retorna o saldo da conta
    public double getBalance() {
        return balance; //retorna o saldo da conta
    }

    //método para definir o nome do objeto
    public void setName(String name) {
        this.name = name; //armazena o nome
    }

    //método para recuperar o nome do objeto
    public String getName() {
        return name; //retorna o valor do nome para quem chamou
    }//fim do método getName
}   //fim da classe Account
