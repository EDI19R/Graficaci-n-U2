import java.awt.*;
import java.awt.swing.*;
import javax.swing.JFrame;

public class poligono extends JFrame {
    public poligono() {
        super("Dibujo de poligonos y polilineas...");

        setSize(600, 600);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void paint(Graphics g) {
        super.paint(g);
        //Dibujo de poligonos
        int puntosX[]={50,75,100};
        int puntosY[]={50,100,50};
        Polygon triangulo=new Polygon(puntosX,puntosY,3);
        g.setColor(Color.pink);
        g.fillPolygon(triangulo);
        //Dibujo de polilineas
        int lineasX2[]={200,220,230,210,190,200};
        int lineasY2[]={120,120,140,160,140,120};
        g.setColor(Color.MAGENTA);
        g.drawPolyline(lineasX2,lineasY2,6);
        //Dibujar una estrella
        int estX[]={300,320,380,330,355,300,245,270,220,280,300};
        int estY[]={300,360,360,400,460,420,460,400,360,360,300};
        g.setColor(Color.GREEN);
        g.drawPolyline(estX,estY,11);
    }
    public static void main(String[] args) {
        poligono ventana= new poligono();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
