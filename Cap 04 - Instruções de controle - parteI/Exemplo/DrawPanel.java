//Utilizando DrawLine para conectar os cantos de um painel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        //Chama paintComponent para assegurar que o painel seja exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); //Largura total do painel
        int height = getHeight(); //Altura total do painel

        //Desenha uma linha do canto superior esquerdo para o canto inferior direito
        g.drawLine(0, 0, width, height);

        //Desenha uma linha do canto inferior esquerdo para o canto superior direito
        g.drawLine(0, height, width, 0);
    }
}//Fim da classe DrawPanel
