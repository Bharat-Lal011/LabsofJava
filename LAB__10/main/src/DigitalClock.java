import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {

    JLabel timeLabel, dateLabel;

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel();
        dateLabel = new JLabel();

        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setForeground(Color.BLUE);

        dateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dateLabel.setForeground(Color.RED);

        add(timeLabel);
        add(dateLabel);

        // Timer updates every second
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        setVisible(true);
    }

    public void updateClock() {
        Date now = new Date();

        // Digital clock format
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String time = timeFormat.format(now);

        // Date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(now);

        timeLabel.setText("Time: " + time);
        dateLabel.setText("Date: " + date);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}