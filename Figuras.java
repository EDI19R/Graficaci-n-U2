import java.awt.*;
import javax.swing.*;

public class Figuras extends JFrame {
        public Figuras() { // Dibujo de la ventana
        super("Dibujo de figuras."); // Titulo
        setSize(600, 600); // Tamaño
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void paint(Graphics g) { // Método para dibujar en la ventana
        super.paint(g);
        g.setColor(Color.black); // Elegir color
        g.drawLine(50, 100, 100, 100); // Línea
        
        g.drawRect(100, 150, 100, 50); // Rectángulo
        g.setColor(Color.red);
        g.fillRect(230, 150, 100, 50); // Rectángulo relleno
        g.setColor(Color.pink);
        g.drawRoundRect(350, 150, 100, 50, 20, 20); // Rectángulo con esquinas redondeadas
        g.setColor(Color.ORANGE);
        g.fillRoundRect(100, 230, 100, 50, 50, 50);// Rectángulo relleno con esquinas redondeadas
        g.setColor(Color.darkGray);
        g.drawOval(230, 230, 50, 50); // Circulo
        g.setColor(Color.MAGENTA);
        g.fillOval(300, 230, 50, 50); // Circulo relleno 
        g.setColor(Color.black);
        g.drawArc(100, 300, 80, 80, 0, 180); // Arco 
        g.setColor(Color.yellow);
        g.fillArc(200, 300, 80, 80, 0, -300); // Arco con relleno
        //
        g.setColor(Color.CYAN);
        g.fillRect(100, 400, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(110, 410, 80, 80);
        g.setColor(Color.black);
        g.fillOval(130, 436, 8, 8);
        g.fillOval(160, 436, 8, 8);
        g.drawArc(130, 440, 40, 40, 0, -180);
        
    }

    public static void main(String[] args) {
        Figuras ventana = new Figuras();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
