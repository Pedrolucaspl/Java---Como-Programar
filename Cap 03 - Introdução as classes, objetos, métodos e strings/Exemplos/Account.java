//Classe Account que contem uma variavel de intancia name
//e métodos para configurar e obter o seu valor

public class Account {
    private String name; //variável de instância

    //método para definir o nome do objeto
    public void setName(String name) {
        this.name = name; //armazena o nome
    }

    //método para recuperar o nome do objeto
    public String getName() {
        return name; //retorna o valor do nome para quem chamou
    }
}//fim da classe Account
