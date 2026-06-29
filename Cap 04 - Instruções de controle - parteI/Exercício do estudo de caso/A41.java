//Utilizando DrawLine para conectar os cantos de um painel
import java.awt.Graphics;
import javax.swing.JPanel;

public class A41 extends JPanel {

    public void paintComponent(Graphics g) {
        //Chama paintComponent para assegurar que o painel seja exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); //Largura total do painel
        int height = getHeight(); //Altura total do painel
        int passos = 15;
        int i = 0;
        while (i<=passos) {

            int x = i * width / passos;
            int y = height - i * height / passos;

            g.drawLine(0, 0, x, y);
            i++;
            g.drawLine(0, height, x, height - y);
            g.drawLine(width, 0, width - x, y);
            g.drawLine(width, height, width - x, height - y);
        }

        
       
    }
}//Fim da classe A41
