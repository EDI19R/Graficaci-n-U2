import javax.swing.JFrame;
import java.awt.*;

public class texto extends JFrame {
    public texto() {
        super("Manejo de textos...");

        setSize(600, 600);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        g.drawString("MIGUE", 100, 100);
        g.setColor(Color.MAGENTA);
        g.drawString("ROSALES", 100, 150);
        g.setFont(new Font("Consolas", Font.BOLD + Font.ITALIC, 35));
        g.setColor(Color.ORANGE);
        g.drawString("EDI", 100, 200);
    }

    public static void main(String[] args) {
        texto ventana = new texto();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
