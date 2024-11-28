package clockgui;

import javax.swing.*;
import java.awt.*;

public class Clock extends JPanel {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth()/2;
        int centerY = getHeight()/2;
        int radius = Math.min(centerX, centerY) - 10;

        g.setColor(Color.BLACK);
        g.drawOval(centerX-radius, centerY-radius, radius*2, radius*2);

        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("3", centerX + radius - 15, centerY + 5);
        g.drawString("6", centerX - 5, centerY + radius - 5);
        g.drawString("9", centerX - radius + 5, centerY + 5);
        g.drawString("12", centerX - 10, centerY - radius + 15);

        drawHand(g, centerX, centerY, radius * 0.5, (hour % 12 + minute / 60.0) * 30, Color.BLACK);
        drawHand(g, centerX, centerY, radius * 0.7, (minute + second / 60.0) * 6, Color.BLUE);
        drawHand(g, centerX, centerY, radius * 0.9, second * 6, Color.RED);
    }

    private void drawHand(Graphics g, int x, int y, double length, double angleDegrees, Color color) {
        double angleRadians = Math.toRadians(angleDegrees - 90);
        int endX = x + (int) (length * Math.cos(angleRadians));
        int endY = y + (int) (length * Math.sin(angleRadians));

        g.setColor(color);
        g.drawLine(x, y, endX, endY);
    }
}
