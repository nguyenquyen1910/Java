package clockgui;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import javax.swing.Timer;

public class ClockFrame extends JFrame {
    private Clock clock;
    private JLabel clockLabel;

    public ClockFrame(){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        clock = new Clock(hour, minute, second);

        setTitle("Clock in Java GUI");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(clock, BorderLayout.CENTER);

        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        add(clockLabel, BorderLayout.SOUTH);

        startClockUpdate();
    }

    private void startClockUpdate() {
        Timer timer = new Timer(1000, e -> {
            Calendar currentTime = Calendar.getInstance();
            int newHour = currentTime.get(Calendar.HOUR_OF_DAY);
            int newMinute = currentTime.get(Calendar.MINUTE);
            int newSecond = currentTime.get(Calendar.SECOND);
            clock.setTime(newHour, newMinute, newSecond);
            clock.repaint();
            clockLabel.setText(String.format("%02d:%02d:%02d", newHour, newMinute, newSecond));
        });
        timer.start();
    }
}
