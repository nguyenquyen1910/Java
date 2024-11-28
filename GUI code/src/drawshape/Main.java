package drawshape;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawShape frame = new DrawShape();
            frame.setVisible(true);
        });
    }
}
