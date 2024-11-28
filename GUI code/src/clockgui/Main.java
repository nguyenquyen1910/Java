package clockgui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClockFrame frame = new ClockFrame();
            frame.setVisible(true);
        });
    }
}
