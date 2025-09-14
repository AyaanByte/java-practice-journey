import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Test extends JPanel {
    public void paint(Graphics g) {
        Image img = createImageWithText();
        g.drawImage(img, 80,80,this);
    }
    private Image createImageWithText(){
        BufferedImage bufferedImage = new
                BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        g.drawString("Hii MR", 40,40);
        g.drawString("Hii MR", 40,60);
        g.drawString("Hii MR", 40,80);
        g.drawString("Hii MR", 40,100);
        g.drawString("Hii MR", 40,120);
        return bufferedImage;
    }
}
public class Sample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Test());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
