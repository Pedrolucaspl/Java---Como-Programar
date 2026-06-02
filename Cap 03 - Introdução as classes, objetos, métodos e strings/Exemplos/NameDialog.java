//Obtendo a entrada do usuário a partir de uma caixa de diálogo
import javax.swing.JOptionPane;
public class NameDialog {
    public static void main(String[] args) {
        //pede ao usuário que insira seu nome
        String name = JOptionPane.showInputDialog("What is your name?");

        //cria a mensagem a ser exibida
        String message = String.format("Welcome, %s, to Java Programming!", name);

        //exibe a mensagem para cumprimentar o usuário
        JOptionPane.showMessageDialog(null, message);
        
    }
}
