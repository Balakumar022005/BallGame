import java .awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class scratch extends Frame implements MouseMotionListener
{ int cirX = 100, cirY = 100, cirRad = 20;
    scratch() {
       addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });
        addMouseMotionListener(this);
        setSize(100,100);
        setLayout(null);
        setTitle("Ball Game");
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(cirX, cirY, 2 * cirRad, 2 * cirRad);
    }
    public void mouseDragged(MouseEvent e)
    {}
    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x < cirX+cirRad) {
            cirX++;
        }
        if (x > cirX+cirRad) {
            cirX--;
        }
        if (y < cirY + cirRad) {
            cirY++;
        }
        if (y > cirY + cirRad) {
            cirY--;
        }
        repaint();
    }
    public static void main(String[] args) {
        new scratch();
    }
}