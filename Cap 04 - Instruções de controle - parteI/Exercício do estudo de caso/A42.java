//Utilizando DrawLine para conectar os cantos de um painel
import java.awt.Graphics;
import javax.swing.JPanel;

public class A42 extends JPanel {

    public void paintComponent(Graphics g) {
       super.paintComponent(g);

        int largura = getWidth();
        int altura = getHeight();
        int totalLinhas = 15;

        // Tamanho de cada incremento/passo
        int passoX = largura / totalLinhas;
        int passoY = altura / totalLinhas;

        int i = 0;
        while (i < totalLinhas) {
        // 1. Canto Inferior Esquerdo
            g.drawLine(0, i * passoY, (i + 1) * passoX, altura);
            
            // 2. Canto Superior Esquerdo
            g.drawLine(0, altura - (i * passoY), (i + 1) * passoX, 0);
            
            // 3. Canto Inferior Direito
            g.drawLine(largura, i * passoY, largura - ((i + 1) * passoX), altura);
            
            // 4. Canto Superior Direito
            g.drawLine(largura, altura - (i * passoY), largura - ((i + 1) * passoX), 0);

            i++;
        }
    }
}