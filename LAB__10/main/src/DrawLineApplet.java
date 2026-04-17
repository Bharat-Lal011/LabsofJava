import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DrawLineApplet extends Applet implements MouseListener, MouseMotionListener {
    int x1, y1, x2, y2;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}