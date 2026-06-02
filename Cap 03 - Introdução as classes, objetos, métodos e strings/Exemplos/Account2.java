//a classe Account2 com um construtor para inicializar o nome

public class Account2 {
    private String name; //variável de instância

    //o construtor inicializa name com nome do parametro
    public Account2(String name) { //o nome do construtor é o mesmo da classe
        this.name = name; //armazena o nome
    }

    //método para definir o nome do objeto
    public void setName(String name) {
        this.name = name; //armazena o nome
    }

    //método para recuperar o nome do objeto
    public String getName() {
        return name; //retorna o valor do nome para quem chamou
    }
}//fim da classe Account
