import java.applet.Applet;
import java.awt.*;

public class FontResizeApplet extends Applet implements Runnable {
    int size = 6;
    boolean grow = true;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            if (grow) {
                size++;
                if (size == 96) grow = false;
            } else {
                size--;
                if (size == 6) grow = true;
            }
            repaint();
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, size));
        g.drawString("Hello", 50, 100);
    }
}
