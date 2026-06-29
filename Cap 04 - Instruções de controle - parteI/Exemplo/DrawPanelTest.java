//Craindo um JFrame para exibir um DrawPanel
import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args) {
        //Cria um painel que contenha nosso desenho
        DrawPanel panel = new DrawPanel();

        //Cria um novo quadrado para armazenar o painel
        JFrame application = new JFrame();

        //Configura o frame para ser fechado quando o usuário clicar no X
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); //Adiciona o painel ao frame
        application.setSize(400, 400); //Configura o tamanho do frame
        application.setVisible(true); //Torna o frame visível
    }
}
