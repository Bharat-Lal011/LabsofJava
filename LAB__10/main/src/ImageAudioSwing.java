import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;

public class ImageAudioSwing extends JFrame {

    Image image;
    Clip clip;

    public ImageAudioSwing() {
        setTitle("Image and Audio Player");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load Image
        image = Toolkit.getDefaultToolkit().getImage("image.jpg");


        playAudio("audio.wav");

        setVisible(true);
    }


    public void playAudio(String filePath) {
        try {
            File file = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop audio

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 50, 100, 300, 200, this);
    }

    public static void main(String[] args) {
        new ImageAudioSwing();
    }
 }